const blogs = [
  {
    title: "Understanding React Hooks",
    author: "Dan Abramov",
    content: "Hooks let you use state and lifecycle features in functional components."
  },
  {
    title: "JavaScript ES6 Features",
    author: "Kyle Simpson",
    content: "ES6 introduced arrow functions, classes, template literals, destructuring, and much more."
  },
  {
    title: "Spring Boot Basics",
    author: "Craig Walls",
    content: "Spring Boot simplifies the development of production-ready Java applications."
  }
];
function DisplayBlog(){
    return (
        <>
        <h1>Blog Details</h1>

            {blogs.length>0 &&
            blogs.map((blog,index) => {
                return(
                    <div key={index}>
                        <h2>{blog.title}</h2>
                        <h3>{blog.author}</h3>
                        <p>{blog.content}</p>
                    </div>
                )
            })}
        </>
    )
}
export default DisplayBlog;