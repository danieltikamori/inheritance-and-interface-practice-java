package interfacepractice.model;
import interfacepractice.financial.Calculable;

public class PhysicalProduct extends Product implements Calculable {
    @Override
    public double calculateFinalPrice() {
        return productPrice * 1.05;
    }
}
