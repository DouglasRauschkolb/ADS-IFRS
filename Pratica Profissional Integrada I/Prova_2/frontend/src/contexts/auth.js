import { useState, createContext, useContext, useEffect } from "react";
import api from "../services/api";

const AuthContext = createContext({});

export const AuthProvider = ({ children }) => {
  const [user, setUser] = useState(null);

  async function Login(email, password) {
    const response = await api.post("/login", {
      email: email,
      password: password,
    });

    if (response.data.user) {
      console.log("logou");
    } else {
      return;
    }

    setUser(response.data.user);

    api.defaults.headers.Authorization = `Bearer ${response.data.accessToken}`;

    localStorage.setItem("@App:idUser", JSON.stringify(response.data.user.id));
    localStorage.setItem("@App:accessToken", response.data.accessToken);
  }

  function Logout() {
    setUser(null);
    localStorage.removeItem("@App:idUser");
    localStorage.removeItem("@App:accessToken");
  }
  useEffect(() => {
    const storagedUser = localStorage.getItem("@App:idUser");
    const storagedToken = localStorage.getItem("@App:token");
    if (storagedToken && storagedUser) {
      setUser(JSON.parse(storagedUser));
      api.defaults.headers.Authorization = `Bearer ${storagedToken}`;
    }
  }, []);

  return (
    <AuthContext.Provider
      value={{
        signed: Boolean(user),
        user,
        Login,
        Logout,
      }}
    >
      {children}
    </AuthContext.Provider>
  );
};

export function useAuth() {
  const context = useContext(AuthContext);
  return context;
}
