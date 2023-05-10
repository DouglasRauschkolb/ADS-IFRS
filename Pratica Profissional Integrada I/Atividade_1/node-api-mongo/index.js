const express = require("express");
const mongoose = require('mongoose');
const requireDir = require("require-dir");
const cors = require("cors");

require('dotenv/config');

// Cria uma aplicação Express
const app = express();

//Permitir enviar dados para a App no formato JSON
app.use(express.json())

//Permite o uso do CORS (acesso a domínios externos da nossa API)
app.use(cors());

//Cria a conexão com o banco de dados
const uri = process.env.STRING_MONGODB;
mongoose.connect(uri, { useNewUrlParser: true, useUnifiedTopology: true });
const db = mongoose.connection;

//trata os erros da conexão
mongoose.connection.on('error', function (err) {
    console.log('Erro na conexão Mongoose padrão: ' + err);
});

//A conexão foi feita com sucesso
db.once('open', function () {
    console.log('Estamos conectados no banco de dados!')
});

//Registra o Model em index.js
requireDir('./src/models');

// Redireciona o caminho http://localhost:3000/api para o routes
app.use('/api', require('./src/routes'));

// Inicia o servidor na porta '3000'
app.listen(3000, () => {
    console.log("Exemplo de aplicativo ouvindo a porta 3000");
});