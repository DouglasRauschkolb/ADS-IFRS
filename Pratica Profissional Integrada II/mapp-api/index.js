const express = require('express');
const mongoose = require('mongoose');
const requireDir = require('require-dir');
const cors = require('cors');

require('dotenv/config');

const port = process.env.PORT || '3333';

const app = express();
app.use(express.json());
app.use(cors());

const uri = process.env.STRING_MONGODB;
mongoose.connect(uri, { useNewUrlParser: true, useUnifiedTopology: true });
const db = mongoose.connection;

mongoose.connection.on('error', (err) => {
  console.log(`Erro na conexão Mongoose padrão: ${err}`);
});

db.once('open', () => {
  console.log('Estamos conectados no banco de dados!');
});

requireDir('./src/models');

app.use('/api', require('./src/routes'));

app.listen(port, () => {
  console.log('Ouvindo a porta' + port);
});
