public class Avg_Instant { 
    double num1;
    double num2;
    double num3;
    double avg;

    public void averageCalculator()
    {
        avg=(num1+num2+num3)/3;
        System.out.println("Average="+avg);
    }
    public static void main(String args[])
    {
        Avg_Instant avg1= new Avg_Instant();
        avg1.num1=97;
        avg1.num2=47;
        avg1.num3=67;
        avg1.averageCalculator();
    }
   
}
