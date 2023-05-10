const express = require('express');
const routes = express.Router();

const isAuthenticate = require('./isAuthenticateJWT');

const UserController = require('./controllers/UserController');
const PresentationController = require('./controllers/PresentationController');

const Login = require('./login');

// Login
routes.post('/login', Login.login);

// Users
routes.get('/users', UserController.index);
routes.get('/users/:id', UserController.show);
routes.post('/users', UserController.store);
routes.put('/users/:id', UserController.update);
routes.delete('/users/:id', UserController.delete);

// Users
routes.get('/presentations', PresentationController.index);
routes.get('/presentations/:id', isAuthenticate, PresentationController.show);
routes.post('/presentations', isAuthenticate, PresentationController.store);
routes.put('/presentations/:id', isAuthenticate, PresentationController.update);
routes.delete(
  '/presentations/:id',
  isAuthenticate,
  PresentationController.delete
);

routes.get('/', (req, res) => res.send('Hello World!'));
module.exports = routes;
