import axios from "axios";

const api = axios.create({
  baseURL: "https://rocky-earth-83504.herokuapp.com/api"
});

export default api;