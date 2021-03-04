package ictgradschool.industry.introtojava.myfirstprogram;

public class MyFirstProgram {
    public void start(String name) {
        System.out.println("Hello " + name);
    }
    
    public static void main(String[] args) {
        MyFirstProgram p = new MyFirstProgram();
        p.start(args[0]);
    }
}
