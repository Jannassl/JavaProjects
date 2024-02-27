class NumberPrinter implements Runnable {
    private int start =1;
    private int end;
    private boolean isEven;

    public NumberPrinter(int end, boolean isEven) {
        this.end = end;

    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if ((i % 2 == 0 && isEven) || (i % 2 != 0 && !isEven)) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 20;
        Thread evenThread = new Thread(new NumberPrinter(end, true), "Even Thread");
        Thread oddThread = new Thread(new NumberPrinter(end, false), "Odd Thread");


        oddThread.start();
        evenThread.start();
    }
}

