import { useState, useEffect } from 'react';
import './App.css';
import axios from 'axios';

function App() {
  const [members, setMembers] = useState([]);

  // useEffect(() => {
  //   getMembers();
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
        <div className="members-list">
          <div className="members-list-row header">
            <div className="members-column">ID</div>
            <div className="members-column">First Name</div>
            <div className="members-column">Last Name</div>
            <div className="members-column">Birth Date</div>
          </div>
          {members.map((data) => {
            return (
              <div className="members-list-row" key={data.id}>
                <div className="members-column">{data.id}</div>
                <div className="members-column">{data.firstName}</div>
                <div className="members-column">{data.lastName}</div>
                <div className="members-column">{data.birthDate}</div>
              </div>
            )
          })}
        </div>
      </header>
    </div>
  );
}

export default App;
