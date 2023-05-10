import React, { useEffect, useState } from 'react';

function Exe3() {
    const [techs, setTechs] = useState(['ReactJS', 'ReactNative', 'NodeJS'])

    const [newTech, setNewTech] = useState("");

    useEffect(()=>{
        setNewTech("")
    },[techs])

    return (
        <div className="app">
            <h3>Exe3</h3>
            <div>
                {techs.map((tech) => (
                    <ul>{tech}</ul>
                ))}
            </div>

            <div>
                <input value={newTech} onChange={e => setNewTech(e.target.value)} />
                <button onClick={() => setTechs([...techs, newTech])}> Adicionar </button>
            </div>
        </div>

    );

}

export default Exe3
