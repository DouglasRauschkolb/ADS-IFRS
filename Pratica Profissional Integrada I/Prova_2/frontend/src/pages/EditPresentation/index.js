import React, { useState, useEffect } from "react";
import { useHistory, useParams } from "react-router-dom";

import "./styles.css";

import api from "../../services/api";

const EditPresentation = () => {
  const history = useHistory();

  const [title, setTitle] = useState();
  const [longText, setLongText] = useState();
  const [image, setImage] = useState();

  let { id } = useParams();

  console.log(id);

  useEffect(() => {
    if (id) {
      getPresentation(id);
    }
  }, [id]);

  async function getPresentation(id) {
    try {
      await api.get(`presentations/${id}`, {}).then((response) => {
        setTitle(response.data.title);
        setLongText(response.data.longText);
      });
    } catch (err) {
      alert("Erro ao buscar apresentação, tente novamente.");
      history.push("/myarts");
    }
  }

  const userId = localStorage.getItem("@App:idUser");

  async function handlePresentation(e) {
    e.preventDefault();

    const shortText = longText.substring(0, 20);

    const data = {
      title,
      shortText,
      longText,
      image,
      userId,
    };

    try {
      if (id) {
        await api.put(`presentations/${id}`, data, {});
      } else {
        await api.post("presentations", data, {});
      }
      history.push("/myarts");
    } catch (err) {
      alert("Erro ao cadastrar uma nova apresentação, tente novamente.");
    }
  }

  return (
    <div>
      <div className="new-presentation-container">
        <form onSubmit={handlePresentation}>
          <div className="mb-3">
            <input
              className="form-label"
              placeholder="Título"
              value={title}
              onChange={(e) => setTitle(e.target.value)}
            />
          </div>
          <div className="mb-3">
            <textarea
              className="form-label"
              placeholder="Descrição"
              value={longText}
              onChange={(e) => setLongText(e.target.value)}
            />
          </div>

          <div className="mb-3">
            <input
              type="file"
              value={image}
              onChange={(e) => setImage(e.target.value)}
            />
          </div>

          <button className="btn btn-primary" type="submit">
            Salvar
          </button>
        </form>
      </div>
    </div>
  );
};

export default EditPresentation;
