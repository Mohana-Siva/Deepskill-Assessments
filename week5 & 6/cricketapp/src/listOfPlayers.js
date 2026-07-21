 export const ListOfPlayers = (props) =>{
    return (
        <div>
            <h1>List of Players</h1>
            <ul>
            {props.players.map(player=>{
                return <li>Mr. {player.name} {player.score}</li>
            })}
            </ul>
            <h1>List of Players having score less than 70</h1>
            <ul>
            {props.players.map(player=>{
                if(player.score <= 70)
                return <li>Mr. {player.name} {player.score}</li>
            })}
            </ul>
        </div>
)
}

export const OddPlayers = ({oddPlayer : [first , , third , , fifth , ,]}) =>{
    return(
    <div>
        <h1>Odd Players</h1>

        <ul>
            <li>Mr. {first}1</li>
            <li>Mr. {third}3</li>
            <li>Mr. {fifth}5</li>
        </ul>
    </div>)
}
export const EvenPlayers = ({evenPlayer : [,second , , fourth , , sixth]}) =>{
 return(
    <div>
        <h1>Even Players</h1>
        <ul>
            <li>Mr. {second}2</li>
            <li>Mr. {fourth}4</li>
            <li>Mr. {sixth}6</li>
        </ul>
    </div>)
}
export const MergePlayers = (props) =>{
 return(
    <div>
        <h1>List of Indian Players Merged</h1>
        <ul>
        {props.IndianPlayer.map(player =>{
             return <li>{player}Player</li>
        })}
        </ul>
    </div>)
}