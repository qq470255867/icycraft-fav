package com.icy.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.icy.domain.Comment;

public interface CommentRepository extends CrudRepository<Comment, Serializable> {

	List<Comment> getBlogsByBlogId(Long blogId);

}
