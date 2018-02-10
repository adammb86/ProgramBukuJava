import java.util.Scanner;

public class ExceptionHandling {

    public static double exceptionIf(double a,double b){
        if(b!=0)
            return a/b;
        else
            return 0;
    }

    public static double exceptionTryCatch(double a,double b){
        try {
            return a/b;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        double a,b;

        Scanner input=new Scanner(System.in);
        a=input.nextDouble();
        b=input.nextDouble();

        System.out.println(exceptionIf(a,b));
        System.out.println(exceptionTryCatch(a,b));
    }
}
