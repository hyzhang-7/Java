package com.hspedu.extends_.xijie1;

public class Sub extends Base{
    public Sub() { //无参构造器
    }
    public void sayOk() {
        System.out.println(n1 + " " + n2 + " " + n3);
        test1();
        test2();
        test3(); //由于n4和test4是private所以无法直接访问

        //可以使用父类提供的公共方法来访问
        System.out.println(getN4());
        call_test4();
    }
}
