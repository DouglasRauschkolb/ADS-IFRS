import React from 'react';
import ReactDOM from 'react-dom';
import Blog from './componentes/Blog';

const myPosts = [
  {
    imagem: "https://images.pexels.com/photos/3880017/pexels-photo-3880017.jpeg",
    autor: "Márcio Santos",
    titulo: "Escalando...",
    texto: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut faucibus semper ex, et sagittis mauris lobortis eu.Nulla ex ipsum, varius a mattis quis, ultricies non leo.Fusce aliquam lorem sit amet ullamcorper pulvinar."
 },
  {
    imagem: "https://images.pexels.com/photos/2748019/pexels-photo-2748019.jpeg",
    autor: "Rosana Marques",
    titulo: "Lindo passeio",
    texto: "Donec elit turpis, luctus at orci et, commodo laoreet tortor.Donec et quam euismod, mollis mauris id, congue ipsum."
 },
  {
    imagem: "https://images.pexels.com/photos/3722888/pexels-photo-3722888.jpeg",
    autor: "Beatriz Gomes",
    titulo: "Muito Romântico",
    texto: "Quisque eros ligula, tempus id ultrices sed, ultricies sed lorem. Maecenas turpis lectus, finibus a semper ac, vulputate id dui."
 }
]
const elemento = document.getElementById('root');
ReactDOM.render(
  <Blog posts={myPosts} />
, elemento);