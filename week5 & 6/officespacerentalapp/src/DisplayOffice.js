export const Display = (props) =>{
    const imgs = `/${props.office.image}`;
    return(
        <div style={{width:"400px", border:"2px solid black", margin:"10px" , padding:"10px" , justifyItems:"center" }}>
            <center><img  style={{width:"150px"}} src={imgs}/></center>
            <h3>Name: {props.office.name}</h3>
            <h3 style={{color: props.office.rent > 60000 ? "green" : "red"}}>Rent: Rs.{props.office.rent}</h3>
            <h3>Address: {props.office.address}</h3>
        </div>
    )
}