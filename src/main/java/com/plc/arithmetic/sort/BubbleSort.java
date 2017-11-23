package com.plc.arithmetic.sort;

/**
 * 冒泡排序
 * Created by 003914[panlc] on 2017-11-23.
 */
public class BubbleSort {

    public static int[] sort(int[] in) {
        int minSort = 2;
        if (in == null || in.length < minSort) {
            return in;
        }
        for (int i = 0; i < in.length - 1; i++) {
            for(int j = in.length - 1; j > i; j--) {
                int m = in[j];
                int n = in[j - 1];
                if (m < n) {
                    in[j] = n;
                    in[j - 1] = m;
                }
            }
        }
        return in;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 9, 8, 6, 2};
        int[] sort = sort(a);
        for (int i : sort) {
            System.out.print(i + " ");
        }
    }
}
