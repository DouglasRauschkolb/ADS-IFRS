const mongoose = require('mongoose');
const jwt = require('jsonwebtoken');
const bcrypt = require('bcryptjs');
require('dotenv/config');


const User = mongoose.model('User');

module.exports = {
  async login(req, res) {
    const { email, password } = req.body;

    const user = await User.find({ email: email, password: password }).exec();

    // Cambiara (estou triste)
    const findUser = JSON.stringify(user[0]);
    let findUserJson = null;
    if (findUser) {
      findUserJson = JSON.parse(findUser);
    }

    if (findUser) {
      const accessToken = jwt.sign(
        { firstName: findUserJson.firstName, email: findUserJson.email },
        process.env.AUTH_SECRET
      );
      const user = {
        id: findUserJson._id,
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
