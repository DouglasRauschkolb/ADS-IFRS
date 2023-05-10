import React from "react";
import ContactForm from "./ContactForm";
import ContactTable from "./ContactTable";
import { ContactContextProvider } from "./ContactContextProvider";

function ContactView() {
    return (
        <div>
            <h3>Contatos</h3>
            <ContactForm />
            <ContactTable />
        </div>
    );
}
export default ContactView;