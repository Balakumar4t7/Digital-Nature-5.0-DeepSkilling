import {Component} from 'react';
import {} from './Style.css';

class Cart extends Component {
    

    render(){
        
        const item = this.props.item.map((item )=> {
        return (
            <tr>
                    <td>{item.itemname}</td>
                    <td>{item.price}</td>
            </tr>
            
        );
    }
            
            );
    

    return (
          <table className="cart-table">
            <thead>
                <tr>
                    <th>Item</th>
                    <th>Price</th>
                </tr>
            </thead>

            <tbody>
                {item}
            </tbody>
        </table>
    );
  
}

}
export default Cart;