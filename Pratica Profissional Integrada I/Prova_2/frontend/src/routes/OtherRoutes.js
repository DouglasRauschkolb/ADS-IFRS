import React from "react";
import { BrowserRouter, Route } from "react-router-dom";
import Home from "../pages/Home";
import Login from "../pages/Login";
import SignUp from "../pages/SignUp";
import Header from "../components/Header";

const OtherRoutes = () => {
  return (
    <BrowserRouter>
      <Header />
      <Route exact path="/" component={Home} />
      <Route exact path="/login" component={Login} />
      <Route exact path="/signup" component={SignUp} />
    </BrowserRouter>
  );
};
export default OtherRoutes;
