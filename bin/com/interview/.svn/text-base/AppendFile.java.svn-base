package com.interview;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;

  
/** 
 * 
 */  
public class AppendFile {  
       
    
    /**   
     * 追加文件：使用RandomAccessFile   
     *    
     * @param fileName 文件�?  
     * @param content 追加的内�?  
     */    
    public static  void randomAccessFile(String fileName, String content) {   
        RandomAccessFile randomFile = null;  
        try {     
            // 打开�?��随机访问文件流，按读写方�?     
            randomFile = new RandomAccessFile(fileName, "rw");     
            // 文件长度，字节数      
            long fileLength = randomFile.length();     
            // 将写文件指针移到文件尾�?      
            randomFile.seek(fileLength);     
            randomFile.writeBytes(content);      
        } catch (IOException e) {     
            e.printStackTrace();     
        } finally{  
            if(randomFile != null){  
                try {  
                    randomFile.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }    
  
  
    public static String getFileName(String action) {
		String sdf = new SimpleDateFormat("yyyyMMdd").format(new Date())+action+".txt";
		return sdf;
	}
    /**
	 * 根据路径创建�?��列的目录
	 * 
	 * @param path
	 */
	public static  String makeDirectory(String sn) {
		String dirPath = "D:/ZkPushLog/"+sn+"/";
		File file = null;
		try {
			file = new File(dirPath);
			if (!file.exists()) {
				  file.mkdirs();
			}  
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			file = null;
		}
		return dirPath;
	}	
	
	 
	public static void writePushLog(String SN,String content,String action) throws IOException{
		 String path = makeDirectory(SN);
	      String fileName = getFileName(action); 
	      content = new String(content.getBytes("UTF-8"),"ISO-8859-1");
	     randomAccessFile(path+fileName,content);
	}
    
}  

