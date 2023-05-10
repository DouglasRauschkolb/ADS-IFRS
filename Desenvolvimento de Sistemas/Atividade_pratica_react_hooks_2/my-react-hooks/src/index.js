import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import Exe1 from './Exe1';
import Exe2 from './Exe2';
import Exe3 from './Exe3';

ReactDOM.render(
  <React.StrictMode>
    <Exe1 />
    <Exe2 />
    <Exe3 />
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
