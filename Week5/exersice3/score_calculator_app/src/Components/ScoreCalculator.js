
import '../StyleSheet/mystyle.css'
const percentToDecimal =(decimal)=>{
    return (decimal.toFixed(2)+'%');
}

const average =(total,goal) =>{
    return percentToDecimal(((total/goal)*100));
}

const CalculateScore = (props) =>{
    return(
    <div id="ScoreCard">
        <h2>Student Score Card</h2>
        <p>Student Name : {props.Name}</p>
        <p>School : {props.School}</p>
        <p>Marks Gained : {props.Total}</p>
        <p>Total Marks : {props.Goal}</p>
        <p>Calculated Score in Percentage : {average(props.Total,props.Goal)}</p>

    </div>
    );
}

export default CalculateScore;