import interfacepractice.calculations.MultiplicationTable;
import interfacepractice.calculations.RectangularRoomCalculator;
import interfacepractice.calculations.StandardTemperatureConverter;
import interfacepractice.financial.CurrencyConverter;


public class Main {
    public static <rectangularRoomCalculator> void main(String[] args) {

        CurrencyConverter financialConversion = new CurrencyConverter();
        financialConversion.getConvertUSDtoJPY(100);

        System.out.println("\n###############\n");

        RectangularRoomCalculator rectangularRoomCalculator = new RectangularRoomCalculator();
        rectangularRoomCalculator.getArea(7, 16);
        rectangularRoomCalculator.getPerimeter(7, 16);

        System.out.println("\n###############\n");

        MultiplicationTable multiplicationTable = new MultiplicationTable();

        multiplicationTable.getTable(8);

        System.out.println("\n###############\n");

        StandardTemperatureConverter standardTemperatureConverter = new StandardTemperatureConverter();
        double celsiusTemperature = 100;
        double fahrenheitTemperature = standardTemperatureConverter.convertCelsiusToFahrenheit(celsiusTemperature);
        System.out.println(celsiusTemperature + "°C is equal to " + fahrenheitTemperature + "°F");
        fahrenheitTemperature = 212;
        celsiusTemperature = standardTemperatureConverter.convertFahrenheitToCelsius(fahrenheitTemperature);
        System.out.println(fahrenheitTemperature + "°F is equal to " + celsiusTemperature + "°C");

        System.out.println("\n###############\n");



    }
}
