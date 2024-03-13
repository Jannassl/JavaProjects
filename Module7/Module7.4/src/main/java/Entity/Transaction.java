package Entity;

import jakarta.persistence.*;

@Entity

public class Transaction {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private double amount;

    public Transaction( double amount){
        this.amount = amount;

    }
    public Transaction(){

    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
