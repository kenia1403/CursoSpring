package com.bytecode.core.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bytecode.core.model.Post;

@Component("com.bytecode.core.beans.PostComponent")
public class PostComponent {
	public List<Post> getPosts(){
		ArrayList<Post> post = new ArrayList<>();
	
		post.add(new Post(0,"Desarrollo web es un termino que de fine la creacion...","http://localhost:8080/img/post.jpg",new Date(),"Desarrollo web"));
		post.add(new Post(2,"Desarrollo web es un termino que de fine la creacion...","http://localhost:8080/img/post.jpg",new Date(),"Desarrollo web Front end"));
		post.add(new Post(3,"Desarrollo web es un termino que de fine la creacion...","http://localhost:8080/img/post.jpg",new Date(),"Desarrollo web Back-end"));
		post.add(new Post(4,"Desarrollo web es un termino que de fine la creacion...","http://localhost:8080/img/post.jpg",new Date(),"Desarrollo web-UX/UI"));
return post;	
}
}
