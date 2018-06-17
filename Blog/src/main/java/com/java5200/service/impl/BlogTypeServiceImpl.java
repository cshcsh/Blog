package com.java5200.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java5200.dao.BlogTypeDao;
import com.java5200.entity.BlogType;
import com.java5200.service.BlogTypeService;

/**
 * 博客类别Service实现类
 * @author CSH
 * @date 2018年6月3日下午12:47:29
 */
@Service("blogTypeService")
public class BlogTypeServiceImpl implements BlogTypeService{

	@Resource
	private BlogTypeDao blogTypeDao;
	
	public List<BlogType> countList() {
		return blogTypeDao.countList();
	}

	public List<BlogType> findById(Integer id) {
		// TODO Auto-generated method stub
		return blogTypeDao.findById(id);
	}

	public List<BlogType> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return blogTypeDao.list(map);
	}

	public Long getTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return blogTypeDao.getTotal(map);
	}

	public Integer add(BlogType blogType) {
		// TODO Auto-generated method stub
		return blogTypeDao.add(blogType);
	}

	public Integer update(BlogType blogType) {
		// TODO Auto-generated method stub
		return blogTypeDao.update(blogType);
	}

	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return blogTypeDao.delete(id);
	}

	
}
