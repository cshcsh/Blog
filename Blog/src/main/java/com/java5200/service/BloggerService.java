package com.java5200.service;

import com.java5200.entity.Blogger;

/**
 * BloggerService接口
 * @author CSH
 * @date 2018年6月2日下午8:47:55
 */
public interface BloggerService {

	/**
	 * 通过用户名查询用户
	 * @param userName
	 * @return
	 */
	public Blogger getByUserName(String userName);
	
	/**
	 * 查询博主信息
	 * @return
	 */
	public Blogger find();
	
	/**
	 * 更新博主信息
	 * @param blogger
	 * @return
	 */
	public Integer update(Blogger blogger);
}
