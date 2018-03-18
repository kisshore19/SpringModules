package com.java.service;

import com.java.beans.Comment;
import com.java.beans.Post;

public interface PostService {
	public void savePost(Post post);
	public void savePostWithComment(Comment comment );
}
