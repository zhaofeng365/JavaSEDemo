package com;
/**
 * 求一个数的原码和补码
 * @author Administrator
 *
 */
public class BinaryTest {

    public static void main(String[] args) {
        int n = 3,m=4;
        System.out.println(n/m);
        System.out.println(n%m);
         /*MyBinary mb = new MyBinary(n);
        System.out.println("+"+n+"原码:");
        mb.YuanMa();
        System.out.println("+"+n+"补码");
        mb.YuanMa();
        System.out.println("-"+n+"原码:");
        mb.YuanMa();
        System.out.println("-"+n+"补码");
        mb.BuMa();*/
    }
}


  class MyBinary {
    
    int ib;
    int[] bin = new int[8];    //存放整数负数 转换的二进制
    int[] ym = new int[8];    //存放原码
    int[] bm = new int[8];    //存放补码
    
    public MyBinary() {
        
    }
    
    public MyBinary(int ib) {
        this.ib = ib;
    }
    
    /**
     *数负数转换二进制
     */
    public void toBinary() {
        int ib = this.ib;
        for (int i = 7; i >= 0; i--) {
            if (ib >= 0) {
                bin[i] = ib%2;
            } else {
                bin[i] = -(ib%2);
            }
            
            ib = ib/2;
        }
    }
    
    /**
     *数负数转换二进制
     *函数重载
     */
    public void toBinary(int arr[]) {
        int ib = this.ib;
        for (int i = 7; i >= 0; i--) {
            if (ib >= 0) {
                arr[i] = ib%2;
            } else {
                arr[i] = -(ib%2);
            }
            
            ib = ib/2;
        }
        
    }
    
    /**
     * 原码存放
     */
    public void YuanMa() {
        this.toBinary();
        toBinary(ym);
        for (int i = 0; i < 8; i++) {
            System.out.print(ym[i]);
        }
        System.out.println();
    }
    /**
     * 补码
     */
    public void BuMa() {
        this.toBinary();
        toBinary(bm);
        qF();
        J1();
        for (int i = 0; i < 8; i++) {
            System.out.print(bm[i]);
        }
        System.out.println();
    }
    /**
     * 取反
     */
    private void qF() {
        for (int i = 0; i < 8; i++) {
            if (bm[i] == 0) {
                bm[i] = 1;
            } else {
                bm[i] = 0;
            }
        }
    }
    /**
     * 加1
     */
    private void J1() {
        int j = 1;
        for (int i = 7; i >= 0 && j == 1; i--) {
            if(bm[i] == 1){
                j = 1;
            }
            else {
                j = 0;
            }
            bm[i] +=1;
            bm[i]%=2;
        }
    }
    
    /**
     * 打印数组
     */
    public void pBinary() {
        
        for (int i = 0; i < 8; i++) {
            System.out.print(ym[i]);
        }
        
    }
    
}

