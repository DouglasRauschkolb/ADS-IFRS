const mongoose = require('mongoose');
const mongoosePaginate = require('mongoose-paginate');

// Define o schema do Curso
const FinanceTypeSchema = new mongoose.Schema({
  description: {
    type: String,
    required: true,
  },
  type: {
    type: String,
    required: true,
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

FinanceTypeSchema.plugin(mongoosePaginate);
mongoose.model('FinanceType', FinanceTypeSchema);
