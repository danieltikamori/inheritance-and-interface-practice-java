package interfacepractice.financial;

public interface Salable {

    double calculateTotalPrice(int productQuantity);
    void applyDiscount(double discountPercentage);
}
