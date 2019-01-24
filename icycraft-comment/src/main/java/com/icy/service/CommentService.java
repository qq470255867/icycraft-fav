package com.icy.service;

import java.util.List;

import com.icy.domain.Comment;

public interface CommentService {

	List<Comment> getBlogsByBlogId(Long blogId);

	Comment saveComment(Comment comment);

}
