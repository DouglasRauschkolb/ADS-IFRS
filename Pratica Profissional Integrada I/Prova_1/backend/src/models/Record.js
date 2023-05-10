const mongoose = require('mongoose');
const mongoosePaginate = require('mongoose-paginate');

const RecordSchema = new mongoose.Schema({
    name: {
        type: String,
        required: true,
    },
    healthProfessional: {
        type: String,
        required: true,
    },
    cadsus: {
        type: String,
        required: true,
    },
    cpf: {
        type: String,
        required: true,
    },
    motherName: {
        type: String,
        required: true,
    },
    birthDate: {
        type: Date,
        required: true,
    },
    age: {
        type: Number,
        required: true,
    },
    gender: {
        type: String,
        required: true,
    },
    race: {
        type: String,
        required: true,
    },
    address: {
        type: String,
        required: true,
    },
    cep: {
        type: String,
        required: true,
    },
    complement: {
        type: String,
        required: false,
    },
    district: {
        type: String,
        required: true,
    },
    phone: {
        type: String,
        required: true,
    },
    naturalness: {
        type: String,
        required: true,
    },
    uf: {
        type: String,
        required: true,
    },
    createdAt: {
        type: Date,
        default: Date.now,
    }
});

RecordSchema.plugin(mongoosePaginate);

mongoose.model('Record', RecordSchema);