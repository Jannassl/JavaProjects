```
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
```
<p> The calculator apps takes two numbers and adds them together.</p>
<p> The sum method is modified to use a while loop to add up the number1 to the sum of number1 and number2.</p>
<p> The reset method resets the result to 0.</p>
<p> The getResult method returns the result.</p>
