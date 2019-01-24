package com.icy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.domain.Comment;
import com.icy.repository.CommentRepository;
import com.icy.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentRepository CommentRepository;

	@Override
	public List<Comment> getBlogsByBlogId(Long blogId) {

		return CommentRepository.getBlogsByBlogId(blogId);
	}

	@Override
	public Comment saveComment(Comment comment) {
		CommentRepository.save(comment);
		return comment;
	}

}
