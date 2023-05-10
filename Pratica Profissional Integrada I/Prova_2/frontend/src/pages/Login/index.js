import React, { useState } from "react";
import { useAuth } from "../../contexts/auth";

import "./styles.css";

const Login = () => {
  const context = useAuth();
  console.log(context);

  const [email, setEmail] = useState();
  const [password, setPassword] = useState();

  function handleLogin(e) {
    e.preventDefault();
    context.Login(email, password);
  }

  return (
    <div>
      <div className="login-container">
        <div className="mb-3">
          <label className="form-label">Email</label>
          <input
            type="email"
            className="form-control"
            aria-describedby="emailHelp"
            onChange={(e) => setEmail(e.target.value)}
          />
        </div>
        <div className="mb-3">
          <label className="form-label">Password</label>
          <input
            type="password"
            className="form-control"
            onChange={(e) => setPassword(e.target.value)}
          />
        </div>
        <button onClick={handleLogin} className="btn btn-primary">
          Sign In
        </button>
        <div className="button-sign-up">
          <label className="form-label">Novo Aqui?</label>
          <a href="/signup">
            <button type="button" className="btn btn-link">
              Sign Up
            </button>
          </a>
        </div>
        <div className="mb-3"></div>
      </div>
    </div>
  );
};

export default Login;
