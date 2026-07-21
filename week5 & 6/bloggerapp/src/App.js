import logo from './logo.svg';
import './App.css';
import DisplayBlog from './Blog';
import DisplayBooks from './Book';
import DisplayCourse from './Course';
function App() {
  const showBook = true;
  const showCourse = true;
  const showBlog = true;

  return (
    <div className='container'>
     <div className='box'>{showBook ? <DisplayBooks/> :<h1>No books Available</h1>}</div>
     <div className='box'>{showCourse ? <DisplayCourse/> :<h1>No course Available</h1>}</div>
     <div className='box'>{showBlog ? <DisplayBlog/> :<h1>No blog Available</h1>}</div>
    
    </div>
  );
}

export default App;
