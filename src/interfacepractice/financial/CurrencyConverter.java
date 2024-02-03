package interfacepractice.financial;

public class CurrencyConverter implements FinancialConversion {

    @Override
    public void getConvertUSDtoJPY(double usdAmount) {
        double usdJpy = 140;
        double jpyAmount = usdAmount * usdJpy;
        System.out.println("The amount in JPY is: " + jpyAmount);
    }
}
