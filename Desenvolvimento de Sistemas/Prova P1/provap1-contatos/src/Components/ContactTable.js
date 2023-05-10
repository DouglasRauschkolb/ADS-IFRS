import React, { useContext } from "react";
import { ContactContext } from "./ContactContextProvider";

import { Link } from "react-router-dom";

function ContactTable() {

    const [state, dispatch] = useContext(ContactContext);
    const delContact = id => {
        dispatch({
            type: "DEL_CONTACT",
            payload: id
        });
    };
    const onRemoveUser = () => {
        if (state.contacts[0] !== undefined) {
            // Exclui o primeiro registro
            const firstId = state.contacts[0].id;
            delContact(firstId);
        }
        else {
            alert("Não existem mais contatos");
        }
    };
    const rows = state.contacts.map(contact => (
        <tr key={contact.id}  >
            <td>{contact.id}</td>
            <td>{contact.name}</td>
            <td>{contact.email}</td>
            <td><Link to={`/detail/${contact.id}`} >Detalhes</Link></td>
        </tr>
    ));
    return (
        <div>
            <p>Listagem de Contatos</p>
            <table border="1">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Nome</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>{rows}</tbody>
                <tfoot>
                    <tr>
                        <th colSpan="4">
                            <button onClick={onRemoveUser}>Remover</button>
                        </th>
                    </tr>
                </tfoot>
            </table>
        </div>
    );
}
export default ContactTable;
