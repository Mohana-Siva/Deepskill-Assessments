const courses = [
  {
    name: "Python Programming",
    date: "12/02/2024"
  },
  {
    name: "Java Full Stack",
    date: "15/03/2024"
  },
  {
    name: "Machine Learning",
    date: "20/05/2024"
  }
];

function DisplayCourse(){
 return (
        <>
        <h1>Course Details</h1>
            {courses.length>0 &&
            courses.map((course,index) => {
                return(
                    <div key={index}>
                        <h2>{course.name}</h2>
                        <p>{course.date}</p>
                    </div>
                )
            })}
        </>
    )
}
export default DisplayCourse;