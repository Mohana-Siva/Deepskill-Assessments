import { useState } from "react"
const Home = (props) =>{
    function onLogout(){
        props.logoutHandle(false);
    }
    return (
        <div>
                <h1>Welcome</h1>

            <button onClick={()=> {
                onLogout() ;}
                }>Logout</button>
        </div>
    )
}
export default Home;