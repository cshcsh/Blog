package com.java5200.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java5200.dao.CommentDao;
import com.java5200.entity.Comment;
import com.java5200.service.CommentService;

/**
 * ����Serviceʵ����
 * @author CSH
 * @date 2018��6��7������11:53:42
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService{

	@Resource
	private CommentDao commentDao;
	
	public List<Comment> list(Map<String, Object> map) {
		return commentDao.list(map);
	}

	public int add(Comment comment) {
		// TODO Auto-generated method stub
		return commentDao.add(comment);
	}

	public Long getTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return commentDao.getTotal(map);
	}

	public int update(Comment comment) {
		// TODO Auto-generated method stub
		return commentDao.update(comment);
	}

	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return commentDao.delete(id);
	}

}
