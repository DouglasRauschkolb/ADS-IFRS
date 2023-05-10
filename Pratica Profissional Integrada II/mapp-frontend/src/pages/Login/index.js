import React, { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import { login } from "../../contexts/auth";
import api from "../../services/api";

import "./styles.css";

const Login = () => {
  const navigate = useNavigate();

  const [email, setEmail] = useState();
  const [password, setPassword] = useState();
  const [error, setError] = useState();

  async function handleLogin(e) {
    e.preventDefault();
    if (!email || !password) {
      this.setState({ error: "Preencha e-mail e senha para continuar!" });
    } else {
      try {
        const response = await api.post("/login", { email, password });
        login(response.data.accessToken, response.data.user.id);
        navigate("/dashboard");
      } catch (err) {
        setError(err.message || "Ocorreu um erro ao logar.");
      }
    }
  }

  return (
    <div>
      <div className="login-container">
        <form onSubmit={handleLogin}>
          {error && <p>{error}</p>}
          <div className="mb-3">
            <input
              type="email"
              className="form-control"
              aria-describedby="emailHelp"
              placeholder="E-mail"
              onChange={(e) => setEmail(e.target.value)}
            />
          </div>
          <div className="mb-3">
            <input
              type="password"
              className="form-control"
              placeholder="Senha"
              onChange={(e) => setPassword(e.target.value)}
            />
          </div>
          <button type="submit" className="btn btn-primary">
            Sign In
          </button>
          <hr />
          <Link className="btn btn-dark" to="/signup">Novo Aqui? </Link>
          <div className="mb-3"></div>
        </form>
      </div>
    </div>
  );
};

export default Login;