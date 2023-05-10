const express = require('express');

const routes = express.Router();

const UserController = require('./controllers/UserController');
const FinanceController = require('./controllers/FinanceController');
const FinanceTypeController = require('./controllers/FinanceTypeController');

const Login = require('./login');
routes.post('/login', Login.login);

routes.get('/user', UserController.index);
routes.get('/user/:id', UserController.show);
routes.post('/user', UserController.store);
routes.put('/user/:id', UserController.update);
routes.delete('/user/:id', UserController.delete);

routes.get('/finance-type', FinanceTypeController.index);
routes.get('/finance-type/:id', FinanceTypeController.show);
routes.post('/finance-type', FinanceTypeController.store);
routes.put('/finance-type/:id', FinanceTypeController.update);
routes.delete('/finance-type/:id', FinanceTypeController.delete);

routes.get('/finance', FinanceController.index);
routes.get('/finance/:id', FinanceController.show);
routes.post('/finance', FinanceController.store);
routes.put('/finance/:id', FinanceController.update);
routes.delete('/finance/:id', FinanceController.delete);

routes.get('/', (req, res) => res.send('Hello World!'));

module.exports = routes;
