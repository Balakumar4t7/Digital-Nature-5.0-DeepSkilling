

import { Link } from 'react-router-dom';

function TrainerList(props){

    return(
        <div>
            <h2>Trainer List</h2>
            <ul>
                {props.trainers.map((trainer)=>
                 <li key={trainer.trainerld}>
                 <Link to={`/trainers/${trainer.trainerld}`}>{trainer.name}</Link>
                </li>)
                }
            </ul>
        </div>
    );
}


export default TrainerList;