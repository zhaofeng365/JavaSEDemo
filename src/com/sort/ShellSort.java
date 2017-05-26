package com.sort;

public class ShellSort {
	 
	public static void main(String[] args) {
		int[] arr = {82 ,31 ,29 ,71, 72, 42, 64, 5,110};
		sort(arr);
	}
	
	  /**
     * ϣ������
     * ������һ��array,ϣ����������趨һ������incrementNum(0<incrementNum<array.length)��
	    �ȴ�array[0]��ʼ����incrementNumΪ�����Ľ���ֱ�Ӳ�������ֱ������ĩβ��Ȼ���array[1]��ʼ�ظ���
	    ��incrementNumΪ�����Ľ���ֱ�Ӳ�������; Ȼ���array[1]��ʼ�ظ�......һֱ��array[n]��
	    Ȼ��ȡһ��С����һ���������µ���������������ΪincrementNum/2��,��ǰһ������Ľ��array���б�����ֱ�Ӳ�������....
	    ��ȡС����һ���������µ��������ظ����У�������ֱ�Ӳ�������
	    ֱ���µ�����С��1֮�����˳�ѭ��
	    ����1����������������{82 ,31 ,29 ,71, 72, 42, 64, 5,110}   ��һ��ȡ��������Ϊarray.length/2 = 4    
	    �ȴ�82��ʼ��4Ϊ��������ֱ��ĩβ���õ���82,42�� ����õ�{42 ,31 ,29 ,71, 72, 82, 64, 5,110}�� Ȼ��ӵڶ�����31��ʼ�ظ���һ�����裬�õ���31,64��
	     ����õ�{42 ,31 ,29 ,71, 72, 82, 64, 5,110}.......   ��4Ϊ�����ı���������֮�󣬵õ��Ľ����{42 ,31,5,71,72,82,64,29,110}
	   Ȼ������������,����趨ΪincrementNum/2 = 2����{42 ,31,5,71,72,82,64,29,110}�ظ�����1��  ����֮����ȡ�µ��������ظ�����1�� ֱ��ȡ��������С��1���˳�ѭ����
     * @param arrays ��Ҫ���������
     */
    public static void sort(int[] arrays){
        if(arrays == null || arrays.length <= 1){
            return;
        }
        //����
        int incrementNum = arrays.length/2;
        while(incrementNum >=1){
            for(int i=0;i<arrays.length;i++){
                //���в�������
                for(int j=i;j<arrays.length-incrementNum;j = j+incrementNum){
                    if(arrays[j]>arrays[j+incrementNum]){
                        int temple = arrays[j];
                        arrays[j] = arrays[j+incrementNum];
                        arrays[j+incrementNum] = temple;
                    }
                }
            }
            //82 ,31 ,29 ,71, 72, 42, 64, 5,110
            //�����µ�����
            incrementNum = incrementNum/2;
        }
        
        
        for (int mm = 0; mm < arrays.length; mm++) {
			System.out.print(arrays[mm]+"\t");
		}
    }
}
