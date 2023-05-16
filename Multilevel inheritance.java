import java.util.Scanner;

class A {
    int h = 19;
}

class B extends A {
    int c = 45;
}

class C extends B {
    int m = 50;
}

class D extends C {
    int s = 35;
}

class E extends D {
    int c = 40;
}

class Avg {
    public static void main(String args[]) {
        E obj = new E();
        int sum = (obj.h + obj.c + obj.m + obj.s + obj.c);
        double avg = (double) sum / 5.0;
        System.out.println(avg);
    }
}
