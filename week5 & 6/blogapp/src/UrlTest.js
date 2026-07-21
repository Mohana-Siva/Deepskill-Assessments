const UrlTest = async () =>{
    const res = await fetch("https://jsonplaceholder.typicode.com/posts");
    const result = await res.json();
    console.log(result);
}
UrlTest();