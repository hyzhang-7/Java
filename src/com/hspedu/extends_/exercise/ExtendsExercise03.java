package com.hspedu.extends_.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("Intel", 16, 512, "IBM");
        pc.getInfo();
    }
}

class Computer {
    private String CPU;
    private int memory;
    private int disc;

    //构造器
    public Computer(String CPU, int memory, int disc) {
        this.CPU = CPU;
        this.memory = memory;
        this.disc = disc;
    }

    //封装
    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisc() {
        return disc;
    }

    public void setDisc(int disc) {
        this.disc = disc;
    }

    //打印信息
    public String getDetails() {
        return "CPU: " + CPU + " 内存: " + memory + " 硬盘: " + disc;
    }
}

class PC extends Computer {
    private String brand; //注意是private

    public PC(String CPU, int memory, int disc, String brand) {
        super(CPU, memory, disc);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void getInfo() {
        System.out.println(getDetails() + " brand: " + brand);
    }
}
