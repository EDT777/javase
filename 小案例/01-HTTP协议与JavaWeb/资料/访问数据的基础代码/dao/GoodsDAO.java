package com.octopus.dao;

import java.util.List;

import com.octopus.entity.Goods;

/**
 * ��Ʒ�����ݲ�����
 * @author hw
 *
 */
public interface GoodsDAO {
	/**
	 * �����Ʒ
	 * @param goods
	 * @return �Ƿ���ӳɹ�
	 */
	public int insert(Goods goods);
	
	/**
	 * �޸���Ʒ
	 * @param goods
	 * @return �Ƿ��޸ĳɹ�
	 */
	public int update(Goods goods);
	
	/**
	 * ɾ����Ʒ
	 * @param goods
	 * @return �Ƿ�ɾ���ɹ�
	 */
	public int delete(Long id);
	
	
	/**
	 * ����������ֵ��ȡ��������
	 * @param id
	 * @return
	 */
	public Goods getById(Long id);
	
	/**
	 * ������������
	 * @param where sql��������
	 * @param params �����ж�Ӧ�Ĳ���
	 * @param pageNum ҳ�룬��1��ʼ
	 * @param pageSize ҳ��С
	 * @return
	 */
	public List<Goods> findByWhere(String where,int pageNum,int pageSize);

	
	/**
	 * ��ҳ������������ѯָ�����������ݵ�������
	 * @param where sql��������
	 * @param params �����ж�Ӧ�Ĳ���
	 * @return
	 */
	public int countByWhere(String where,Object[] params);
}
