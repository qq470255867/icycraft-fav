package com.icy.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.icy.domain.Article;

@Repository
public interface ArticleCrudRepository extends PagingAndSortingRepository<Article, Serializable> {

	@Query(value = "SELECT * from blog ORDER BY id DESC LIMIT 8", nativeQuery = true)
	List<Article> findIndexArticles();

	Page<Article> findBycatId(Long catId, Pageable pageable);

	@Query(value = "SELECT * from blog where user_id=?1 ORDER BY  id DESC LIMIT 8", nativeQuery = true)
	List<Article> getArticlesByUserId(Long UserId);

	Article getArticleById(Long id);
	
	
	Page<Article> findArticlesByUserIdAndCatId(Long userId,Long catId,Pageable pageable);
	
	Page<Article> findArticlesByUserId(Long userId,Pageable pageable);

}
