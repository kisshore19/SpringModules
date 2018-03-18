package com.java.dao.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.beans.Comment;
import com.java.beans.Post;
import com.java.common.dao.AbstractDao;
import com.java.configuration.ConnectionFactory;
import com.java.dao.PostDao;

@Repository
@Transactional
public class PostDaoImpl extends AbstractDao implements PostDao {

	@Autowired
	ConnectionFactory connectionFactory;

	public void savePost(Post post) {
		save(post);
	}

	public void savePostWithComment(Comment comment) {
		save(comment);
	}
}
