public class AOC_Instance {
    double radius;
    double area;
    public void calculate_area()
    {
        area = 3.14*radius*radius;
        System.out.println("Area of circle is\n" +area);
    }


    public static void main (String args[])
    {
        AOC_Instance A1 = new AOC_Instance();
        A1.radius=3.2;
        A1.calculate_area();
    }
}
