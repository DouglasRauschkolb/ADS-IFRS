import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import { BarChart, Bar, XAxis, YAxis } from 'recharts';
import api from "../../services/api";

import "./styles.css";

const Dashboard = () => {

  const [listIn, setListIn] = useState([]);
  const [listOut, setListOut] = useState([]);

  const [totalIn, setTotalIn] = useState(0);
  const [totalOut, setTotalOut] = useState(0);

  const [data, setData] = useState([]);

  const userId = localStorage.getItem("@App:idUser");

  useEffect(() => {
    api.get("finance").then((response) => {
      const responseData = response.data;
      setListIn(
        responseData.filter((finance) => finance.userId === userId && finance.type === "ENTRADA")
      );
      setListOut(
        responseData.filter((finance) => finance.userId === userId && finance.type === "SAIDA")
      );
    });
  }, []);

  useEffect(() => {
    setTotalIn(listIn.reduce((acc, cur) => acc + cur.value, 0));
    setTotalOut(listOut.reduce((acc, cur) => acc + cur.value, 0));
  }, [listIn, listOut]);

  useEffect(() => {
    setData([{name: 'Entradas', value: totalIn}, {name: 'Saídas', value: totalOut}]);
  }, [totalIn, totalOut]);

  const renderCustomBarLabel = ({ payload, x, y, width, height, value }) => {
    return <text x={x + width / 2} y={y} fill="#666" textAnchor="middle" dy={-6}>{value}</text>;
  };

  return (
    <div className="dashboard-container" >
      <div className="buttons">
        <Link to="/finance" className="btn btn-primary" >Movimentação</Link>
        <Link to="/financetype" className="btn btn-primary" >Tipos de Movimentações</Link>
      </div>

      <div className="bar-chart">
        <BarChart width={400} height={300} data={data}>
          <XAxis dataKey="name" />
          <YAxis />
          <Bar dataKey="value" barSize={30} fill="#000" label={renderCustomBarLabel}/>
        </BarChart>
      </div>

      <div className="tables-container" >

        <h3>Entradas</h3>
        <div className="list-container-in">
          <table className="table table-success table-striped"> 
            <thead>
              <tr>
                <th scope="col">Descrição</th>
                <th scope="col">Valor</th>
                <th scope="col">Observações</th>
              </tr>
            </thead>
            <tbody>
              {listIn.map((item) => (
                <tr key={item._id} >
                  <th>{item.description}</th>
                  <td>{item.value}</td>
                  <td>{item.observations}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>

        <h3>Saídas</h3>
        <div className="list-container-out">
          <table className="table table-danger table-striped">
            <thead>
              <tr>
                <th scope="col">Descrição</th>
                <th scope="col">Valor</th>
                <th scope="col">Observações</th>
              </tr>
            </thead>
            <tbody>
              {listOut.map((item) => (
                <tr key={item._id} >
                  <th>{item.description}</th>
                  <td>{item.value}</td>
                  <td>{item.observations}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>

      </div>
    </div>
  );
};

export default Dashboard;