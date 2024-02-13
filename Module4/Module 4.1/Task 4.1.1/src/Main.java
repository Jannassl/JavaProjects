class Calculator {
    private int result = 0;

    // modify the sum method to use while loop to add up the number1 to the sum of number1 and number2
    public void sum (int number1, int number2) {
        int i = 0;
        while(i < (number1 + number2)) {
            result++;
            i++;
        }
    }
    public void reset() {
        result = 0;
    }
    public int getResult() {
        return result;
    }

}




public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(5, 5);
        System.out.println(calculator.getResult());
        calculator.reset();
        System.out.println(calculator.getResult());

    }
}
