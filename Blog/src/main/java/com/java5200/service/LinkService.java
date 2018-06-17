package com.java5200.service;

import java.util.List;
import java.util.Map;

import com.java5200.entity.Link;

/**
 * ��������Service�ӿ�
 * @author CSH
 * @date 2018��6��3������10:07:46
 */
public interface LinkService {

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
