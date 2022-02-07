package com.hspedu.pkg;

import java.util.Arrays;

public class Import01 {
    public static void main(String[] args) {
        //使用系统提供的Arrays完成数组排序
        int[] arr = {-1, 20, 21, 34};
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }
}
