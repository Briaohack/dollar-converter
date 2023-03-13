package util;

public class CurrencyConverter{

    public static double IOF = 0.06;

    public static double dollarToReal(double priceDolar, double dolarQuantity){
        return priceDolar * dolarQuantity * (IOF + 1.0);


        
        
    }


}