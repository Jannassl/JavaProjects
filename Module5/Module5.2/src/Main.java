class Customer {
    private int id;

    public Customer(int id, int tickets){
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void reserveTickets(int num){
        Main.tickets -= num;
    }
}







public class Main {
    static int tickets = 10;
    public static void main(String[] args) {

    }
}
