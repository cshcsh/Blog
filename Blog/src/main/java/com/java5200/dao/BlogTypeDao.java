package com.java5200.dao;

import java.util.List;
import java.util.Map;

import com.java5200.entity.BlogType;

/**
 * 博客类别Dao接口
 * @author CSH
 * @date 2018年6月3日下午12:45:01
 */
public interface BlogTypeDao {

	/**
	 * 查询所有博客类别，以及对应的博客数量
	 * @return
	 */
	public List<BlogType> countList();
	
	/**
	 * 通过id查找博客类别实体
	 * @return
	 */
	public List<BlogType> findById(Integer id);
	
	/**
	 * 分页查询博客类别信息
	 * @param map
	 * @return
	 */
	public List<BlogType> list(Map<String,Object> map);
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * 添加博客类别信息
	 * @param blogType
	 * @return
	 */
	public Integer add(BlogType blogType);
	
	/**
	 * 修改博客类别信息
	 * @param blogType
	 * @return
	 */
	public Integer update(BlogType blogType);
	
	/**
	 * 删除博客类别信息
	 * @param id
	 * @return
	 */
	public Integer delete(Integer id);
}
