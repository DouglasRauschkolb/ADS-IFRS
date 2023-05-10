import React, { useReducer } from 'react';

import './RecordForm.css'
import api from '../services/api';

const initialState = {
    name: '',
    healthProfessional: '',
    cadsus: '',
    cpf: '',
    motherName: '',
    birthDate: '',
    age: 0,
    gender: 'Masculino',
    race: 'Branca',
    address: '',
    cep: '',
    complement: '',
    district: '',
    phone: '',
    naturalness: '',
    uf: ''
}

function reducer(state, { field, value }) {
    return {
        ...state,
        [field]: value
    }
}

function RecordForm() {
    const [state, dispatch] = useReducer(reducer, initialState);

    const onChange = (e) => {
        dispatch({ field: e.target.name, value: e.target.value })
    }

    const { name, healthProfessional, cadsus, cpf, motherName, birthDate, age,
        gender, race, address, cep, complement, district, phone, naturalness, uf } = state;

    async function handleSubmit(event) {
        try {
            await api.post('records', state);
            alert('Registro inserido com sucesso!');
        } catch (err) {
            alert('Erro ao cadastrar novo registro, tente novamente.');
        }
    }

    return (
        <div>
            <h3>Registro de Vacinado</h3>
            <div className="new-record-container">
                <form class="row g-3" onSubmit={handleSubmit}>
                    <div class="col-md-6">
                        <label class="form-label" >Nome</label>
                        <input class="form-control" type='text' name='name' value={name} onChange={onChange} required />
                    </div>
                    <div class="col-md-6">
                        <label class="form-label" >Profissional Saúde (qual)</label>
                        <input class="form-control" type='text' name='healthProfessional' value={healthProfessional} onChange={onChange} required />
                    </div>

                    <div class="col-md-6" >
                        <label class="form-label" >N° Cartão Nacional de Saúde(CADSUS)</label>
                        <input class="form-control" type='text' name='cadsus' value={cadsus} onChange={onChange} required />
                    </div>
                    <div class="col-md-6" >
                        <label class="form-label" >N° CPF</label>
                        <input class="form-control" type='text' name='cpf' value={cpf} onChange={onChange} required />
                    </div>
                    <div class="col-12">
                        <label class="form-label" >Nome Mãe</label>
                        <input class="form-control" type='text' name='motherName' value={motherName} onChange={onChange} required />
                    </div>
                    <div class="col-3">
                        <label class="form-label" >Data Nascimento</label>
                        <input class="form-control" type='date' name='birthDate' value={birthDate} onChange={onChange} required />
                    </div>
                    <div class="col-3">
                        <label class="form-label" >Idade</label>
                        <input class="form-control" type='number' name='age' value={age} onChange={onChange} required />
                    </div>
                    <div class="col-3">
                        <label class="form-label" >Sexo</label>
                        <select class="form-select" name='gender' value={gender} onChange={onChange} required>
                            <option selected >Masculino</option>
                            <option>Feminino</option>
                        </select>
                    </div>
                    <div class="col-3">
                        <label class="form-label" >Raça</label>
                        <select class="form-select" name='race' value={race} onChange={onChange} required>
                            <option selected >Branca</option>
                            <option>Preta</option>
                            <option>Parda</option>
                            <option>Amarela</option>
                        </select>
                    </div>
                    <div class="col-6" >
                        <label class="form-label" >Endereço(n°/rua)</label>
                        <input class="form-control" type='text' name='address' value={address} onChange={onChange} required />
                    </div>
                    <div class="col-6" >
                        <label class="form-label" >CEP</label>
                        <input class="form-control" type='text' name='cep' value={cep} onChange={onChange} required />
                    </div>
                    <div class="col-4" >
                        <label class="form-label" >Complemento</label>
                        <input class="form-control" type='text' name='complement' value={complement} onChange={onChange} />
                    </div>
                    <div class="col-4" >
                        <label class="form-label" >Bairro</label>
                        <input class="form-control" type='text' name='district' value={district} onChange={onChange} required />
                    </div>
                    <div class="col-4" >
                        <label class="form-label" >Telefone</label>
                        <input class="form-control" type='text' name='phone' value={phone} onChange={onChange} required />
                    </div>
                    <div class="col-6" >  
                        <label class="form-label" >Naturalidade</label>
                        <input class="form-control" type='text' name='naturalness' value={naturalness} onChange={onChange} required />
                    </div>
                    <div class="col-6" >
                        <label class="form-label" >UF</label>
                        <input class="form-control" type='text' name='uf' value={uf} onChange={onChange} required />
                    </div>
                    <input type="submit" value="Enviar" />
                </form>
            </div>
        </div>
    );
}
export default RecordForm;