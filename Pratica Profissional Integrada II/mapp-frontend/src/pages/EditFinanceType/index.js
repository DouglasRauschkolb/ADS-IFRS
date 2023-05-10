import React, { useState, useEffect } from "react";
import { useNavigate, useParams } from "react-router-dom";
import api from "../../services/api";

import "./styles.css";

const EditFinanceType = () => {
  const navigate = useNavigate();

  const [description, setDescription] = useState();
  const [type, setType] = useState("ENTRADA");
  const [error, setError] = useState();

  let { id } = useParams();

  useEffect(() => {
    if (id) {
      getFinanceType(id);
    }
  }, [id]);

  async function getFinanceType(id) {
    try {
      await api.get(`finance-type/${id}`, {}).then((response) => {
        setDescription(response.data.description);
        setType(response.data.type);
      });
    } catch (err) {
      setError(err.message || "Ocorreu um erro ao buscar o tipo de movimentação.");
    }
  }

  const userId = localStorage.getItem("@App:idUser");

  async function handleRegisterFinanceType(e) {
    e.preventDefault();
    if (!description || !type) {
      setError("Preencha todos os dados");
    } else {
      try {
        await api.put(`/finance-type/${id}`, { description, type, userId });
        navigate("/financetype");
      } catch (err) {
        setError(err.message || "Ocorreu um erro ao atualizar tipo de movimentação.");
      }
    }

  };

  return (
    <div>
      <div className="form-container form-container-edit-finance-type">
        <form onSubmit={handleRegisterFinanceType}>
          {error && <p>{error}</p>}
          <div className="mb-3">
            <input
              type="text"
              className="form-control"
              placeholder="Descrição"
              value={description}
              onChange={e => setDescription(e.target.value)}
            />
          </div>
          <div className="mb-3">
            <select 
              className="form-select"
              defaultValue="ENTRADA"
              value={type}
              onChange={e => setType(e.target.value)}
            >
              <option value="ENTRADA" >Entrada</option>
              <option value="SAIDA">Saída</option>
            </select>
          </div>
          <button type="submit" className="btn btn-primary" >
            Atualizar
          </button>
        </form>
      </div>
    </div>
  );
}

export default EditFinanceType;