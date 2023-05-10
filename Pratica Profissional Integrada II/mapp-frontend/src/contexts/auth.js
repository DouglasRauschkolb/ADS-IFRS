export const isAuthenticated = () => localStorage.getItem("@App:token") !== null;

export const getToken = () => localStorage.getItem("@App:token");

export const login = (token, idUser) => {
  localStorage.setItem("@App:token", token);
  localStorage.setItem("@App:idUser", idUser);
};

export const logout = () => {
  localStorage.removeItem("@App:token");
  localStorage.removeItem("@App:idUser");
};
