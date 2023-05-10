import React from "react";
import { useNavigate } from "react-router-dom";
import { logout } from "../../contexts/auth";

import "./styles.css";

const Header = () => {
  const navigate = useNavigate();
  
  async function handleHome(e) {
    e.preventDefault();
    navigate("/");
  }

  async function handleLogin(e) {
    e.preventDefault();
    navigate("/login");
  }

  async function handleLogout() {
    logout();
    navigate("/");
  }

  async function handleDashboard(e) {
    e.preventDefault();
    navigate("/dashboard");
  }

  return (
    <nav className="navbar navbar-expand-lg navbar-light bg-success bg-opacity-10">
      <div className="container-fluid">
        <button
          className="btn btn-link navbar-brand active"
          aria-current="page"
          onClick={handleHome}
        >
          MApp
        </button>
        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>
        <div className="collapse navbar-collapse" id="navbarNav">
          <ul className="navbar-nav">
            <li className="nav-item">
              <button
                className="btn btn-link nav-link active"
                aria-current="page"
                onClick={handleHome}
              >
                Início
              </button>
            </li>
            <li className="nav-item">
              <button
                className="btn btn-link nav-link active"
                aria-current="page"
                onClick={handleLogin}
              >
                Login
              </button>
            </li>
            <li className="nav-item">
              <button
                className="btn btn-link nav-link active"
                aria-current="page"
                onClick={handleDashboard}
              >
                Dashboard
              </button>
            </li>
            <li className="nav-item">
              <button
                className="btn btn-link nav-link active"
                aria-current="page"
                onClick={handleLogout}
              >
                Logout
              </button>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  );
};

export default Header;