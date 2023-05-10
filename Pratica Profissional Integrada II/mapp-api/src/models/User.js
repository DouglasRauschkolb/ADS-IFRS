const mongoose = require('mongoose');
const mongoosePaginate = require('mongoose-paginate');

// Define o schema do Curso
const UserSchema = new mongoose.Schema({
  firstName: {
    type: String,
    required: true,
  },
  lastName: {
    type: String,
    required: true,
  },
  email: {
    type: String,
    required: true,
  },
  password: {
    type: String,
    required: true,
  },
  createdAt: {
    type: Date,
    default: Date.now,
  },
});

UserSchema.plugin(mongoosePaginate);
mongoose.model('User', UserSchema);
