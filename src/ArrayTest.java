public class ArrayTest {
    public static void main(String[] args) {
        MyTools mt = new MyTools();
        int[] arr = {10, -1, 8, 0, 34};
        mt.bubble(arr);

        System.out.println("=====排序后的数组arr=====");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

class Person {
    int age;
    String name;
    //构造器
    public Person(int age) {
        this.age = age;
    }
}

//创一个类MyTools，编写一个方法，实现对int数组的冒泡排序
class MyTools {
    public void bubble(int[] arr) {
        //冒泡排序
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}


