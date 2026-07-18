import './style.css'
import './App.css';
import FilterPlayers from './FilterPlayers';
import ListOfPlayers from './ListOfPlayers';
import {players} from './ListOfPlayers';
import {OddPlayer ,EvenPlayers,MergedList} from './OddPlayer';

function App() {
  console.log("Inside Main")
  var flag=false;
  if(flag){
    return(
      <div className="App">
        <p>flage is true</p>
      <ListOfPlayers/>
      <FilterPlayers  players={players}/> 
      <MergedList/>
      </div>
    );
  }
  else {
      return (
        <div className="App">
          <p>flag is false</p>
          <ListOfPlayers/>
          <OddPlayer players={players} />
          <EvenPlayers/>
        </div>
  );
}
}

export default App;
