public class SimpleCalculator {

    private double firstNum;
    private double secondNum;


    public double getAdditionResult() {
        double result = firstNum + secondNum;
        System.out.println("The sum of " + firstNum + " and " + secondNum + " is: " + result);
        return result;
    }

    public double getSubtraction() {
        double result = firstNum - secondNum;
        System.out.println("The subtraction of " + firstNum + " and " + secondNum + " is: " + result);
        return result;
    }

    public double getMultiplication() {
        double result = secondNum * firstNum;
        System.out.println("The multiplication of " + firstNum + " and " + secondNum + " is: " + result);
        return result;
    }

    public double getDivision (){
        if (secondNum == 0){
            System.out.println("Invalid! Division by zero.");
        }else {
            System.out.println("The division of " + firstNum + " and " + secondNum + " is: " + (firstNum / secondNum));
        }
         return firstNum / secondNum;
    }
            // Getters and Setters methods
    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }
}