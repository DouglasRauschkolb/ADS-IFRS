const Presentation = require('./../models/presentations');

module.exports = {
  async index(req, res) {
    const presentations = await Presentation.findAll();
    return res.json(presentations);
  },

  async store(req, res) {
    const presentation = await Presentation.create(req.body);
    return res.json(presentation);
  },

  async show(req, res) {
    const presentation = await Presentation.findByPk(req.params.id);
    return res.json(presentation);
  },

  async update(req, res) {
    const presentation = await Presentation.findByPk(req.params.id);
    await presentation.update(req.body);
    return res.json(presentation);
  },

  async delete(req, res) {
    const presentation = await Presentation.findByPk(req.params.id);
    await presentation.destroy();
    return res.json(presentation);
  },
};
