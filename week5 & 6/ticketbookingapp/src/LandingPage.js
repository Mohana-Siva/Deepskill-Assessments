import { useState } from "react"
const Land = (props) =>{
    const [log , setLog] = new useState(false);
    function onLogin(){
        props.loginHandle(true);
    }
    
    return (
        <div>
                <h1>Login to Continue</h1>
            <button onClick={()=> {
                onLogin()}
                }>Login</button>
        </div>
    )
}
export default Land;