public class Calculator {
    public static void main(String[] args){
        double firstvalue=Double.parseDouble(args[0]);
        double secondvalue=Double.parseDouble(args[1]);
     double result = firstvalue +secondvalue;
    }
    public double addition(double first,double second){
        double result=first + second;
        return  result;
    }
}
