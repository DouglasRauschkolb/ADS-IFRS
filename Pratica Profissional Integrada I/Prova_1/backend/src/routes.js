const express = require('express');
const routes = express.Router();

// Referencia o Controller CourseController
const RecordController = require('./controllers/RecordController');

// associa as rotas ao seu método do Controller
routes.get('/records', RecordController.index);
routes.get('/records/:id', RecordController.show);
routes.post('/records', RecordController.store);
routes.put('/records/:id', RecordController.update);
routes.delete('/records/:id', RecordController.delete);

module.exports = routes;