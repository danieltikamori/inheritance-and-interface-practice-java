package interfacepractice.calculations;

public class MultiplicationTable implements Tables{

    @Override
    public void getTable(int numberToMultiply) {
        System.out.println("The multiplication table of " + numberToMultiply + " is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numberToMultiply + " * " + i + " = " + numberToMultiply * i);
        }
    }
}
