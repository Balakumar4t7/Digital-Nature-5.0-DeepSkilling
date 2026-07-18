import './style.css';
import {players} from './ListOfPlayers';

    const [first,second,third,fouth,fifth,sixth,seventh,eight,ninth,tenth,eleventh] = players;
    const oddPlayer = [first,third,fifth,seventh,ninth,eleventh];
    const evenPlayer =[second,fouth,sixth,eight,tenth]
export function OddPlayer(){
    
    return (
        <div className="odd-player">
            <h2>List of Odd Players</h2>
                <ul>
                 {oddPlayer.map((p)=>{
                    return <li key={p.name}> {p.name}  : {p.score} </li>
               })}
            </ul>
        </div>
    );
}
export function MergedList(){
    const mergedPlayer=[...oddPlayer,...evenPlayer]
    return(
         <div>
            <h2>Merged List of Players</h2>
            <ul>
                 {mergedPlayer.map((p)=>{
                    return <li key={p.name}> {p.name}  : {p.score} </li>
               })}
            </ul>
        </div>
    );
}
export function EvenPlayers(){
    return (
        <div>
            <h2>Even Player List </h2>
              <ul>
                 {evenPlayer.map((p)=>{
                    return <li key={p.name}> {p.name}  : {p.score} </li>
               })}
            </ul>
        </div>
    );
}