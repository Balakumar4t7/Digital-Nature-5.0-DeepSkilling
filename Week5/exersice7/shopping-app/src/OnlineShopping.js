import Cart from './Cart';
import {Component} from 'react';
import {} from './Style.css';
class  OnlineShopping extends Component{
    render(){
        const cartsInfo = [{itemname : " Laptop" ,price: 80000},
                            {itemname :"TV" , price: 12000},
                            {itemname: "Washing Machine" , price: 50000},
                            {itemname : "mobile" , price : 30000},
                            {itemname : " Fridge" , price : 70000}
                        ] ;
           
    
    return(
        <div className="online-div">
            <h3>Cart Items</h3>
            <Cart item={cartsInfo}/>
        </div>
    );
    }
    
}

export default OnlineShopping;