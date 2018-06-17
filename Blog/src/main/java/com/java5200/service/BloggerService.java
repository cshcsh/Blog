package com.java5200.service;

import com.java5200.entity.Blogger;

/**
 * BloggerService�ӿ�
 * @author CSH
 * @date 2018��6��2������8:47:55
 */
public interface BloggerService {

	/**
	 * ͨ���û�����ѯ�û�
	 * @param userName
	 * @return
	 */
	public Blogger getByUserName(String userName);
	
	/**
	 * ��ѯ������Ϣ
	 * @return
	 */
	public Blogger find();
	
	/**
	 * ���²�����Ϣ
	 * @param blogger
	 * @return
	 */
	public Integer update(Blogger blogger);
}
