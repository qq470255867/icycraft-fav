package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.icy.IcycraftArticlesApplication;
import com.icy.domain.Article;
import com.icy.repository.ArticleCrudRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IcycraftArticlesApplication.class)
public class IcycraftArticlesApplicationTests {
	
	@Autowired
	ArticleCrudRepository articleCrud;

	
	
	@Test
	public void saveArticles() {
		
		for (int i = 0; i < 20; i++) {
			Article article = new Article();
			article.setTitle("第"+i+"篇文章");
			article.setContent("内容");
			
			article.setHtml_content("html内容");
			article.setSummary("总结");
			
			articleCrud.save(article);
		}
	}

}
