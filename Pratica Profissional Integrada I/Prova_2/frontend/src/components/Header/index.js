import React from "react";
import { useHistory } from "react-router-dom";
import { useAuth } from "../../contexts/auth";

const Header = () => {
  const history = useHistory();
  const { Logout } = useAuth();
  async function handleLogout() {
    Logout();
    history.push("/");
  }

  async function handleHome(e) {
    e.preventDefault();
    history.push("/");
  }

  async function handleLogin(e) {
    e.preventDefault();
    history.push("/login");
  }

  async function handleMyArts(e) {
    e.preventDefault();
    history.push("/myarts");
  }

  return (
    <nav className="navbar navbar-expand-lg navbar-light bg-light">
      <div className="container-fluid">
        <button
          className="btn btn-link navbar-brand active"
          aria-current="page"
          onClick={handleHome}
        >
          PALCO
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
                onClick={handleMyArts}
              >
                Minhas Artes
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
