import React from "react";
import { BrowserRouter, Route, Routes, Navigate } from "react-router-dom";
import { isAuthenticated } from "../contexts/auth";
import Home from "../pages/Home";
import Login from "../pages/Login";
import SignUp from "../pages/SignUp";
import Dashboard from "../pages/Dashboard";
import Finance from "../pages/Finance";
import EditFinance from "../pages/EditFinance";
import FinanceType from "../pages/FinanceType";
import EditFinanceType from "../pages/EditFinanceType";
import Header from "../components/Header";

function PrivateRoute({ children }) {
  return isAuthenticated() ? children : <Navigate to="/login" />;
};

const AppRoutes = () => (
  <BrowserRouter>
    <Header />
    <Routes>
      <Route exact path="/" element={<Home />} />
      <Route exact path="/login" element={<Login />} />
      <Route exact path="/signup" element={<SignUp />} />
      <Route
        path="/dashboard"
        element={
          <PrivateRoute>
            <Dashboard />
          </PrivateRoute>
        }
      />
      <Route
        path="/finance"
        element={
          <PrivateRoute>
            <Finance />
          </PrivateRoute>
        }
      />
      <Route
        path="/finance/:id"
        element={
          <PrivateRoute>
            <EditFinance />
          </PrivateRoute>
        }
      />
      <Route
        path="/financetype"
        element={
          <PrivateRoute>
            <FinanceType />
          </PrivateRoute>
        }
      />
      <Route
        path="/financetype/:id"
        element={
          <PrivateRoute>
            <EditFinanceType />
          </PrivateRoute>
        }
      />
      <Route path="*" element={() => <h1>Page not found</h1>} />
    </Routes>
  </BrowserRouter>
);

export default AppRoutes;