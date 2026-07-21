const books = [
  {
    title: "Clean Code",
    price: 750
  },
  {
    title: "The Pragmatic Programmer",
    price: 920
  },
  {
    title: "Design Patterns",
    price: 680
  }
];
function DisplayBooks(){
     return (
        <>
        <h1>Book Details</h1>

            {books.length>0 &&
            books.map((book,index) => {
                return(
                    <div key={index}>
                        <h2>{book.title}</h2>   
                        <p>{book.price}</p>
                    </div>
                )
            })}
        </>
    )
}
export default DisplayBooks;