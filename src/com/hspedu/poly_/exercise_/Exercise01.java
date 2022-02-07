package com.hspedu.poly_.exercise_;

//判断哪些是错的
public class Exercise01 {
    public static void main(String[] args) {
        double d = 13.4;
        long l = (long) d;
        System.out.println(l);
        int in = 5;
       // boolean b = (boolean)in;
        Object obj = "Hello";
        String objStr = (String) obj;
        System.out.println(objStr);

       // Object objPri = new Integer(5);
       // String str = (String) objPri;
       // Integer str1 = (Integer) objPri;
    }
}
