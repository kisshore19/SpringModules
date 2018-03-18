package com.java.dao;

import com.java.beans.Comment;
import com.java.beans.Post;

public interface PostDao {
	public void savePost(Post post);
	public void savePostWithComment(Comment comment );
}
