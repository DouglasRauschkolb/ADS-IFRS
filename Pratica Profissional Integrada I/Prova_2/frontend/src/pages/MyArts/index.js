import React, { useState, useEffect } from "react";
import { useHistory } from "react-router-dom";

import api from "../../services/api";

import "./styles.css";

const MyArts = () => {
  const history = useHistory();
  const [presentations, setPresentations] = useState([]);

  const userId = localStorage.getItem("@App:idUser");

  console.log(userId);

  useEffect(() => {
    api.get("presentations/").then((response) => {
      const responseData = response.data;
      console.log(responseData);
      setPresentations(
        responseData.filter((presentation) => presentation.userId == userId)
      );
    });
  }, []);

  async function handleDeletePresentation(id) {
    try {
      console.log(id);
      await api.delete(`presentations/${id}`, {});

      setPresentations(
        presentations.filter((presentation) => presentation.id !== id)
      );
    } catch (err) {
      alert("Erro ao deletar a apresentação, tente novamente.");
    }
  }

  async function handleEditPresentation(id) {
    history.push(`/myarts/presentation/${id}`);
  }

  async function handleNewPresentation() {
    history.push("/myarts/presentation");
  }

  return (
    <div>
      <div className="myarts-container">
        <h1>Minhas Artes</h1>
        <ul className="list-group">
          {presentations.map((presentation) => (
            <li
              className="list-group-item d-flex justify-content-between align-items-center item-lista"
              key={presentation.id}
            >
              <p>{presentation.title}</p>
              <div>
                <button
                  className="btn btn-warning"
                  onClick={() => handleEditPresentation(presentation.id)}
                  type="reset"
                >
                  Editar
                </button>
                <button
                  className="btn btn-danger"
                  onClick={() => handleDeletePresentation(presentation.id)}
                  type="reset"
                >
                  Deletar
                </button>
              </div>
            </li>
          ))}
        </ul>
        <button
          className="btn btn-primary btn-lg btn-new-presentation"
          onClick={() => handleNewPresentation()}
          type="reset"
        >
          Nova Apresentação
        </button>
      </div>
    </div>
  );
};

export default MyArts;
