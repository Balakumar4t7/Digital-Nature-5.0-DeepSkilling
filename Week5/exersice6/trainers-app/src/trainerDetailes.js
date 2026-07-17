import { useParams } from 'react-router-dom';


function TrainerDetailes(props) {
   

  const { trainerld } = useParams();

  const trainers = props.trainer.find(
    (t) => t.trainerld === trainerld
  );

  if (!trainers) {
    return <h2>Trainer not found</h2>;
  }
      
    return (
        <div>
             <h2>{trainers.name}</h2>
      <p>Email: {trainers.email}</p>
      <p>Phone: {trainers.phone}</p>
      <p>Technology: {trainers.technology}</p>
      <p>Skills: {trainers.skills}</p>

        </div>
    );
}

export default TrainerDetailes;