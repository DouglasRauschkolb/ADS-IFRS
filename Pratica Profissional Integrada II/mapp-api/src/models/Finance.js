const mongoose = require('mongoose');
const mongoosePaginate = require('mongoose-paginate');

// Define o schema do Curso
const FinanceSchema = new mongoose.Schema({
  description: {
    type: String,
    required: true,
  },
  value: {
    type: Number,
    required: true,
  },
  type: {
    type: String,
    required: true,
  },
  observations: {
    type: String,
    required: false,
  },
  userId: {
    type: String,
    required: true,
  },
  createdAt: {
    type: Date,
    default: Date.now,
  },
});

FinanceSchema.plugin(mongoosePaginate);
mongoose.model('Finance', FinanceSchema);
