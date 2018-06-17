package com.java5200.dao;

import java.util.List;
import java.util.Map;

import com.java5200.entity.Link;

/**
 * ��������Dao�ӿ�
 * @author CSH
 * @date 2018��6��3������11:39:22
 */
public interface LinkDao {

	/**
	 * ��������������Ϣ
	 * @param map
	 * @return
	 */
	public List<Link> list(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * �������������Ϣ
	 * @param blogType
	 * @return
	 */
	public Integer add(Link link);
	
	/**
	 * �޸�����������Ϣ
	 * @param blogType
	 * @return
	 */
	public Integer update(Link link);
	
	/**
	 * ɾ������������Ϣ
	 * @param id
	 * @return
	 */
	public Integer delete(Integer id);
}
