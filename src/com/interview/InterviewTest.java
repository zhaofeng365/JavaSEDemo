package com.interview;

import java.util.Arrays;

public class InterviewTest {

	    /**
	     * ������������������a��b��дһ�������ҳ����ǵĽ�����
	     * @param a
	     * @param b
	     * @return
	     */

	    public static int[] intersect(int[] a, int[] b) {
	    	//��������ģ��Ƚ�����������������С���Ƿ��н���
	        if(a[0] > b[b.length - 1] || b[0] > a[a.length - 1]) {
	            return new int[0];
	        }
	        //����һ������
	        int[] intersection = new int[Math.max(a.length, b.length)];
	        int offset = 0;
	        for(int i = 0, s = i; i < a.length && s < b.length; i++) {//��һ��ѭ��a����
	        	System.out.println("a.i��ֵ�ǣ�"+i+"  b.s��ֵ�ǣ�" +s);
	            while(a[i] > b[s]) {//����ѭ��b����
	                s++;
	            }
	            if(a[i] == b[s]) {
	                intersection[offset++] = b[s++];
	            }
	            while(i < (a.length - 1) && a[i] == a[i + 1]) {//�ж�a�����Ƿ�ѭ����ȫ���������������Ƿ����
	                i++;
	            }
	        }
	        if(intersection.length == offset) {
	            return intersection;
	        }
	        int[] duplicate = new int[offset];
	        System.arraycopy(intersection, 0, duplicate, 0, offset);
	        return duplicate;
	    }
	    
	    public static void main(String args[]){
	    	int[] a = {2, 3, 4, 4, 4, 4, 7, 8, 8, 8, 8, 9, 100, 130, 150,158, 160,161,162,163,164,165,166};
	        int[] b = {4, 6, 7, 7, 7, 7, 8, 8, 9, 10, 100, 130, 130, 140, 150,153,158,159};
	      //  int[] c = intersect(a, b);
	         int[] my = myIntersect(a,b);
	        //System.out.println(Arrays.toString(c));
	        System.out.println(Arrays.toString(my));
	    }
	    /**
	     * ������������Ľ���
	     * @param a
	     * @param b
	     * @return
	     */
		private static int[] myIntersect(int[] a, int[] b) {
			//�ж������Ƿ�Ϊ��
			if(a.length == 0 || b.length==0) {
				System.out.println("û�н���");
				return null;
			}
			
			//�ж����������Ƿ��ǰ�˳������
			if(a.length>1 && a[0]>a[1]) {
				System.out.println("a����Ϊ������Ҫ���г�����");
				return null;
			}
			
			//�ж����������Ƿ��ǰ�˳������
			if(b.length>1 && b[0]>b[1]) {
				System.out.println("b����Ϊ������Ҫ���г�����");
				return null;
			}
			
			//�Ƚ����������Ƿ��н���
			if(a[0]>b[b.length-1] || b[0]>a[a.length-1]) {
				System.out.println("�����ڽ���");
				return null;
			}
			
			//����һ�����ս���������
			 int[] returnArray = new int[Math.max(a.length, b.length)];
			//int[] a = {2, 3, 4, 4, 4, 4, 7, 8, 8, 8, 8, 9, 100, 130, 150, 160,161,162,163,164,165,166};
		    //int[] b = {4, 6, 7, 7, 7, 7, 8, 8, 9, 10, 100, 130, 130, 140, 150,153,158,159};//18
			 int offset = 0;//������ս������������
			 int[] m,n;
			 if(a.length>b.length) {
				 System.out.println(" if ");
				 m = a;
				 n = b;
			 }else {
				 System.out.println(" else ");
				 m = b;
				 n = a;
			 }
			 
			//ѭ��a����
			for (int i = 0,s=0; i < m.length; i++) {
				
				while(s < n.length-1 && m[i]>n[s]) {
					s++;
				}
				
				if(s < n.length-1 && m[i]==n[s]) {
					returnArray[offset++] = n[s++];//offset++ �����ã������ý���������������ټ�1
				}
				
				while(i<m.length-1 && m[i]==m[i+1]) {
					i++;
				}
				
			}
			//��������Ŀ���Ƿ�ֹ����Խ���쳣 
			if(returnArray.length == offset) {
	            return returnArray;
	        }
	        int[] duplicate = new int[offset];
	        System.arraycopy(returnArray, 0, duplicate, 0, offset);
			
			return duplicate;
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
