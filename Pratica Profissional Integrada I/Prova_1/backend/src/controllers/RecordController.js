const mongoose = require('mongoose');

const Record = mongoose.model('Record');

module.exports = {

    async index(req, res) {
        const { page = 1 } = req.query;
        const records = await Record.paginate({}, { page, limit: 10 });
        return res.json(records);
    },

    async store(req, res) {
        const record = await Record.create(req.body);
        return res.json(record);
    },

    async show(req, res) {
        const record = await Record.findById(req.params.id);
        return res.json(record);
    },

    async update(req, res) {
        const record = await Record.findByIdAndUpdate(req.params.id, req.body, { new: true });
        return res.json(record);
    },

    async delete(req, res) {
        await Record.findByIdAndDelete(req.params.id);
        return res.send({ msg: "Registro apagado com sucesso!" });
    }
}