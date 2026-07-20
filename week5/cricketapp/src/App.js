import logo from './logo.svg';
import './App.css';
import { ListOfPlayers , OddPlayers , EvenPlayers, MergePlayers} from './listOfPlayers';

const Players = [
  { name: "Apex", score: 80 },
  { name: "Blaze", score: 95 },
  { name: "Cipher", score: 64 },
  { name: "Drift", score: 42 },
  { name: "Echo", score: 88 },
  { name: "Frost", score: 71 },
  { name: "Gamma", score: 53 },
  { name: "Nova", score: 91 },
  { name: "Onyx", score: 37 },
  { name: "Phantom", score: 79 },
  { name: "Vortex", score: 85 }
];
const Indplayers = [
  "Sachin","Dhoni" , "Virat" ,"Rohit" ,"Yuvaraj" , "Raina"
]

const T20Players = ["first" , "second" , "third"];
const RanjiPlayers = ["fourth" , "fifth", "sixth"];

const Merged = [...T20Players,...RanjiPlayers];
function App() {
  const flag = false;
  if(flag)
  return (
    <div >
      <ListOfPlayers players= {Players}/>
    </div>
  );
  else {
    return (
    <div >
      <OddPlayers oddPlayer={Indplayers}/>
      <EvenPlayers evenPlayer={Indplayers}/>
      <MergePlayers IndianPlayer = {Merged}/>
    </div>
  );
  }
}

export default App;
