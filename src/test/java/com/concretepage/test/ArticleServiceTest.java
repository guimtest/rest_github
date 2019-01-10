package com.concretepage.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.validation.constraints.AssertTrue;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.concretepage.domain.Article;
import com.concretepage.service.ArticleService;

@RunWith(SpringRunner.class)
public class ArticleServiceTest {

	private static final int ARTICLE_ID_1=1;
	private static final int ARTICLE_ID_UNKNOWN=0;
	
	
	@TestConfiguration
	static class ArticleServiceImplTestContextConfiguration {

		@Bean
		public ArticleService articleService() {
			return new ArticleService();
		}
	}

	@Autowired
	private ArticleService articleService;

	// Test cases here

	@Test
	public void whenValidId_thenArticleShouldBeFound() {
		Article articleFound = articleService.getArticleById(ARTICLE_ID_1);
		assertEquals("failure - ids are not equal", articleFound.getArticleId(), ARTICLE_ID_1);
		
	}
	
	@Test
	public void whenListNotEmpty_thenArticleShouldBeFound() {
		List<Article> articleList = articleService.getAllArticles();
		assertTrue(articleList != null && articleList.size()>0);
		
	}
}
