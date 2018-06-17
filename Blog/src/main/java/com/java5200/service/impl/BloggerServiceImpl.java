package com.java5200.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java5200.dao.BloggerDao;
import com.java5200.entity.Blogger;
import com.java5200.service.BloggerService;

/**
 * BloggerServiceImplʵ����
 * @author CSH
 * @date 2018��6��2������8:48:15
 */
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService {

	@Resource
	private BloggerDao bloggerDao;
	
	public Blogger getByUserName(String userName) {
		// TODO Auto-generated method stub
		return bloggerDao.getByUserName(userName);
	}

	public Blogger find() {
		// TODO Auto-generated method stub
		return bloggerDao.find();
	}

	public Integer update(Blogger blogger) {
		// TODO Auto-generated method stub
		return bloggerDao.update(blogger);
	}

}
