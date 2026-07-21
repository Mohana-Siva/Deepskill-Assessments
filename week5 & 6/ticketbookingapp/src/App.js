import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Home from './HomePage';
import Land from './LandingPage';
function App() {
  
  const [log , setLog] = new useState(false);

  function handleState(state){
    setLog(state);
  }
  if(log) return(
    <Home logoutHandle={handleState}/>
  )
  else return(
    <Land loginHandle={handleState}/>
  )
}

export default App;
