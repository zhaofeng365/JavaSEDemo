package com.interview;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 题目：用1、2、2、3、4、5这6个数字组成一个序列，列出所有可能出现的顺序。
		要求：
		1. 数字4不能位于第三位
		2. 3和5不能连在一起
 * @author Administrator
 *
 */
public class Test4 {
	static List<Integer> list = new ArrayList<Integer>();
	     static String[] redArrTemp= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33"};
		static String[] excludeRedArr = { };
		static String[] redArrs= getNewArray(redArrTemp,excludeRedArr); 
		
		
		static String[] blueArrTemp= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"};
		static String[] excludeBlue  = { };
		
		static String[] blueArrs= getNewArray(blueArrTemp,excludeBlue); 
		static String  blueStr = getBlueStr(blueArrs);
		
		static String  outRedArr=  "2,4,12,14,17,24";
		static String[]  outBlue= {"15"};
		
		static int[]  chocieBlue ;
	
	static int number = 6;
	static int cnt = 0;
	static int index = 0;
	public static void main(String[] args) throws IOException {
		AppendFile.writePushLog("100000","分隔线*****************************************"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"*****************************************************************\r\n", "");
		/**
		 *蓝球分析
		 * 奇偶 01    大小 01   质合非  012   012路  012  四区分布 0123  除四余数  0123  返回的数
		 **/
		    
		//  chocieBlue = doBlueScale(blueArrs,"010003");
		
		test(index,"",list,number);
		System.out.println("总数有："+cnt);
		
		boolean flag = false;
		if(flag){
				/**红球**/
				int[] scale = doRedScale(outRedArr);
				String splitChar = "; ";
				StringBuffer sb = new StringBuffer("\r\n\r\n红球：**********************************优雅分隔线***************************************************************************\r\n");
				sb.append("质合比：").append(scale[0]).append(splitChar);
				sb.append("奇偶比：").append(scale[1]).append(splitChar);
				sb.append("大小比：").append(scale[2]).append(splitChar);
				sb.append("除3路比：").append(scale[3]).append(splitChar);
				sb.append("和值：").append(scale[4]).append(splitChar);
				sb.append("和尾：").append(scale[5]).append(splitChar);
				sb.append("基本走势(三分势)：").append(scale[6]).append(splitChar);
				sb.append("基本走势(四分势)：").append(scale[7]).append(splitChar);
				sb.append("基本走势(七分势)：").append(scale[8]).append(splitChar);
				sb.append("红一到六区除3取余值：").append(scale[9]).append(splitChar);
				sb.append("跨度：").append(scale[10]).append(splitChar).append("\r\n");
				
				/**蓝球球**/
				int[] blueScale = doBlueScale(outBlue,"0");
				//奇偶 01    大小 01   质合非  012   012路  012  四区分布 0123  除四余数  0123  返回的数
				sb.append("\r\n");
				sb.append("蓝球：*************************************************************************************************************\r\n");
				sb.append("奇偶比：").append(blueScale[0]).append(splitChar);
				sb.append("大小比：").append(blueScale[1]).append(splitChar);
				sb.append("质合非比：").append(blueScale[2]).append(splitChar);
				sb.append("徐3余数：").append(blueScale[3]).append(splitChar);
				sb.append("四区分布：").append(blueScale[4]).append(splitChar);
				sb.append("除四余数：").append(blueScale[5]).append(splitChar);
				sb.append("返回的数：").append(blueScale[6]).append(splitChar);
				System.out.println(sb.toString()) ;
			
		}
		
	}
	/**获取蓝球**/
	public static String getBlueStr(String[] str){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			sb.append(str[i]).append(",");
		}
		return sb.toString().substring(0, sb.toString().length()-1);
	}
	/**移除杀数获取最新数**/
	 public static String[] getNewArray(String[] allArr,String[] excludeArr){
		 List<String> list = new ArrayList<String>();
		 Set<String> set = new HashSet<String>();
		 for (int m = 0; m < excludeArr.length; m++) {
			set.add(excludeArr[m]);
		 }
		 for (int i = 0; i < allArr.length; i++) {
                   if(!set.contains(allArr[i])){
                	   list.add(allArr[i]);
                   }
		}
		 String[] obj = list.toArray(new String[allArr.length-excludeArr.length]);
		 return  obj;
	 }
	
	public static void test(int index,String str,List<Integer> list,int num) throws IOException{
		if(num==0){
			/**红球分析
			*   0        1        2          3        4         5	                  6			               7			                 8                             9                   10
			* 质合   奇偶   大小   除3余数   和值   和尾    基本走势(三分势)  基本走势(四分势)  基本走势(七分势)  红一到六区除3取余值   跨度
			**/
			int[] redScale = doRedScale(str);
			
			
		if(redScale[0]==24 && redScale[1]==24 && redScale[2]==24 && redScale[3]==222 && redScale[6]==312 && redScale[7]==3111 && redScale[8]==2110110 && redScale[9]==120222){
				
				str = str.substring(0, str.length()-1)+"-"+blueStr;
				/**写文件**/
				AppendFile.writePushLog("100000", str+"\r\n", "");
		  }
			cnt++;
			return;
		}
		List<Integer> list2 = null;
		for (int i = index; i < redArrs.length; i++) {
			list2 = new ArrayList<Integer>();
			list2.addAll(list);
			
			if(!list.contains(i)){
				list2.add(i);
				
				String s = str + redArrs[i]+",";
				test(i+1,s,list2,num-1);
			}
		}
		
	}
	
	
	public static int[] doRedScale(String str){
		 int[] returnArr = new int[11];
		 
		  String[] arr = str.split(",");
		  int zIndex = 0;//质数个数
		  int hIndex = 0;//合数个数
		  
		  int oddIndex = 0;//奇数个数
		  int evenIndex = 0;//偶数个数
		  
		  int bigIndex = 0;//大数个数
		  int smallIndex = 0;//小数个数
		  
		  int divIndex0 = 0;//除3等于0个数
		  int divIndex1 = 0;//除3等于1个数
		  int divIndex2 = 0;//除3等于2个数
		  
		  int threeTrendIndex0 = 0;//基本走势0个数(三分势)
		  int threeTrendIndex1 = 0;//基本走势0个数(三分势)
		  int threeTrendIndex2 = 0;//基本走势0个数(三分势)
		  
		  int fourTrendIndex0 = 0;//基本走势0个数(四分势)
		  int fourTrendIndex1 = 0;//基本走势0个数(四分势)
		  int fourTrendIndex2 = 0;//基本走势0个数(四分势)
		  int fourTrendIndex3 = 0;//基本走势0个数(四分势)
		  
		  int servenTrendIndex0 = 0;//基本走势0个数(七分势)
		  int servenTrendIndex1 = 0;//基本走势0个数(七分势)
		  int servenTrendIndex2 = 0;//基本走势0个数(七分势)
		  int servenTrendIndex3 = 0;//基本走势0个数(七分势)
		  int servenTrendIndex4 = 0;//基本走势0个数(七分势)
		  int servenTrendIndex5 = 0;//基本走势0个数(七分势)
		  int servenTrendIndex6 = 0;//基本走势0个数(七分势)
		  
		  int redIndex0 = 0;//红一区余数
		  int redIndex1 = 0;//红二区余数
		  int redIndex2 = 0;//红三区余数
		  int redIndex3 = 0;//红四区余数
		  int redIndex4 = 0;//红五区余数
		  int redIndex5 = 0;//红六区余数
		  
		  int distance = 0;//跨度
		  
		  for (int i = 0; i < arr.length; i++) {
			  int mm = Integer.valueOf(arr[i]);
			  //判断质合
			  if(mm>1){
				  if(isPrime(mm)){
					  zIndex++;
				  }else{
					  hIndex++;
				  }
			  }
			  //偶数判断
			  if(isOdevity(mm)){
				  oddIndex++;
			  }else{
				  evenIndex++;
			  }
			  //大小判断
			  if(isBigOrSmall(mm)){
				  bigIndex++;
			  }else{
				  smallIndex++;
			  }
			  
			  //除3余值个数
			  int div = isDiv(mm);
			  if(div==0){
				  divIndex0++;
			  }else if(div==1){
				  divIndex1++;
			  }else if(div==2){
				  divIndex2++;
			  }
			  
			  //基本走势(三分走势)
			  int trend = threeTrend(mm);
			  if(trend==0){
				  threeTrendIndex0++;
			  }else if(trend==1){
				  threeTrendIndex1++;
			  }else if(trend==2){
				  threeTrendIndex2++;
			  }
			  
			  //基本走势(四分走势)
			  int fourTrend = fourTrend(mm);
			  if(fourTrend==0){
				  fourTrendIndex0++;
			  }else if(fourTrend==1){
				  fourTrendIndex1++;
			  }else if(fourTrend==2){
				  fourTrendIndex2++;
			  }else if(fourTrend==3){
				  fourTrendIndex3++;
			  }
			  
			  
			  
			  //基本走势(七分走势)
			  int servenTrend = servenTrend(mm);
			  if(servenTrend==0){
				  servenTrendIndex0++;
			  }else if(servenTrend==1){
				  servenTrendIndex1++;
			  }else if(servenTrend==2){
				  servenTrendIndex2++;
			  }else if(servenTrend==3){
				  servenTrendIndex3++;
			  }else if(servenTrend==4){
				  servenTrendIndex4++;
			  }else if(servenTrend==5){
				 servenTrendIndex5++;
			  }else if(servenTrend==6){
				  servenTrendIndex6++;
			  }
			  
			  //取红一区到红六区除3的余数
			  
			  if(i==0){
				  redIndex0 = mm%3;
			  }else if(i==1){
				  redIndex1 = mm%3;
			  }else if(i==2){
				  redIndex2 = mm%3;
			  }else if(i==3){
				  redIndex3 = mm%3;
			  }else if(i==4){
				  redIndex4 = mm%3;
			  }else if(i==5){
				  redIndex5 = mm%3;
			  } 
			  
		  }
		  //各路数相加和值
		  int sum = allSum(arr);
		  //跨度计算
		  distance = Integer.valueOf(arr[5]) - Integer.valueOf(arr[0]);
		  
		  /**质合   奇偶   大小   除3路   和值   和尾   基本走势(三分势)  基本走势(四分势)  基本走势(七分势)   红一到六区除3取余值    跨度**/
		  returnArr[0] = zIndex*10+hIndex;
		  returnArr[1] = oddIndex*10+evenIndex;
		  returnArr[2] = bigIndex*10+smallIndex;
		  returnArr[3] = divIndex0*100+divIndex1*10+divIndex2;
		  returnArr[4] = sum;
		  returnArr[5] = sum>100?sum%100:sum%10;
		  returnArr[6] = threeTrendIndex0*100+threeTrendIndex1*10+threeTrendIndex2;
		  returnArr[7] = fourTrendIndex0*1000+ fourTrendIndex1*100+fourTrendIndex2*10+fourTrendIndex3;
		  returnArr[8] = servenTrendIndex0*1000000+ servenTrendIndex1*100000+servenTrendIndex2*10000+servenTrendIndex3*1000+servenTrendIndex4*100+servenTrendIndex5*10+servenTrendIndex6;
		  returnArr[9] = redIndex0*100000+  redIndex1*10000+  redIndex2*1000+  redIndex3*100+  redIndex4*10+  redIndex5;
		  returnArr[10] =distance ;
		  
		  return returnArr;
	}
	
	/** 
     * 用于判断一个数是否为素数，若为素数，返回true,否则返回false 
     * @param a  输入的值 
     * @return true、false 
     */  
    public static boolean isPrime(int a) {  
  
        int index = 0;
        if (a < 2) {// 素数不小于2  
            return false;  
        } else {  
            for (int i = 2; i <= 33; i++) {  
                if (a % i == 0 && a>=i) {// 若能被整除，则说明不是素数，返回false  
                    index++; 
                }  
            }  
        }  
        if(index==1){
        	return true;
        }else{
        	return false;
        }
    }  
    /**
     * 是否奇偶  true奇 false偶
     * @return
     */
    public static boolean isOdevity(int num){
            if (num % 2 == 0){
            	return false;
            }else{
            	return true;
            } 
    }
    
    /**
     * 是否大小 17到33为大数返回  true 否则返回false
     * @return
     */
    public static boolean isBigOrSmall(int num){
    	if (num >=17){
    		return true;
    	}else{
    		return false;
    	} 
    }
    /**
     * 除3余数 余0返回  0 余1返回1 余3返回2
     * @return
     */
    public static int isDiv(int num){
	   int remainder = num % 3;
        if (remainder==0){
        	return 0;
        }else if(remainder==1){
        	return 1;
        }else if(remainder==2){
        	return 2;
        }  
        return 3;
    }
    
    /**
     * 和值
     * @return
     */
    public static int allSum(String[] arr){
    	int sum = 0;
    	for (int i = 0; i < arr.length; i++) {
			sum += Integer.valueOf(arr[i]);
		}
        return sum;
    }
    /**
     * 基本走势（三分走势）
     * @return
     */
    public static int threeTrend(int num){
    	        if (num<=11){
    	        	return 0;
    	        }else if(num>11 && num<=22){
    	        	return 1;
    	        }else if(num>22){
    	        	return 2;
    	        }  
    	        return 3;
    }
    /**
     * 基本走势（四分走势）
     * @return
     */
    public static int fourTrend(int num){
    	        if (num<=8){
    	        	return 0;
    	        }else if(num>8 && num<=16){
    	        	return 1;
    	        }else if(num>17 && num<=25){
    	        	return 2;
    	        }else if(num>25){
    	        	return 3;
    	        }  
    	        return 4;
    }
    /**
     * 基本走势（七分走势）
     * @return
     */
    public static int servenTrend(int num){
    	        if (num<=5){
    	        	return 0;
    	        }else if(num>5 && num<=10){
    	        	return 1;
    	        }else if(num>10 && num<=15){
    	        	return 2;
    	        }else if(num>15 && num<=20){
    	        	return 3;
    	        }else if(num>20 && num<=25){
    	        	return 4;
    	        }else if(num>25 && num<=30){
    	        	return 5;
    	        }else if(num>30){
    	        	return 6;
    	        }  
    	        return 7;
    }
    
    
    /******************************************以上红球玩法***********************************************/
    /******************************************以上蓝球玩法********************************************************************************************
     * * 奇偶 01    大小 01   质合非  012   012路  012  四区分布 0123  除四余数  0123***********************************************/
    public static int[] doBlueScale(String[] str,String param){
    	
		int[] returnArr = new int[7];
		for (int i = 0; i < str.length; i++) {
			int mm = Integer.parseInt(str[i]);
			//奇偶
			boolean isOdevity = isOdevity(mm);
			if(isOdevity){
				returnArr[0] = 0;
			}else{
				returnArr[0] = 1;
			}
			//大小
			boolean bigorsmall = blueIsBigOrSmall(mm);
			if(bigorsmall){
				returnArr[1] = 0;
			}else{
				returnArr[1] = 1;
			}
			//质合
			boolean isprime = isPrime(mm);
			if(mm==1){
				returnArr[2] =2;
			}else if(isprime){
				returnArr[2] = 0;
			}else{
				returnArr[2] = 1;
			}
			//012路
			int div = isDiv(mm);
			if(div==0){
				returnArr[3] = 0;
			}else if(div==1){
				returnArr[3] = 1;
			}else if(div==2){
				returnArr[3] = 2;
			}
			//四区分布
			int fourSubarea = fourSubarea(mm);
			if(fourSubarea==0){
				returnArr[4] = 0;
			}else if(fourSubarea==1){
				returnArr[4] = 1;
			}else if(fourSubarea==2){
				returnArr[4] = 2;
			}else if(fourSubarea==3){
				returnArr[4] = 3;
			}
			//除4余数
			int isDiv4 = isDiv4(mm);
			if(isDiv4==0){
				returnArr[5] = 0;
			}else if(isDiv4==1){
				returnArr[5] = 1;
			}else if(isDiv4==2){
				returnArr[5] = 2;
			}else if(isDiv4==3){
				returnArr[5] = 3;
			}
			
		   returnArr[6] = mm;
		   
		   String blueValue = returnArr[0]+""+returnArr[1]+""+returnArr[2]+""+returnArr[3]+""+returnArr[4]+""+returnArr[5];
		   if(param.equals(blueValue)){
			   return returnArr;
		   }
		}
		return returnArr;
	}
    /**
     * 是否大小 9到16为大数返回  true 否则返回false
     * @return
     */
    public static boolean blueIsBigOrSmall(int num){
    	if (num >=9){
    		return true;
    	}else{
    		return false;
    	} 
    }
    /**
     * 四区分布每个区间4个号码，
     * 一区为01—04，含01、02、03、04这4个号码；
     * 二区为05—08，含05、06、07、08这4个号码；
     * 三区为09—12，含09、10、11、12这4个号码；
     * 四区为13—16，含13、14、15、16这4个号码。
     * @return
     */
    public static int fourSubarea(int num){
    	if (num <=4){
    		return 0;
    	}else if(num>4 && num<=8){
    		return 1;
    	} else if(num>8 && num<=12){
    		return 2;
    	} else if(num>12 && num<=16){
    		return 3;
    	} 
    	return -1;
    }
    
    /**
     * 除4余数 余0返回  0 余1返回1 余2返回2 余3返回3
     * @return
     */
    public static int isDiv4(int num){
	   int remainder = num % 4;
        if (remainder==0){
        	return 0;
        }else if(remainder==1){
        	return 1;
        }else if(remainder==2){
        	return 2;
        } else if(remainder==3){
        	return 3;
        }  
        return -1;
    }
}
