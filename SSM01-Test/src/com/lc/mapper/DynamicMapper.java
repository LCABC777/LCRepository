package com.lc.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Param;

import com.lc.pojo.Article;

public interface DynamicMapper {
	public List<Article> dynamicInfo(@Param("author")String author,@Param("name")String name);
}
