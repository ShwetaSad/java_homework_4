package javahomework4;

public class SimpleCalculator {
    /*
        Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
names firstNumber and secondNumber both of type double.
     */
    double firstNumber;
    double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;

    } public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
        return firstNumber + secondNumber;

    } public double getSubtractionResult(){
        return firstNumber - secondNumber;

    } public double getMultiplicationResult(){
        return firstNumber * secondNumber;

    } public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;  // Return 0 if secondNumber is 0 to avoid division by zero
        } else {
            return firstNumber / secondNumber;
        }
        }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
    }
