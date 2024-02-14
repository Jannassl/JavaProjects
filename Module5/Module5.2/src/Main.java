class Theater {
    private int totalSeats;
    private int availableSeats;

    public Theater(int totalSeats) {
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    public synchronized boolean bookSeats(int numSeats) {
        if (numSeats <= availableSeats) {
            availableSeats -= numSeats;
            System.out.println(Thread.currentThread().getName() + " booked " + numSeats + " tickets. Available seats: " + availableSeats);
            return true;
        } else {
            System.out.println(Thread.currentThread().getName() + " couldn't book " + numSeats + " tickets. Not enough seats available.");
            return false;
        }
    }
}
class Customer extends Thread {
    private Theater theater;
    private int numSeats;

    public Customer(Theater theater, int numSeats, String name) {
        super(name);
        this.theater = theater;
        this.numSeats = numSeats;
    }

    @Override
    public void run() {
        boolean success = theater.bookSeats(numSeats);
        if (!success) {
            System.out.println(Thread.currentThread().getName() + " couldn't book tickets. Exiting...");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater(10);

        // Create multiple customer threads
        Thread[] customers = new Thread[10];
        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer(theater, (int) (Math.random() * 4) + 1, "Customer-" + (i + 1));
            customers[i].start();
        }

        for (Thread customer : customers) {
            try {
                customer.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
