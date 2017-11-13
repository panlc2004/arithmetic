package com.plc.arithmetic.sort;

import com.sun.istack.internal.NotNull;

/**
 * Created by 003914[panlc] on 2017-11-10.
 */
public class SelectionSort {

    /**
     * 获最小值
     *
     * @param in
     * @return
     */
    public static int findMinValueIndex(@NotNull int[] in, int begin, int end) {
        if (in == null || in.length == 0) {
            throw new IllegalArgumentException("in can not be null and length can not be zero");
        }
        if (end < begin) {
            throw new IllegalArgumentException("param 'end' must be bigger than 'begin'");
        }
        if (end > in.length) {
            throw new IllegalArgumentException("the end if out of range of the input array");
        }
        //满足计算的最小长度
        int minCompLen = 1;
        if (in.length == minCompLen) {
            return in[0];
        }
        //查找最小值的位置
        //初始化最小值位置
        int tempMinIndex = begin;
        //初始化最小值
        int tempMinValue = in[tempMinIndex];
        for (int i = begin; i < end; i++) {
            if (in[i] < tempMinValue) {
                tempMinValue = in[i];
                tempMinIndex = i;
            }
        }
        return tempMinIndex;
    }

    public static int[] sort(int[] in) {
        int length = in.length;
        for (int i = 0; i < length; i++) {
            int minIndex = findMinValueIndex(in, i, length);
            int temp = in[i];
            in[i] = in[minIndex];
            in[minIndex] = temp;
        }
        return in;
    }

    public static void main(String[] args) {
        int[] in = new int[]{12, 3, 4, 1, 5, 6, 4, 2, 3, 0};
        int[] sort = sort(in);
        for (int i : sort) {
            System.out.print(i + " ");
        }
    }
}
