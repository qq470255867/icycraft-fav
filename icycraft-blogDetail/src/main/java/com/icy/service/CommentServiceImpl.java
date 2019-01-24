package com.icy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icy.dao.CommentFeign;
import com.icy.vo.Comment;
@Service
public class CommentServiceImpl implements CommentService {
	
	
	@Autowired
	CommentFeign commentFeign;

	@Override
	public List<Comment> getCommnets(Long blogId) {

		return commentFeign.getCommnet(blogId);
	}

	@Override
	public Comment saveCommnet(Comment comment) {
		
		return commentFeign.saveCommnet(comment);
	}

}
