import { useState } from 'react';
import './App.css';
import axios from 'axios';

function App() {
  const [count, setCount] = useState(0);

  const getGuard = () => {
    axios.get('http://localhost:8081/event/members/guards')
      .then(res => {
        console.log(res.data);
      }).catch(err => {
        console.log(err);
      })
  }

  const getAttendee = () => {
    axios.get('http://localhost:8081/event/members/attendees')
    .then(res => {
      console.log(res.data);
    }).catch(err => {
      console.log(err);
    })
  }

  return (
    <div className="App">
      <header className="App-header">
        <p>Test</p>
        <div>Example</div>
        <button onClick={getGuard} className="btn">Guard Info</button>
        <button onClick={getAttendee} className="btn">Attendee Info</button>
      </header>
    </div>
  );
}

export default App;
