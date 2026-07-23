import './App.css';
function OfficeSpace(props){

    
    return (
        <div className="main-div">
            <h2>Office Space for rent at affordable Price </h2>
            <ul>{props.Office.map((office,index)=>{
                return <li key={office.index}>
                    <hr></hr>
                    <img src={office.image} alt={office.name} />
                    <p >Name :{office.name} </p>  
                    <p style={({color: office.rent<=60000 ? "red " : "green"})}
                    >Rent : {office.rent} </p>
                    <p >Location : {office.location} </p>
                    
                </li>
            })}
               
            </ul>
        </div>
    );
}

export default OfficeSpace;