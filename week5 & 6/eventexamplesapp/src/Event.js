import React, { Children } from "react";
class Button extends React.Component{
   
    render(){
        return(
            <button onClick={this.props.onPress}>{this.props.children}</button>
        )
    }
}

export class Events extends React.Component{
    constructor(props){
        super(props);
        this.state={
            count : 0
        }
    }
    handleCounter(event){
        let c = this.state.count;
        if(event.target.textContent==="Increment") {
            this.setState({count:c+1});
        }else{
            this.setState({count:c-1});
        }
    }
    displayStatic(message){
        alert("Hello"+ message);
    }
    displayMessage(message){
        alert(message);
    }
    render(){
        return(
        <div>
            <div>
                <h2>Count: {this.state.count}</h2>
                <button onClick={(e)=>{
                    this.handleCounter(e);
                    this.displayStatic(" Member !");}}>
                Increment</button>
                <button onClick={(e)=>{
                    this.handleCounter(e);
                    this.displayStatic(" Member !");}}>
                Decrement</button>
                <button onClick={()=>this.displayMessage("Welcome")}>Say Welcome</button>
                <Button onPress={()=>this.displayMessage("I was clicked")}>Click Me</Button>
            </div>
        </div>
        )
    }
}

export class CurrencyConvertor extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            inputvalue : "",
            currency : 0
        }
    }
   handleConvert = (event) =>{
    event.preventDefault();
    const amount = Number(this.state.inputvalue);
    this.setState ({
        currency: 0.0091 * amount});
    }

    handleInputChange = (event) =>{
        this.setState({inputvalue:event.target.value});
    }
    render(){
    return (
        <div>
            <h1 style={{color:"green"}}>Currency Converter!</h1>
            <form onSubmit={this.handleConvert}>
                <label htmlFor="rupee"> Amount: </label>
                <input id="rupee" type="number" value={this.state.inputvalue} onChange={this.handleInputChange}/>
                <h4>Currency: {this.state.currency}</h4>
                <button type="submit" >Convert</button>

            </form>
        </div>
    )
}
}