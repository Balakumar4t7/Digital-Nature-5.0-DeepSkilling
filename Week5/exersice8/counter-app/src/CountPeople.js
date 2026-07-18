import {Component } from 'react';
import './style.css'
class CountPeople extends Component {

    constructor(){
        super();
        this.state = {
            entryCount : 0, 
            exitCount : 0
        }
    }
     updateEntry = ()=>{
        this.setState((PrevState)=>{
            return { entryCount : PrevState.entryCount+1}
        })
    }

    updateExit= () =>{
            this.setState((PrevState)=>{
                return { exitCount : PrevState.exitCount+1}
            })
    }
    render(){
        console.log("Inside CountPeople");
        return(
            <div className="counter-div">
                <h3>{this.state.entryCount}</h3>
                <button onClick={this.updateEntry}>Login</button>
                <h3>{this.state.exitCount}</h3>
                <button onClick={this.updateExit}>Exit</button>
            </div>
        );
    }
}
export default CountPeople;