const express = require("express");
const mongoose = require('mongoose');
const requireDir = require("require-dir");
const cors = require("cors");

require('dotenv/config');

const app = express();
app.use(express.json())
app.use(cors());

//Cria a conexão com o banco de dados
const uri = process.env.STRING_MONGODB;
mongoose.connect(uri, { useNewUrlParser: true, useUnifiedTopology: true });
const db = mongoose.connection;

//Trata os erros da conexão
mongoose.connection.on('error', function (err) {
    console.log('Erro na conexão Mongoose padrão: ' + err);
});

db.once('open', function () {
    console.log('Estamos conectados no banco de dados!')
});

//Registra o Model em index.js
requireDir('./src/models');

app.use('/api', require('./src/routes'));
app.listen(3333, () => {
    console.log("Exemplo de aplicativo ouvindo a porta 3333");
});