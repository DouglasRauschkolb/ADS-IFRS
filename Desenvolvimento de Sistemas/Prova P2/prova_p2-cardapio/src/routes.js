const express = require('express');

const routes = express.Router();

var menus = require('./menus.json');

routes.get('/menus', (req, res) => {
    res.json(menus);
});

routes.get('/menus/:id', (req, res) => {

    const menuId = Number(req.params.id);

    const getMenu = menus.find((menu) => menu.id === menuId);

    if (!getMenu) {
        res.status(500).send('Esse cardápio não existe.')
    } else {
        res.json(getMenu);
    }
});

// Realizado dessa forma apenas para representação
routes.get('/something', (req, res) => {

    const { date, time } = req.query

    if (date && time) {
        var getMenu = menus.filter((menu) => menu.date === date && menu.time === time);
    } else if (date) {
        var getMenu = menus.filter((menu) => menu.date === date);
    } else if (time) {
        var getMenu = menus.filter((menu) => menu.time === time);
    } else {
        var getMenu = null;
    }

    if (!getMenu) {
        res.status(500).send('Esse cardápio não existe.')
    } else {
        res.json(getMenu);
    }

});

routes.post('/menus', (req, res) => {
    const incomingMenu = req.body;
    menus.push(incomingMenu);
    res.json(menus);
});

routes.put('/menus/:id', (req, res) => {

    const menuId = Number(req.params.id);
    const body = req.body;

    const menu = menus.find((menu) => menu.id === menuId);
    const index = menus.indexOf(menu);

    if (!menu) {
        res.status(500).send('Cardápio não foi encontrado.');
    } else {
        const updatedMenu = { ...menu, ...body };

        menus[index] = updatedMenu;

        res.send(updatedMenu);
    }
});

routes.delete('/menus/:id', (request, response) => {

    const menuId = Number(request.params.id);
    const newMenus = menus.filter((menu) => menu.id != menuId);

    if (!newMenus) {
        response.status(500).send('Cardápio não encontrado.');
    } else {
        menus = newMenus;
        response.send(menus);
    }

});

module.exports = routes;