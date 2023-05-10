import React from "react";
import { BrowserRouter, Route, Switch } from "react-router-dom";
import MyArts from "../pages/MyArts";
import EditPresentation from "../pages/EditPresentation";
import Home from "../pages/Home";
import Header from "../components/Header";

const SignRoutes = () => {
  return (
    <BrowserRouter>
      <Header />
      <Switch>
        <Route exact path="/" component={Home} />
        <Route exact path="/myarts" component={MyArts} />
        <Route exact path="/myarts/presentation" component={EditPresentation} />
        <Route
          exact
          path="/myarts/presentation/:id"
          component={EditPresentation}
        />
      </Switch>
    </BrowserRouter>
  );
};

export default SignRoutes;
