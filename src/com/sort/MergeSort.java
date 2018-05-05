package com.sort;
/**
 * @author wangzhaofeng
 *
 */
public class MergeSort {
	  
	 private static int mark = 0;
	 
	  /**
	   * �鲢����
	   * 
	   * @param array
	   * @param low
	   * @param high
	   * @return
	   */
	  private static int[] sort(int[] array, int low, int high) {
	    int mid = (low + high) / 2;
	    if (low < high) {
	      mark++;
	      System.out.println("���ڽ��е�" + mark + "�ηָ����õ�");
	      System.out.println("[" + low + "-" + mid + "] [" + (mid + 1) + "-" + high + "]");
	      // �������
	      sort(array, low, mid);
	      // �ұ�����
	      sort(array, mid + 1, high);
	      // ���ҹ鲢
	      merge(array, low, mid, high);
	    }
	    return array;
	  }
	 
	  /**
	   * ��������й鲢
	   * 
	   * @param array
	   * @param low
	   * @param mid
	   * @param high
	   */
	  private static void merge(int[] array, int low, int mid, int high) {
	    System.out.println("�ϲ�:[" + low + "-" + mid + "] �� [" + (mid + 1) + "-" + high + "]");
	    int[] temp = new int[high - low + 1];
	    int L = low;// ��ָ��
	    int R = mid + 1;// ��ָ��
	    int k = 0;
	    // �ѽ�С�������Ƶ���������
	    while (L <= mid && R <= high) {
	      if (array[L] < array[R]) {
	        temp[k++] = array[L++];
	      } else {
	        temp[k++] = array[R++];
	      }
	    }
	    // ��������֮һ���ܴ���ʣ���Ԫ��
	    // �����ʣ�������������
	    while (L <= mid) {
	      temp[k++] = array[L++];
	    }
	    // ���ұ߱�ʣ�������������
	    while (R <= high) {
	      temp[k++] = array[R++];
	    }
	    // ���������е�������array����
	    for (int m = 0; m < temp.length; m++) {
	      array[m + low] = temp[m];
	    }
	  }
	 
	 
	  public static void main(String[] args) {
	    int[] array = { 3, 5, 2, 6, 2 };
	    int[] sorted = sort(array,0,array.length-1);
	    System.out.println("���ս��");
	    for (int i : sorted) {
	      System.out.print(i + " ");
	    }
	  }
}
