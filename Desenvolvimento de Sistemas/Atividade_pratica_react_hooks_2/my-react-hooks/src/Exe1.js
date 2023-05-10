import React, { useState } from 'react';

function Exe1() {
    const [techs, setTechs] = useState(['ReactJS', 'ReactNative', 'NodeJS'])

    return (
        <div className="app">
            <h3>Exe1</h3>
            {techs.map((tech) => (
                <ul>{tech}</ul>
            ))}
            <h3>######################################</h3>
        </div>
      );

}

export default Exe1
