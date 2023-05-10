const express = require('express');
const routes = require('./src/app/routes');
const db = require('./src/database');
const cors = require('cors');

const app = express();
app.use(cors());
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.use('/api', routes);

db.authenticate().then(() => {
  console.log(`Banco de dados conectado: ${process.env.DB_NAME}`);
});

app.listen(3333, () => console.log('Servidor iniciado na porta 3333'));
