import React, { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import api from "../../services/api";

import "./styles.css";

const FinanceType = () => {
  const navigate = useNavigate();

  const [description, setDescription] = useState();
  const [type, setType] = useState("ENTRADA");
  const [error, setError] = useState();

  const [list, setList] = useState([]);

  const userId = localStorage.getItem("@App:idUser");

  useEffect(() => {
    api.get("finance-type").then((response) => {
      const responseData = response.data;
      setList(
        responseData.filter((financeType) => financeType.userId === userId)
      );
    });
  }, []);

  async function handleRegisterFinanceType(e) {
    e.preventDefault()
    if (!description || !type) {
      setError("Preencha todos os dados");
    } else {
      try {
        await api.post("/finance-type", { description, type, userId });
        navigate("/dashboard");
      } catch (err) {
        setError(err.message || "Ocorreu um erro ao cadastrar tipo de movimentação.");
      }
    }
  };

  async function handleEditFinanceType(id) {
    navigate(`/financetype/${id}`);
  }

  async function handleDeleteFinanceType(id) {
    try {
      await api.delete(`finance-type/${id}`, {});

      setList(
        list.filter((list) => list._id !== id)
      );
    } catch (err) {
      alert("Erro ao deletar o tipo de movimentação, tente novamente.");
    }
  }

  return (
    <div>
      <div className="form-container form-container-finance-type">
        <h1>Tipos de Movimentações</h1>
        <form onSubmit={handleRegisterFinanceType}>
          {error && <p>{error}</p>}
          <div className="mb-3">
            <input
              type="text"
              className="form-control"
              placeholder="Descrição"
              onChange={e => setDescription(e.target.value)}
            />
          </div>
          <div className="mb-3">
            <select 
              className="form-select"
              defaultValue="ENTRADA"
              onChange={e => setType(e.target.value)}
            >
              <option value="ENTRADA" >Entrada</option>
              <option value="SAIDA">Saída</option>
            </select>
          </div>
          <button type="submit" className="btn btn-primary" >
            Cadastrar
          </button>
        </form>
      </div>

      <div className="list-container list-container-finance-type">
        <table className="table table-success table-striped">
          <thead>
            <tr>
              <th scope="col">Descrição</th>
              <th scope="col">Tipo</th>
            </tr>
          </thead>
          <tbody>
            {list.map((item) => (
            <tr key={item._id} >
              <th>{item.description}</th>
              <td>{item.type}</td>
              <td> 
                <button
                  className="btn btn-warning"
                  onClick={() => handleEditFinanceType(item._id)}
                  type="reset"
                >
                  Editar
                </button>
                <button
                  className="btn btn-danger"
                  onClick={() => handleDeleteFinanceType(item._id)}
                  type="reset"
                >
                  Deletar
                </button>
                </td>
            </tr>
            ))}
          </tbody>
        </table>
      </div>

    </div>
  );
}

export default FinanceType;