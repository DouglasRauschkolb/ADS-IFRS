import React, { useState, useEffect } from "react";
import { useNavigate, useParams } from "react-router-dom";
import api from "../../services/api";

import "./styles.css";

const EditFinance = () => {
  const navigate = useNavigate();

  const [description, setDescription] = useState();
  const [value, setValue] = useState();
  const [type, setType] = useState();
  const [observations, setObservations] = useState();
  const [error, setError] = useState();

  let { id } = useParams();

  useEffect(() => {
    if (id) {
      getFinance(id);
    }
  }, [id]);

  async function getFinance(id) {
    try {
      await api.get(`finance/${id}`, {}).then((response) => {
        setDescription(response.data.description);
        setValue(response.data.value);
        setType(response.data.type);
        setObservations(response.data.observations);
      });
    } catch (err) {
      setError(err.message || "Ocorreu um erro ao buscar a movimentação.");
    }
  }

  const userId = localStorage.getItem("@App:idUser");

  async function handleRegisterFinance(e) {
    e.preventDefault();
    if (!description || !value || !type) {
      setError("Preencha todos os dados");
    } else {
      try {
        await api.put(`/finance/${id}`, { description, value, type, observations, userId });
        navigate("/finance");
      } catch (err) {
        setError(err.message || "Ocorreu um erro ao atualizar tipo de movimentação.");
      }
    }

  };

  return (
    <div>
      <div className="form-container-edit-finance">
        <form onSubmit={handleRegisterFinance}>
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
            <input
              type="number"
              className="form-control"
              placeholder="Valor"
              value={value}
              onChange={e => setValue(e.target.value)}
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
          <div className="mb-3">
            <input
              type="text"
              className="form-control"
              placeholder="Observações"
              value={observations}
              onChange={e => setObservations(e.target.value)}
            />
          </div>
          <button type="submit" className="btn btn-primary" >
            Atualizar
          </button>
        </form>
      </div>
    </div>
  );
}

export default EditFinance;