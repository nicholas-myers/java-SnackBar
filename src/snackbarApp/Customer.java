package snackbarApp;

public class Customer {
    private static int maxId = 0;

    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand) {
        maxId++;
        id = maxId;
        this.cashOnHand = cashOnHand;
    }

    // get methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    // set methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }
    // change the cash on Hand

    public void buySnacks(double snackCost, int snacksPurchased) {
        this.cashOnHand -= snackCost * snacksPurchased;
    }

    public void findCash(double foundCash)
    {
        this.cashOnHand += foundCash;
    }
    

}