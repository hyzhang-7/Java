public class template {
    public static void main(String[] args) {
        Circle c = new Circle();
        PassObject p = new PassObject();
        p.printAreas(c, 5);
    }
}

class Circle {
    double radius;

    public double findArea() {
        return Math.PI * radius * radius;
    }

    //添加一个方法，用来修改对象的半径
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class PassObject {
    public void printAreas(Circle c, int times) {
        System.out.println("Radius\tArea");
        for (int i = 1; i <= times; i++) {
            c.radius = i; //或者不定义这个方法，直接用c.radius = i
            System.out.println(i + "\t" + "\t" + c.findArea());
        }
    }
}