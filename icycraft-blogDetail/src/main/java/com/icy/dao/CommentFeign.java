package com.icy.dao;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.icy.vo.Comment;

@FeignClient(name="icycraft-comment")
public interface CommentFeign {
	
	@GetMapping("/comment")
	public List<Comment> getCommnet(@RequestParam Long blogId);
	
	@PostMapping("/saveCommnet")
	public Comment saveCommnet(@RequestBody Comment comment);

}
