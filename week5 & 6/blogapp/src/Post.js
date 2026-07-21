import React from "react";
class Post {
    constructor(id, title, body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }
}
class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [new Post(1, "Daily Blog", "Gardening"), new Post(2, "Travel Blog", "China")],
            hasError: false
        }
    }
    async loadPost() {
        const res = await fetch("https://jsonplaceholder.typicode.com/posts");
        const result = await res.json();
        const post = result.map(res => new Post(res.id, res.title, res.body));
        this.setState(
            { posts: post }
        )
    }
    componentDidMount() {
        this.loadPost();
    }

    componentDidCatch(error, info) {
        alert(error);
    }
    render() {
        return (
            <div style={{display: "flex",
        flexWrap: "wrap",
        justifyContent: "center",
        gap:"10px",
        padding:"15px"
        }}>
            {this.state.posts.map(post => 
                (
                <div className="card" style={{width:"18rem",padding:"15px",borderRadius:"10px"}} key={post.id}>
                    <div className="card-body">
                        <h4 className="card-title" >{post.title}</h4>
                        <p className="card-text">{post.body}</p>
                    </div>
                </div>
                )
            )}
            </div>
        )
    }

}
export default Posts;
