interface A {
    int eng = 95;
    int che = 80;
}

interface B {
    int hin = 85;
    int phy = 90;
    int math = 80;
}

class Aug implements A, B {
    public static void main(String args[]) {
        Aug obj = new Aug();
        double average = ((obj.eng + obj.hin + obj.che + obj.phy + obj.math) / 5.0);
        System.out.println("Average is: " + average);
    }
}
