package com.java5200.service;

import java.util.List;
import java.util.Map;

import com.java5200.entity.BlogType;

/**
 * �������Service�ӿ�
 * @author CSH
 * @date 2018��6��3������12:27:21
 */
public interface BlogTypeService {

	/**
	 * ��ѯ���в�������Լ���Ӧ�Ĳ�������
	 * @return
	 */
	public List<BlogType> countList();
	
	/**
	 * ͨ��id���Ҳ������ʵ��
	 * @return
	 */
	public List<BlogType> findById(Integer id);
	
	/**
	 * ��ҳ��ѯ���������Ϣ
	 * @param map
	 * @return
	 */
	public List<BlogType> list(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * ��Ӳ��������Ϣ
	 * @param blogType
	 * @return
	 */
	public Integer add(BlogType blogType);
	
	/**
	 * �޸Ĳ��������Ϣ
	 * @param blogType
	 * @return
	 */
	public Integer update(BlogType blogType);
	
	/**
	 * ɾ�����������Ϣ
	 * @param id
	 * @return
	 */
	public Integer delete(Integer id);
}
