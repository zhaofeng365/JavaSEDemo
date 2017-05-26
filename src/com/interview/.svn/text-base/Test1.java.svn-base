package com.interview;

public class Test1 {  
  
    public static String[] arr = { "1", "2", "3", "4", "5" };  
  
    public static StringBuffer aTotalString = new StringBuffer();// 总共的字符串  
  
    public static StringBuffer aTemp = new StringBuffer();// 当前串值  
  
    public static void main(String[] args) {  
        listString(arr.length + 1);  
        System.out.println("aTotalString=" + aTotalString);  
    }  
  
    /** 
     * 2.编程：用java语言实现一组数据的所有组合项. 
     *  
     * @param num 
     */  
  
    public static void listString(int num) {  
        if (num == 1) {  
            for (int i = 0; i < arr.length; i++) {  
                aTemp.append(arr[i] + ";");  
            }  
            return;  
        } else {  
            listString(num - 1);  
            aTotalString.append(aTemp);  
            String[] tempArray = aTemp.toString().split(";");  
            aTemp.setLength(0);  
            for (int i = 0; i < tempArray.length; i++) {  
                for (int j = 0; j < arr.length; j++) {  
                    if (check(tempArray[i], arr[j])) {  
                        aTemp.append(tempArray[i] + arr[j] + ";");  
                    }  
                }  
            }  
        }  
  
    }  
  
    /** 
     * 验证是否是重复的字段，例：13，3则是false, 13,4 则是true; 
     *  
     * @param value 
     * @param letter 
     * @return 
     */  
    public static boolean check(String value, String letter) {  
        for (int i = 0; i < value.length(); i++) {  
            if (value.substring(i, i + 1).equals(letter)) {  
                return false;  
            }  
        }  
        return true;  
    }  
  
}  