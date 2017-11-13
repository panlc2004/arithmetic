package com.plc.arithmetic.sort;

/**
 * 插入排序法
 * Created by 003914[panlc] on 2017-11-07.
 */
public class InsertionSort {

    public static Integer[] sort(Integer[] in) {
        if (in == null) {
            return null;
        }
        //待排序数据长度
        int len = in.length;
        //满足排序条件的最小输入数组长度
        int minLen = 2;

        if (len < minLen) {
            return in;
        }

        for (int j = 1; j < len; j++) {
            int key = in[j];
            int i = j - 1;
            /*
            设:已排序好的部分为in,长度为len;新加入一个排序值为X
            当in[len - 1] > X 时，则把A[len]向后移动一位，即：A[len + 1] = A[lenA]
            再对比in[len - 2]与X的大小，重复上述过程
            如果发现in[len - j] > X,则X找到位置，停止向右移动in，并把X放在len - j + 1的位置
             */
            while (i >= 0 && in[i] > key) {
                in[i + 1] = in[i];
                i = i - 1;
            }
            in[i + 1] = key;
        }

        return in;
    }

    public static void main(String[] args) {
        Integer[] in = new Integer[]{5, 2, 4, 6, 1, 3};
        Integer[] sort = sort(in);
        for (Integer i : sort) {
            System.out.printf(i + " ");
        }
    }

}
