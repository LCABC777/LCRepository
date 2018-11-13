package com.lc.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.lc.mapper.DynamicMapper;
import com.lc.pojo.Article;
import com.lc.service.DynamicService;
@Service
public class DynamicServiceImpl implements DynamicService{
	@Resource
	private DynamicMapper dynamicMapper;
	@Override
	public List<Article> showInfo(String author,String name) {
		List<Article> la=dynamicMapper.dynamicInfo(author,name);
		return la;
	}

}
