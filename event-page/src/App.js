import { useState, useEffect } from 'react';
import './App.css';
import axios from 'axios';

function App() {
  const [members, setMembers] = useState([]);

  // useEffect(() => {
  //   getAttendees();
  // }, []);

  // Sends and recieves GET request from selection
  async function getMembers(event) {
    const value = event.target.value;
    const res = await axios.get('http://localhost:8081/event/members/' + value);
    setMembers(res.data);
  }

  return (
    <div className="App">
      <header className="App-header">
          <select className="member-selection" onChange={getMembers}>
            <option value="attendees">Attendees</option>
            <option value="vendors">Vendors</option>
            <option value="guards">Guards</option>
            <option value="officers">Officers</option>
          </select>
        <ul className="members-list">
          {members.map((data) => {
            return (
              <li className="members-list-item" key={data.id}>{data.id} {data.firstName} {data.lastName}</li>
            )
          })}
        </ul>
      </header>
    </div>
  );
}

export default App;
