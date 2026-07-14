import { Component } from "react";
import Post from "./Post";

class Posts extends Component{
    constructor(props){
        super(props);
        this.state= {
            posts :[],
            hasError : false
        }
    }

    loadPost(){
        fetch("https://jsonplaceholder.typicode.com/posts")
        .then(response => response.json())
        .then(data => {
            this.setState({posts : data});
        })

        .catch(error => {
            console.log("Failed Fetching " + error);
        });
            
    }
    componentDidMount(){
        this.loadPost();
    }

    render(){
        return(
            <div>
                {this.state.posts.map(post => (
                    <Post key={post.id} title={post.title} body={post.body} />
                ))}
            </div>
        );
    }
}

export default Posts;

