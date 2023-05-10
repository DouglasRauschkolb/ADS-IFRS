import React, { useState, useEffect } from "react";

import api from "../../services/api";

import "./styles.css";

const Home = () => {
  const [presentations, setPresentations] = useState([]);

  useEffect(() => {
    api.get("presentations/").then((response) => {
      setPresentations(response.data);
    });
  }, []);

  return (
    <div>
      <div className="container">
        <div className="title-container">
          <h1>BEM VINDO AO MAIOR PALCO!!!!</h1>
          <h3>Divulgue sua Arte!! Se emocione com todas!!! </h3>
        </div>
        <div class="row row-cols-1 row-cols-md-3 g-4">
          {presentations.map((presentation) => (
            <div class="col">
              <div className="card">
                <img src="..." className="card-img-top" alt="..." />
                <div className="card-body">
                  <h5 className="card-title">{presentation.title}</h5>
                  <p className="card-text">{presentation.shortText}</p>
                  <a href="/" className="btn btn-primary">
                    Ver Mais
                  </a>
                </div>
              </div>
            </div>
          ))}
        </div>
      </div>
    </div>
  );
};

export default Home;
