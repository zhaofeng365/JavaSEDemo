package com.interview;

import java.util.LinkedList;

public class Combinatory {
    public static void main(String[] args) throws InterruptedException {
        char[] chs = "ABCD".toCharArray();
        int maxCount = 2;

        LinkedList<Character> result = new LinkedList<Character>();
        combination(chs, 0, 0, maxCount, "");
        System.out.println("++++++++++++++++++++++++++++++++++");
        combination(chs, 0, 0, maxCount, result);
    }

    public static void combination(char[] chs, int index, int count, int maxCount, LinkedList<Character> result) {
        if (count == maxCount) {
            System.out.println(result);
            return;
        }

        for (int i = index; i < chs.length; ++i) {
            result.addLast(chs[i]);
            combination(chs, i + 1, count + 1, maxCount, result);
            result.removeLast();
        }
    }

    public static void combination(char[] chs, int index, int count, int maxCount, String result) {
        if (count == maxCount) {
            System.out.println(result);
            return;
        }

        for (int i = index; i < chs.length; ++i) {
            combination(chs, i + 1, count + 1, maxCount, result + chs[i] + " ");
        }
    }
}