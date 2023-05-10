import React, { useContext } from "react";
import { ContactContext } from "./ContactContextProvider";

import { Link, Redirect, useParams } from "react-router-dom"

function Details() {

    const [state, dispatch] = useContext(ContactContext);

    let { id } = useParams(); 

    const contact = state.contacts.find( element => element.id == id);

    return (
        <div>
            <div>
                <h1>Detalhes do Contato</h1>
                <h3>ID:</h3> <p>{contact.id}</p>
                <h3>Nome:</h3> <p>{contact.name}</p>
                <h3>Email:</h3> <p>{contact.email}</p>
            </div>
            <Link to="/" ><button type="button" >Voltar</button></Link>
        </div>
    );
}
export default Details;