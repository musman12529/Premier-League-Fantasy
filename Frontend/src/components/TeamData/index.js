import React, { useState, useEffect } from 'react';
import axios from 'axios';
import "./index.scss";
import AnimatedLetters from "../AnimatedLetters";

const TeamData = () => {
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);
  const [playerData, setPlayerData] = useState([]);
  const [playersToShow, setPlayersToShow] = useState(10);
  const [letterClass] = useState('text-animate');
  
  useEffect(() => {
    const params = new URLSearchParams(window.location.search);
    const teamValue = params.get('team');
    const nationValue = params.get('nation');
    const positionValue = params.get('position');
    const nameValue = params.get('name');
    
    if (teamValue) {
      axios.get(`https://premier-league-backend-production.up.railway.app/api/v1/player?team=${encodeURIComponent(teamValue)}`)
        .then(response => {
          setPlayerData(response.data);
          setLoading(false);
        })
        .catch(error => {
          setError(error);
          setLoading(false);
        });
    } else if (nationValue){
      axios.get(`https://premier-league-backend-production.up.railway.app/api/v1/player?nation=${encodeURIComponent(nationValue)}`)
      .then(response => {
        setPlayerData(response.data);
        setLoading(false);
      })
      .catch(error => {
        setError(error);
        setLoading(false);
      });
    } else if (positionValue){
      axios.get(`https://premier-league-backend-production.up.railway.app/api/v1/player?position=${encodeURIComponent(positionValue)}`)
      .then(response => {
        setPlayerData(response.data);
        setLoading(false);
      })
      .catch(error => {
        setError(error);
        setLoading(false);
      });
    } else if (nameValue){
      axios.get(`https://premier-league-backend-production.up.railway.app/api/v1/player?name=${encodeURIComponent(nameValue)}`)
      .then(response => {
        setPlayerData(response.data);
        setLoading(false);
      })
      .catch(error => {
        setError(error);
        setLoading(false);
      });
    }
      else {
      setLoading(false);
    }
  }, []);

  if (loading) {
    return <p>Loading...</p>;
  }

  if (error) {
    return <p>Error: {error.message}</p>;
  }


  return (
    <div className={`fade-in ${loading ? 'loading' : ''}`}>
    <div className="table-container">
      <h1 className = "page-title">
        <AnimatedLetters letterClass = {letterClass} strArray={"Player Data".split("")} idx={12}/>
      </h1>
      <table>
        <thead>
          <tr>
            <th>Name</th>
            <th>Position</th>
            <th>Age</th>
            <th>Matches Played</th>
            <th>Starts</th>
            <th>Minutes Played</th>
            <th>Goals</th>
            <th>Assists</th>
            <th>Penalties Kicked</th>
            <th>Yellow Cards</th>
            <th>Red Cards</th>
            <th>Expected Goals (xG)</th>
            <th>Expected Assists (xAG)</th>
            <th>Team</th>
          </tr>
        </thead>
        <tbody>
          {playerData.slice(0, playersToShow).map(player => (
            <tr key={player.name}>
              <td>{player.player_name}</td>
              <td>{player.position}</td>
              <td>{player.age}</td>
              <td>{player.matches_played}</td>
              <td>{player.starts}</td>
              <td>{player.minutes_played}</td>
              <td>{player.goals}</td>
              <td>{player.assists}</td>
              <td>{player.penalties_scored}</td>
              <td>{player.yellow_cards}</td>
              <td>{player.red_cards}</td>
              <td>{player.expected_goals}</td>
              <td>{player.expected_assists}</td>
              <td>{player.team}</td>
            </tr>
          ))}
        </tbody>
      </table>
      {playersToShow < playerData.length && (
        <button onClick={() => setPlayersToShow(playersToShow + 10)} style={{ marginTop: '10px', marginBottom: '10px' }} className={`show-more-button ${loading ? 'loading' : ''}`}>
          Show More
        </button>
      )}
    </div>
    </div>
  );
};

export default TeamData;
