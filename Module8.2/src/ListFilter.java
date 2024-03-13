import java.util.*;
import java.util.stream.*;
public class ListFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd numbers: " + oddNumbers);
        List<Integer>doubledNumbers = oddNumbers.stream().map(n->n*2).collect(Collectors.toList());
        System.out.println("Doubled numbers: "+ doubledNumbers);
        int sum = doubledNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: "+sum);
    }
}
