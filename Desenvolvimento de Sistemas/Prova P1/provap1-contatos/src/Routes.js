import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';

import Home from './App';
import { ContactContextProvider } from './Components/ContactContextProvider';
import Detail from './Components/Details';

function Routes() {
    return (
        <ContactContextProvider>
            <h1>Gestão de contatos</h1>
            <hr />
            <BrowserRouter>
                <Switch>
                    <Route path="/" exact component={Home} />
                    <Route path="/detail/:id" component={Detail} />
                </Switch>
            </BrowserRouter>
        </ContactContextProvider>
    );
}

export default Routes;