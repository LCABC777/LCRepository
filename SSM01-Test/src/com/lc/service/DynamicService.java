package com.lc.service;

import java.util.List;

import com.lc.pojo.Article;

public interface DynamicService {
	public List<Article> showInfo(String author,String name);
}
