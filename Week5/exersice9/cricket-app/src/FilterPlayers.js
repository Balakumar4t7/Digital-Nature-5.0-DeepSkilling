import './style.css';

function FilterPlayers(props){

    return (
        <div>
            <h2>Players with Score More than 70  </h2>
             <ul>
                      {props.players
                          .filter(p => p.score >= 70)
                          .map(p => (
                                <li key={p.name}>{p.name} : {p.score}</li>
                          ))}
            
            </ul>
        </div>
    );
}

export default FilterPlayers;