package unl.soc;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class Dollar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please input the total amount of US Dollars: ");
        BigDecimal USD = BigDecimal.valueOf(Double.parseDouble(scan.nextLine()));
        BigDecimal fee=USD.multiply(BigDecimal.valueOf(0.10));
        System.out.println("Fee (10%): $"+ fee);
        System.out.println("You get:");
        BigDecimal GBP=USD.multiply(BigDecimal.valueOf(0.45*0.79));
        System.out.printf("%.2f GBP\n",GBP);
        BigDecimal Yen=USD.multiply(BigDecimal.valueOf(0.45*127.65));
        System.out.printf("%.4f YEN\n",Yen);
        BigInteger YEN= USD.multiply(BigDecimal.valueOf(0.45*127.65)).toBigInteger();
        System.out.println(YEN+" YEN");
    }
}
