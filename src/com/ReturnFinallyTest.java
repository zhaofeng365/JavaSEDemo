package com;

public class ReturnFinallyTest {
	    public int aaa() {
	        int x = 1;

	        try {
	            return ++x;
	        } catch (Exception e) {

	        } finally {
	            ++x;
	        }
	        return ++x;
	    }

	    public static void main(String[] args) {
	    	ReturnFinallyTest t = new ReturnFinallyTest();
	        int y = t.aaa();
	        System.out.println(y);
	    }
}
