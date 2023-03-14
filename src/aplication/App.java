import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class App {
    public static void main(String[] args) throws Exception {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price?");
        double dolarPrice = sc.nextDouble();
        System.out.print("How many dollar will be bought? ");
        double dolarQuantity = sc.nextDouble();

        double result = CurrencyConverter.dollarToReal(dolarPrice, dolarQuantity);
        System.out.println(result);




        sc.close();
        

}
}
