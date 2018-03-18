package com.java.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.beans.Comment;
import com.java.beans.Post;
import com.java.dao.PostDao;
import com.java.service.PostService;

@Service("postService")
public class PostServiceImpl implements PostService {
	@Autowired
	PostDao postDao;

	public void savePost(Post post) {
		postDao.savePost(post);
	}

	public void savePostWithComment(Comment comment) {
		postDao.savePostWithComment(comment);		
	}

}
