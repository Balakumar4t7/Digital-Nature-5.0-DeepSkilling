import {useState} from 'react';
function Counter(){
    const [count , setCount ] = useState(0);
    const [message , setMessage] = useState("");

    const increment = () => {
        setCount(prevCount => prevCount+1);
        window.alert("Hello Member " +Number(count+1));
    }

    const decrement = ()=>{
        setCount(count-1);
    }
    const sayWelcome = ()=>{
       setMessage("Welcome");
       window.alert("Welcome");
    } 

    const onPress = ()=>{
        window.alert("I am Clicked");
    }

    return(
        <div className="counter-div">
            <h2>{count}</h2>
            <button onClick={increment}>Increment</button>
            <button onClick={decrement}>Decrement</button>
            <h3>{message}</h3>
            <button onClick={sayWelcome} >Say Welcome</button>
            <button onClick={onPress}>Click on Me</button>
            
        </div>
    );
}

export default Counter;