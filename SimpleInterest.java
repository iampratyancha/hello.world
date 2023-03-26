class SimpleInterest{
    int p=32,r=5,t=2;
    public static void main(String args[]){
        SimpleInterest obj = new SimpleInterest();
        float SI = (float)(obj.p*obj.r*obj.t)/100;
        System.out.println("The simple interest calculated is: "+ SI);
    }
}
