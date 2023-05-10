import React, { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import api from "../../services/api";

import "./styles.css";

const Finance = () => {
  const navigate = useNavigate();

  const [typeId, setTypeId] = useState();
  const [value, setValue] = useState();
  const [observations, setObservations] = useState();
  const [error, setError] = useState();

  const [list, setList] = useState([]);

  const [typeList, setTypeList] = useState([]);

  const userId = localStorage.getItem("@App:idUser");

  useEffect(() => {
    api.get("finance").then((response) => {
      const responseData = response.data;
      setList(
        responseData.filter((finance) => finance.userId === userId)
      );
    });
  }, []);

  useEffect(() => {
    api.get("finance-type").then((response) => {
      const responseData = response.data;
      setTypeList(
        responseData.filter((type) => type.userId === userId)
      );
    });
  }, []);

  async function handleRegisterFinanceType(e) {
    e.preventDefault()
    if (!typeId || !value) {
      setError("Preencha todos os dados");
    } else {
      try {
        const typeValue = typeList.filter((type) => type._id === typeId)
        const description = typeValue[0]?.description;
        const type = typeValue[0]?.type;

        if (!description || !type) {
          throw new Error("Não foi possível encontrar o tipo de despesa");
        }
        await api.post("/finance", { description, value, type, observations, userId });
        navigate("/dashboard");
      } catch (err) {
        setError(err.message || "Ocorreu um erro ao cadastrar movimentação.");
      }
    }
  };

  async function handleEditFinance(id) {
    navigate(`/finance/${id}`);
  }

  async function handleDeleteFinance(id) {
    try {
      await api.delete(`finance/${id}`, {});

      setList(
        list.filter((list) => list._id !== id)
      );
    } catch (err) {
      alert("Erro ao deletar a movimentação, tente novamente.");
    }
  }

  return (
    <div>
      <div className="form-container form-container-finance">
        <h1>Movimentações</h1>
        <form onSubmit={handleRegisterFinanceType}>
          {error && <p>{error}</p>}
          <div className="mb-3">
            <select 
              className="form-select"
              defaultValue=""
              onChange={e => setTypeId(e.target.value)}
            >
              <option value="" >Selecione o tipo de despesa</option>
              {typeList.map((type) => (
                <option key={type._id} value={type._id} >{type.description}</option>
              ))}
            </select>
          </div>
          <div className="mb-3">
            <input
              type="number"
              className="form-control"
              placeholder="Valor"
              onChange={e => setValue(e.target.value)}
            />
          </div>
          <div className="mb-3">
            <input
              type="text"
              className="form-control"
              placeholder="Observações"
              onChange={e => setObservations(e.target.value)}
            />
          </div>
          <button type="submit" className="btn btn-primary" >
            Cadastrar
          </button>
        </form>
      </div>

      <div className="list-container list-container-finance">
        <table className="table table-dark table-striped">
          <thead>
            <tr>
              <th scope="col">Descrição</th>
              <th scope="col">Tipo</th>
              <th scope="col">Valor</th>
              <th scope="col">Observações</th>
            </tr>
          </thead>
          <tbody>
            {list.map((item) => (
              <tr key={item._id} >
                <th>{item.description}</th>
                <td>{item.type}</td>
                <td>{item.value}</td>
                <td>{item.observations}</td>
                <td> 
                  <button
                    className="btn btn-warning"
                    onClick={() => handleEditFinance(item._id)}
                    type="reset"
                  >
                    Editar
                  </button>
                  <button
                    className="btn btn-danger"
                    onClick={() => handleDeleteFinance(item._id)}
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

export default Finance;