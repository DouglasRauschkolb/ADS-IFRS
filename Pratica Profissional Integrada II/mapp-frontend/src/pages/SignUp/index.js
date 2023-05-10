import React, { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import api from "../../services/api";

import "./styles.css";

const SignUp = () => {
  const navigate = useNavigate();

  const [firstName, setFirstName] = useState();
  const [lastName, setLastName] = useState();
  const [email, setEmail] = useState();
  const [password, setPassword] = useState();
  const [error, setError] = useState();

  async function handleSignUp(e) {
    e.preventDefault()
    if (!firstName || !lastName || !email || !password) {
      setError("Preencha todos os dados para se cadastrar");
    } else {
      try {
        await api.post("/user", { firstName, lastName, email, password });
        navigate("/login");
      } catch (err) {
        setError(err.message || "Ocorreu um erro ao registrar sua conta.");
      }
    }
  };

  return (
    <div>
      <div className="signup-container">
        <form onSubmit={handleSignUp}>
          {error && <p>{error}</p>}
          <div className="mb-3">
            <input
              type="text"
              className="form-control"
              placeholder="Nome"
              onChange={e => setFirstName(e.target.value)}
            />
          </div>
          <div className="mb-3">
            <input
              type="text"
              className="form-control"
              placeholder="Sobrenome"
              onChange={e => setLastName(e.target.value)}
            />
          </div>
          <div className="mb-3">
            <input
              type="email"
              className="form-control"
              placeholder="Endereço de e-mail"
              onChange={e => setEmail(e.target.value)}
            />
          </div>
          <div className="mb-3">
            <input
              type="password"
              className="form-control"
              placeholder="Senha"
              onChange={e => setPassword(e.target.value)}
            />
          </div>
          <button type="submit" className="btn btn-primary" >
            Cadastrar
          </button>
          <hr />
          <Link className="btn btn-dark" to="/login">Fazer login</Link>
        </form>
      </div>
    </div>
  );
}

export default SignUp;