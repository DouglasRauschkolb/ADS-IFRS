import React from "react";
import { useAuth } from "../contexts/auth";
import SignRoutes from "./SignRoutes";
import OtherRoutes from "./OtherRoutes";

const Routes = () => {
  const { signed } = useAuth();
  console.log("signe");
  console.log(signed);
  return signed ? <SignRoutes /> : <OtherRoutes />;
};

export default Routes;
