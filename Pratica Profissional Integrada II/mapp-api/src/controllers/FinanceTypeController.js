const mongoose = require('mongoose');

const FinanceType = mongoose.model('FinanceType');
module.exports = {
  async index(req, res) {
    const financeType = await FinanceType.find({});
    return res.json(financeType);
  },

  async store(req, res) {
    const financeType = await FinanceType.create(req.body);
    return res.json(financeType);
  },

  async show(req, res) {
    const financeType = await FinanceType.findById(req.params.id);
    return res.json(financeType);
  },

  async update(req, res) {
    const financeType = await FinanceType.findByIdAndUpdate(
      req.params.id,
      req.body,
      {
        new: true,
      },
    );
    return res.json(financeType);
  },

  async delete(req, res) {
    await FinanceType.findByIdAndDelete(req.params.id);
    return res.send({ msg: 'Registro apagado com sucesso!' });
  },
};
