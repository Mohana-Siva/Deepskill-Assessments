const CalculateScore = ({name , school , total , goal}) =>{
    const calcScore= (total , goal)=>{
        return (total/goal).toFixed(2) + '%';
    }
    return(
        <div className="container">
        <h1>Student Details:</h1>
        <br/>
        <br/>
        <h2 className="Name">Name : <span>{name}</span></h2>
        <h2 className="School">School : <span>{school}</span></h2>
        <h2 className="Total">Total : <span>{total}</span></h2>
        <h2 className="Score">Score :<span>{calcScore(total,goal)}</span></h2>

        </div>

    )
}
export default CalculateScore;
