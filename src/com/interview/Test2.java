package com.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * ��Ŀ����1��2��2��3��4��5��6���������һ�����У��г����п��ܳ��ֵ�˳��
		Ҫ��
		1. ����4����λ�ڵ���λ
		2. 3��5��������һ��
 * @author Administrator
 *
 */
public class Test2{  
    static int[] in={1,2,2,3,4,5};  
    public static void main(String[] args){        
        for(int i = 122345;i<=543221;i++){  
            String string = String.valueOf(i);  
            if(checkOne(string) && checkTwo(string)   
                    && checkThree(string)  
                    && checkFour(string)){  
                System.out.println(string);  
            }  
        }  
    }  
    /** 
     * ������0,6,7,8,9 
     * @author zkf 
     * @createTime 2013-7-20 
     * @param str 
     * @return boolean 
     */  
    public static boolean checkOne(String str){  
        Pattern p = Pattern.compile("[0[6-9]]");  
        Matcher matcher = p.matcher(str);  
        matcher.matches();  
        if(matcher.find()){  
            return false;  
        }     
        return true;  
    }  
    /** 
     * ������1,2,2,3,4,5������ 
     * @author zkf 
     * @createTime 2013-7-20 
     * @param str 
     * @return boolean 
     */  
    public static boolean checkTwo(String str){  
        for (int i = 0; i < in.length; i++) {  
            if(!str.contains(String.valueOf(in[i]))){  
                return false;  
            }  
        }  
        if(str.indexOf("2") == str.lastIndexOf("2")){  
            return false;  
        }  
        return true;  
    }  
    /** 
     *4����λ�ڵ�3λ 
     * @author zkf 
     * @createTime 2013-7-20 
     * @param str 
     * @return boolean 
     */  
    public static boolean checkThree(String str){   
        if(str.indexOf("4") == 2){  
            return false;  
        }  
        return true;  
    }  
    /** 
     *35�������� 
     * @author zhangkefei 
     * @createTime 2013-7-20 
     * @param str 
     * @return boolean 
     */  
    public static boolean checkFour(String str){   
        if(Math.abs(str.indexOf("3")-str.indexOf("5")) == 1){  
            return false;  
        }  
        return true;  
    }  
}  