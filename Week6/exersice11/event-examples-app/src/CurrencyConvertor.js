import {useState} from 'react';
function CurrencyConvertor(){
    const [currency , setCurrency] = useState();
    const [amount , setAmount] = useState();
    
   
    const handleSubmit = ()=>{
         const result=  amount / 80;
         window.alert("Converted amonut " + result);
    }
    
    console.log(amount);
    console.log(currency);
    return(
        <div className="Currency-div">
            <h2>Currency Convertor</h2>
            <label>Amount : </label>
            <input type ="number" value={amount}
             onChange={(e)=>setAmount(e.target.value)}/><br/><br/>
            <label > Currency : </label>
            <input type ="text" value={currency}
             onChange={(e)=>setCurrency(e.target.value)} ></input><br/><br/>
             <button type="submit" onClick={handleSubmit}> calculate</button>
        </div>
    );
}

export default CurrencyConvertor;