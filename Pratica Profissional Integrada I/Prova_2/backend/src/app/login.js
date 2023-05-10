const jwt = require('jsonwebtoken');
const bcrypt = require('bcryptjs');
require('dotenv/config');
const User = require('./models/user');

module.exports = {
  async login(req, res) {
    const { email, password } = req.body;

    const user = await User.findAll({
      where: {
        email: email,
      },
    });

    //Cambiara (estou triste)
    const findUser = JSON.stringify(user[0]);
    let findUserJson = null;
    if (findUser) {
      findUserJson = JSON.parse(findUser);
    }

    if (findUser && (await bcrypt.compare(password, findUserJson.password))) {
      const accessToken = jwt.sign(
        { firstName: findUserJson.firstName, email: findUserJson.email },
        process.env.AUTH_SECRET
      );
      const user = {
        id: findUserJson.id,
        name: findUserJson.firstName,
        email: findUserJson.email,
      };

      res.json({
        accessToken,
        user,
      });
    } else {
      res.send('Nome de usuário ou senha incorretos');
    }
  },
};
