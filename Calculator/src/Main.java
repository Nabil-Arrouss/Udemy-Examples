public class Main {
    public static void main(String[] args) {

        // Creating an instance of SimpleCalculator
        SimpleCalculator calculator = new SimpleCalculator();

        // Test 1: Addition with positive numbers
        calculator.setFirstNum(5.0);
        calculator.setSecondNum(4);
        calculator.getAdditionResult();

        // Test 2: Subtraction with negative result
        calculator.setFirstNum(3.5);
        calculator.setSecondNum(6.8);
        calculator.getSubtraction();

        // Test 3: Multiplication with one zero
        calculator.setFirstNum(7);
        calculator.setSecondNum(0);
        calculator.getMultiplication();

        // Test 4: Division with division by zero
        calculator.setFirstNum(10);
        calculator.setSecondNum(0);
        calculator.getDivision();

        // Test 5: Division with fractional result
        calculator.setFirstNum(15);
        calculator.setSecondNum(4);
        calculator.getDivision();

        // Test 6: Combination of operations
        calculator.setFirstNum(20);
        calculator.setSecondNum(5);
        calculator.getAdditionResult();
        calculator.getSubtraction();
        calculator.getMultiplication();
        calculator.getDivision();
    }
}
