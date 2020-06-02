package snackbarApp;

public class VendingMachine {
    private static int maxId = 0;
    private int id;
    private String name;

    public VendingMachine(String name) {
        maxId++;
        id = maxId;
        this.name = name;
    }

    // get method
    public int getId() 
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    // set methods
    public void setId(int id) 
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    // find the right Vending Machine

    @Override
    public String toString()
    {
        return "Name: " + name;
    }
}