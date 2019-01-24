package com.icy.service;

import java.util.List;

import com.icy.vo.Comment;

public interface CommentService {
	
	List<Comment> getCommnets(Long blogId);
	
	
	Comment saveCommnet(Comment comment);
	

}
