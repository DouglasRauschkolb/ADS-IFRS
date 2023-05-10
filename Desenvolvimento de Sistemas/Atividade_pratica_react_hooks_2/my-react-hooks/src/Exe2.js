import React, { useState } from 'react';

function Exe2() {
    const [techs, setTechs] = useState(['ReactJS', 'ReactNative', 'NodeJS'])

    return (
        <div className="app">
            <h3>Exe2</h3>
            <div>
                {techs.map((tech) => (
                    <ul>{tech}</ul>
                ))}
            </div>

            <div>
                <button onClick={() => setTechs([...techs, 'NextJS'])}> Adicionar </button>
            </div>
            <h3>######################################</h3>
        </div>

    );

}

export default Exe2
