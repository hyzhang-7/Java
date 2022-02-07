package com.hspedu.debug_;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int arr[] = {8, -1, 199, 70, 10};
        //用debug查看sort源码的实现
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
