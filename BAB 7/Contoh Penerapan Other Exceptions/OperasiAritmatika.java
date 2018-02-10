import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperasiAritmatika {

    public static void main(String[] args) {
        BigDecimal x=new BigDecimal(22);
        BigDecimal y=new BigDecimal(7);

        try {
            System.out.println(x.divide(y));
        } catch (ArithmeticException e) {
            System.out.println(x.divide(y,7, RoundingMode.CEILING));
        }
    }
}
