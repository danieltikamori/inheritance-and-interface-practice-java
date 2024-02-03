package interfacepractice.model;

import interfacepractice.financial.Salable;

public class Product implements Salable {
    private String productName;
    double productPrice;


    @Override
    public double calculateTotalPrice(int productQuantity) {
        return productPrice * productQuantity;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        productPrice -= productPrice * (discountPercentage / 100) ;
    }
}
