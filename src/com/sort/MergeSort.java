package com.sort;
/**
 * @author wangzhaofeng
 *
 */
public class MergeSort {
	  
	 private static int mark = 0;
	 
	  /**
	   * 归并排序
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
	      System.out.println("正在进行第" + mark + "次分隔，得到");
	      System.out.println("[" + low + "-" + mid + "] [" + (mid + 1) + "-" + high + "]");
	      // 左边数组
	      sort(array, low, mid);
	      // 右边数组
	      sort(array, mid + 1, high);
	      // 左右归并
	      merge(array, low, mid, high);
	    }
	    return array;
	  }
	 
	  /**
	   * 对数组进行归并
	   * 
	   * @param array
	   * @param low
	   * @param mid
	   * @param high
	   */
	  private static void merge(int[] array, int low, int mid, int high) {
	    System.out.println("合并:[" + low + "-" + mid + "] 和 [" + (mid + 1) + "-" + high + "]");
	    int[] temp = new int[high - low + 1];
	    int L = low;// 左指针
	    int R = mid + 1;// 右指针
	    int k = 0;
	    // 把较小的数先移到新数组中
	    while (L <= mid && R <= high) {
	      if (array[L] < array[R]) {
	        temp[k++] = array[L++];
	      } else {
	        temp[k++] = array[R++];
	      }
	    }
	    // 两个数组之一可能存在剩余的元素
	    // 把左边剩余的数移入数组
	    while (L <= mid) {
	      temp[k++] = array[L++];
	    }
	    // 把右边边剩余的数移入数组
	    while (R <= high) {
	      temp[k++] = array[R++];
	    }
	    // 把新数组中的数覆盖array数组
	    for (int m = 0; m < temp.length; m++) {
	      array[m + low] = temp[m];
	    }
	  }
	 
	 
	  public static void main(String[] args) {
	    int[] array = { 3, 5, 2, 6, 2 };
	    int[] sorted = sort(array,0,array.length-1);
	    System.out.println("最终结果");
	    for (int i : sorted) {
	      System.out.print(i + " ");
	    }
	  }
}
