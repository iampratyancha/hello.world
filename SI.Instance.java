public class SI_Instance {
    float p;
    float r;
    int t;
    double SI;
    public void calculate_SI()
    {
      
        SI = (p*r*t)/100;
        System.out.println("Simple Intrest\n" +SI);
        
    }
    public static void main(String args [])
    {
        SI_Instance A1 = new SI_Instance();
        A1.p=1400;
        A1.r=3;
        A1.t=2;
         A1.calculate_SI();
         
    }
    
}
