package com.proxy;

public class FinalizeCase {
	 
    private static Block holder = null;
 
    public static void main(String[] args) throws Exception {
        holder = new Block();
        holder = null;
        System.gc();
        System.out.println("ddddddddd");
    }
 
    static class Block {
        byte[] _200M = new byte[200*1024*1024];

		@Override
		protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
			System.out.println("finalize()");
			super.finalize();
		}
        
    }
}