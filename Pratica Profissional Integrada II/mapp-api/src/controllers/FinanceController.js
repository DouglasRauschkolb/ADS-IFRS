const mongoose = require('mongoose');

const Finance = mongoose.model('Finance');
module.exports = {
  async index(req, res) {
    const finances = await Finance.find({});
    return res.json(finances);
  },

  async store(req, res) {
    const finance = await Finance.create(req.body);
    return res.json(finance);
  },

  async show(req, res) {
    const finance = await Finance.findById(req.params.id);
    return res.json(finance);
  },

  async update(req, res) {
    const finance = await Finance.findByIdAndUpdate(
      req.params.id, 
      req.body, 
      {
        new: true,
      }
    );
    return res.json(finance);
  },

  async delete(req, res) {
    await Finance.findByIdAndDelete(req.params.id);
    return res.send({ msg: 'Registro apagado com sucesso!' });
  },
};
