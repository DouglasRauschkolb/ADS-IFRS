const User = require('./../models/user');

module.exports = {
  async index(req, res) {
    const users = await User.findAll();
    return res.json(users);
  },

  async store(req, res) {
    const user = await User.create(req.body);
    return res.json(user);
  },

  async show(req, res) {
    const user = await User.findByPk(req.params.id);
    return res.json(user);
  },

  async update(req, res) {
    const user = await User.findByPk(req.params.id);
    await user.update(req.body);
    return res.json(user);
  },

  async delete(req, res) {
    const user = await User.findByPk(req.params.id);
    await user.destroy();
    return res.json(user);
  },
};
