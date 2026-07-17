import { Link, Routes, Route } from 'react-router-dom';
import './App.css';
import TrainerList from './trainerList';
import TrainerMock from './TrainersMock';
import TrainerDetailes from './trainerDetailes';   // capitalized import
import Home from './Home';

function App() {
  return (
    <div className="App">
      <h2>Trainer Academy App</h2>
      <nav>
        <Link to="/">Home</Link> | <Link to="/TrainerList">Show-Trainer</Link>
      </nav>

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/TrainerList" element={<TrainerList trainers={TrainerMock} />} />
        <Route path="/trainers/:trainerld" element={<TrainerDetailes trainer={TrainerMock} />} />
      </Routes>
    </div>
  );
}

export default App;

