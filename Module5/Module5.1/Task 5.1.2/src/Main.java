import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SumCalculator implements Runnable {
    private final int[] numbers;
    private final int start;
    private final int end;
    private long partialSum;

    public SumCalculator(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        this.partialSum = 0;
    }

    public long getPartialSum() {
        return partialSum;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            partialSum += numbers[i];
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        int chunkSize = numbers.length / numThreads;
        int start = 0;
        int end = chunkSize;

        // käskyjen anto
        SumCalculator[] calculators = new SumCalculator[numThreads];
        for (int i = 0; i < numThreads; i++) {
            if (i == numThreads - 1) {
                end = numbers.length;
            }
            calculators[i] = new SumCalculator(numbers, start, end);
            executor.execute(calculators[i]);
            start = end;
            end = start + chunkSize;
        }


        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            System.err.println("Error waiting for threads to finish: " + e.getMessage());
        }

        // laske summa
        long totalSum = 0;
        for (SumCalculator calculator : calculators) {
            totalSum += calculator.getPartialSum();
        }

        System.out.println("Total sum: " + totalSum);
    }
}
