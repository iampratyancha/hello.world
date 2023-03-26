public class Student {
    int rollNumber;
    String name;
    double height;
    public void talk()
    {
        System.out.println("My name is\n" +name);
        System.out.println("My rollNumber is\n" +rollNumber);
        System.out.println("My height is\n" +height);
    }
 public static void main (String args[])
 {
    Student pratyancha = new Student ();
    pratyancha.rollNumber = 106;
    pratyancha.name = "pratyancha";
    pratyancha.height = 5.1;
    pratyancha.talk();
 }

}
