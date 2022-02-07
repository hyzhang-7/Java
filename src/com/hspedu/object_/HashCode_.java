package com.hspedu.object_;

public class HashCode_ {
    public static void main(String[] args) {
        AA a1 = new AA();
        AA a2 = new AA();
        AA a3 = a1;
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());
    }
}

class AA {
}