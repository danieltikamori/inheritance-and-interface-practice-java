package interfacepractice.model;

import interfacepractice.financial.Calculable;

public class Book extends Product implements Calculable {
    private String author;

    @Override
    public double calculateFinalPrice() {
        return productPrice * 0.9;
    }
}
