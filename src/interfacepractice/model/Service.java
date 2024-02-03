package interfacepractice.model;
import interfacepractice.financial.Salable;

public class Service implements Salable {
    private String serviceDescription;
    private double hourlyRate;
    @Override
    public double calculateTotalPrice(int productQuantity) {
        return hourlyRate * productQuantity;

    }

    @Override
    public void applyDiscount(double discountPercentage) {
        hourlyRate -= hourlyRate * (discountPercentage / 100);
    }
}
