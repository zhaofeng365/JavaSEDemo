package com.csdn.panghu.recursion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ��ϸע��,���ν��͹������
 * @Description:  [����+�ݹ���͹������]
 * @Author:       [�ֻ�]   
 * @CreateDate:   [2014-4-2 ����1:59:36]
 * @CsdnUrl:      [http://blog.csdn.net/ljphhj]
 */

/*͹���ϵĵ�*/
class TuPoint {
	double x;
	double y;
	public TuPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "TuPoint [x=" + x + ", y=" + y + "]";
	}
	
}
/*͹���ϵ����������*/
class TuLine {
	TuPoint point1, point2;
	public TuLine(TuPoint point1, TuPoint point2) {
		this.point1 = point1;
		this.point2 = point2;
	}
	//����ľ��루�ߵĳ��ȣ�
	public double getDistance() {
		double dx = point1.x - point2.x;
		double dy = point1.y - point2.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	@Override
	public String toString() {
		return "TuLine [point1=" + point1 + ", point2=" + point2 + "]";
	}
	
}

public class TuBaoProblem {
	//Ҫ����ĵ㼯��
	private List<TuPoint> pointList = null;
	//�㼯pointList��Ӧ��͹�������
	private List<TuLine> lineList = new ArrayList<TuLine>();
	
	public TuBaoProblem(List<TuPoint> pointList) {
		super();
		this.pointList = pointList;
	}
	//���͹�������ѽ�����뵽lineList�С�
	public void solve(){
		//��ʼ����clear
		lineList.clear();
		if (pointList == null | pointList.isEmpty())
			return ;
		/*��͹���еĵ㼯��*/
		List<TuPoint> leftPointList = new ArrayList<TuPoint>();	
		/*��͹���еĵ㼯��*/
		List<TuPoint> rightPointList = new ArrayList<TuPoint>();	
		
		/*����point��x����������*/
		Collections.sort(pointList, new xcomparator());
		
		/*�ҵ�x��С�ĵ㣬������ߵĵ�*/
		TuPoint leftPoint = pointList.get(0);
		
		/*�ҵ�x���ĵ㣬�����ұߵĵ�*/
		TuPoint rightPoint = pointList.get(pointList.size() - 1);
		
		/*leftPoint ~~ rightPoint�����߰Ѵ��͹�����⣬�ֽ������С��͹������*/
		/*���ܵĵ㼯���ֳ�����,��Ӧ�ŵ�leftPointList(��͹���㼯) ���� rightPointList(��͹���㼯)*/
		for (int i = 0; i < pointList.size(); i++) {// ������еĵ�,
			TuPoint tempPoint = pointList.get(i);
			//�жϵ�tempPoint��������Ϊ��͹��������͹��
			double result = findArea(leftPoint, rightPoint, tempPoint);
			if (result > 0) {
				//tempPoint�������
				leftPointList.add(tempPoint);
			} else if (result < 0) {
				//tempPoint�����ұ�
				rightPointList.add(tempPoint);
			}
		}
		
		//�ֱ������������͹��
		dealTuBao(leftPoint, rightPoint, leftPointList);
		dealTuBao(rightPoint, leftPoint, rightPointList);
	}
	private void dealTuBao(TuPoint p1, TuPoint p2, List<TuPoint> subPointList){
		if (subPointList.isEmpty()){
			/*�ݹ��������*/
			//�������������ɵ��߽������ս��͹���ϵ�һ��!
			lineList.add(new TuLine(p1, p2));
			return ;
		}
		//subPointList��Ϊ�յĻ�������Ҫȥ�Ҳ�����ͼʾ��д�� Pmax ��
		
		double maxArea = Double.MIN_VALUE;
		TuPoint pMax = null;
		for (int i = 0; i < subPointList.size(); i++) {
			// ��������Ӧ�ĵ����Pmax
			double area = findArea(p1, p2, subPointList.get(i));
			if (area > maxArea) {
				pMax = subPointList.get(i);
				maxArea = area;
			}
		}
		
		/*����Ĵ����֮ǰsolve()�����еĴ���һ��*/
		
		// �ҳ�λ��(p1, pMax)ֱ����ߵĵ㼯s1
		// �ҳ�λ��(pMax, p2)ֱ���ұߵĵ㼯s2
		/*��͹���еĵ㼯��*/
		List<TuPoint> leftPointList = new ArrayList<TuPoint>();	
		/*��͹���еĵ㼯��*/
		List<TuPoint> rightPointList = new ArrayList<TuPoint>();
		
		/*�ѵ㼯subPointList���ֳ�����,��Ӧ�ŵ�leftPointList(��͹���㼯) 
		 * ���� rightPointList(��͹���㼯)*/
		for (int i = 1; i < subPointList.size(); i++) {// ������еĵ�,
			TuPoint tempPoint = subPointList.get(i);
			//�жϵ�tempPoint��������Ϊ��͹��������͹��
			/*��: p1 ~ pMax*/
			double result1 = findArea(p1, pMax, tempPoint);
			/*��: p2 ~ pMax*/
			double result2 = findArea(pMax, p2, tempPoint);
			if (result1 > 0) {
				//tempPoint�������
				leftPointList.add(tempPoint);
			} else if (result2 > 0) {
				//tempPoint�����ұ�
				rightPointList.add(tempPoint);
			}
		}
		//�ݹ���ÿ�~~
		dealTuBao(p1, pMax, leftPointList);
		dealTuBao(pMax, p2, rightPointList);
	}
	/* �����Ĺ���: 1. �жϵ�����͹������߻����ұ�  2.�����������ε���������ҵ�Pmax��
	 * �����ε�������ڷ���ֵ����ֵ�Ķ���֮һ
	 * ��p3λ��ֱ��(p1, p2)���ʱ�����ʽ�Ľ��Ϊ��
	 * ��p3λ��ֱ��(p1, p2)�Ҳ�ʱ�����ʽ�Ľ��Ϊ��
	 * */
	private double findArea(TuPoint p1, TuPoint p2, TuPoint p3) {
		return p1.x * p2.y + p3.x * p1.y + p2.x * p3.y - p3.x * p2.y - p2.x
				* p1.y - p1.x * p3.y;
	}
	
	public static void main(String[] args) {
		List<TuPoint> arrays = new ArrayList<TuPoint>();
		arrays.add(new TuPoint(2, 4));
		arrays.add(new TuPoint(3, 4));
		arrays.add(new TuPoint(3, 3));
		arrays.add(new TuPoint(4, 3));
		arrays.add(new TuPoint(4, 4));
		arrays.add(new TuPoint(5, 4));
		arrays.add(new TuPoint(5, 2));
		arrays.add(new TuPoint(3.5, 2));
		arrays.add(new TuPoint(2, 2));
		TuBaoProblem t = new TuBaoProblem(arrays);
		t.solve();
		t.printResult();
	}
	/*������*/
	public void printResult() {
		for (Object i : lineList.toArray()){
			System.out.println(i);
		}
	}
	/*x�Ƚ���*/
	class xcomparator implements Comparator<TuPoint>{

		public int compare(TuPoint p1, TuPoint p2) {
			return p1.x > p2.x ? 1 : p1.x == p2.x ? 0 : -1;
		}
	}
	
}
