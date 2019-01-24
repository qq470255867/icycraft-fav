package com.icy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icy.domain.Comment;
import com.icy.service.CommentService;

@RestController
public class CommnetController {

	@Autowired
	CommentService commentService;

	@GetMapping("/comment")
	public List<Comment> getCommnet(@RequestParam Long blogId) {

		return commentService.getBlogsByBlogId(blogId);

	}

	@PostMapping("/saveCommnet")
	public Comment saveCommnet(@RequestBody Comment comment) {

		return commentService.saveComment(comment);
	}

}
