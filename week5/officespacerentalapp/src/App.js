import logo from './logo.svg';
import './App.css';
import { Display } from './DisplayOffice';
const offices = [
  {
    name: "Tech Hub",
    rent: 70000,
    address: "12 MG Road, Bengaluru, Karnataka",
    image: "office.jpg"
  },
  {
    name: "Skyline Workspace",
    rent: 40000,
    address: "45 Anna Salai, Chennai, Tamil Nadu",
    image: "office.jpg"
  },
  {
    name: "Business Square",
    rent: 65000,
    address: "18 Banjara Hills, Hyderabad, Telangana",
    image: "office.jpg"
  },
  {
    name: "Innovation Center",
    rent: 55000,
    address: "22 Hinjewadi Phase 1, Pune, Maharashtra",
    image: "office.jpg"
  },
  {
    name: "Prime Corporate",
    rent: 48000,
    address: "90 Sector 62, Noida, Uttar Pradesh",
    image: "office.jpg"
  },
  {
    name: "Green Valley Offices",
    rent: 28000,
    address: "10 Salt Lake Sector V, Kolkata, West Bengal",
    image: "office.jpg"
  }
];

function App() {
  return (
    <div>
    <center><h1>Office Space , At Affordable Range</h1></center>

   <div style={{display:"flex",flexWrap:"wrap",justifyContent:"space-evenly"}}>
    {offices.map(off => {
      return (
        <Display office ={off}/>
      )
    })}
   </div>
   </div>
  );
}

export default App;
