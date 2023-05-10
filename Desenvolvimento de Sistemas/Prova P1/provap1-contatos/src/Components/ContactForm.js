import React, { useContext, useState } from "react";
import _ from "lodash";
import { ContactContext } from "./ContactContextProvider";

function ContactForm() {
    const [state, dispatch] = useContext(ContactContext);

    const [name, setName] = useState("");
    const [email, setEmail] = useState("");

    const onAddContact = (event) => {
        event.preventDefault();
        dispatch({
            type: "ADD_CONTACT",
            payload: {
                id: _.uniqueId(10),
                name: name,
                email: email
            }

        });
    };

    return (
        <div>
            <p>Adicionar Novo Contato</p>

            <form onSubmit={onAddContact}>
                <label>
                    Nome: 
                    <input
                        type='text' name='name' 
                        onChange={(e) => setName(e.target.value)} />
                </label>< br />
                <label>
                    E-mail: 
                    <input
                        type='email' name='email'
                        onChange={(e) => setEmail(e.target.value)} />
                </label>< br />

                <input type="submit" value="Novo Contato" />
            </form>

            <hr />
        </div>
    );
}
export default ContactForm;