class InstancePythagoras{
    double adj=19,opp=7;
    public static void main(String main[]){
        InstancePythagoras obj = new InstancePythagoras();
        double hypo1 = (Math.pow(obj.adj,2))+(Math.pow(obj.opp,2));
        hypo1 = Math.sqrt(hypo1);
        System.out.println("Hypotenuse: "+ hypo1);
    }
}
