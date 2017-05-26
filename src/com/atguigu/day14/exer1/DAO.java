package com.atguigu.day14.exer1;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * ����������� DAO<T>�������ж���һ��Map ��Ա������Map �ļ�Ϊ String ���ͣ�ֵΪ T ���͡�

�ֱ𴴽����·�����
public void save(String id,T entity)�� ���� T ���͵Ķ��� Map ��Ա������
T get(String id)���� map �л�ȡ id ��Ӧ�Ķ���
void update(String id,T entity)���滻 map ��keyΪid������,��Ϊ entity ����
List<T> list()������ map �д�ŵ����� T ����
void delete(String id)��ɾ��ָ�� id ����

 */
public class DAO<T> {
	Map<String,T> map;
	
	public void delete(String id){
		map.remove(id);
	}
	public List<T> list(){
		List<T> list = new ArrayList<T>();
		for(String s : map.keySet()){
			list.add(map.get(s));
		}
		return list;
	}
	
	public void update(String id,T entity){
		//map.remove(id);
		map.put(id, entity);
	}
	
	public T get(String id){
		return map.get(id);
	}
	public void save(String id,T entity){
		map.put(id, entity);
	}
}
