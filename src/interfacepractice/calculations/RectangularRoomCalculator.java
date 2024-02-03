package interfacepractice.calculations;

public class RectangularRoomCalculator implements GeometricalCalculations{

    @Override
    public void getArea(double length, double width) {
        double area = length * width;
        System.out.println("The rectangular room area is: " + area);
    }


    @Override
    public void getPerimeter(double length, double width) {
        double perimeter = 2 * (length + width);
        System.out.println("The rectangular room perimeter is: " + perimeter);
    }
}
