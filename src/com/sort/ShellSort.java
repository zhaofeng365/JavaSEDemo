package com.sort;

public class ShellSort {
	 
	public static void main(String[] args) {
		int[] arr = {82 ,31 ,29 ,71, 72, 42, 64, 5,110};
		sort(arr);
	}
	
	  /**
     * 希尔排序
     * 现在有一个array,希尔排序就是设定一个增量incrementNum(0<incrementNum<array.length)。
	    先从array[0]开始，以incrementNum为增量的进行直接插入排序，直到数组末尾，然后从array[1]开始重复：
	    以incrementNum为增量的进行直接插入排序; 然后从array[1]开始重复......一直到array[n]。
	    然后取一个小于上一步增量的新的增量（比如设置为incrementNum/2）,对前一个步骤的结果array进行遍历，直接插入排序....
	    再取小于上一步增量的新的增量，重复进行：遍历，直接插入排序
	    直到新的增量小于1之后再退出循环
	    步骤1：比如现在有数组{82 ,31 ,29 ,71, 72, 42, 64, 5,110}   第一次取增量设置为array.length/2 = 4    
	    先从82开始以4为增量遍历直到末尾，得到（82,42） 排序得到{42 ,31 ,29 ,71, 72, 82, 64, 5,110}。 然后从第二个数31开始重复上一个步骤，得到（31,64）
	     排序得到{42 ,31 ,29 ,71, 72, 82, 64, 5,110}.......   以4为增量的遍历完数组之后，得到的结果是{42 ,31,5,71,72,82,64,29,110}
	   然后重新区增量,这儿设定为incrementNum/2 = 2，对{42 ,31,5,71,72,82,64,29,110}重复步骤1。  完事之后，在取新的增量，重复步骤1。 直到取到的增量小于1，退出循环。
     * @param arrays 需要排序的序列
     */
    public static void sort(int[] arrays){
        if(arrays == null || arrays.length <= 1){
            return;
        }
        //增量
        int incrementNum = arrays.length/2;
        while(incrementNum >=1){
            for(int i=0;i<arrays.length;i++){
                //进行插入排序
                for(int j=i;j<arrays.length-incrementNum;j = j+incrementNum){
                    if(arrays[j]>arrays[j+incrementNum]){
                        int temple = arrays[j];
                        arrays[j] = arrays[j+incrementNum];
                        arrays[j+incrementNum] = temple;
                    }
                }
            }
            //82 ,31 ,29 ,71, 72, 42, 64, 5,110
            //设置新的增量
            incrementNum = incrementNum/2;
        }
        
        
        for (int mm = 0; mm < arrays.length; mm++) {
			System.out.print(arrays[mm]+"\t");
		}
    }
}
