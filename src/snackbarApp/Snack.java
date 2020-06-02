package snackbarApp;

public class Snack
{
   private static int maxId = 0;
   private int id;
   private String name;
   private int quantity;
   private double cost;
   private int vendingMachineId;

   public Snack(String name, int quantity, double cost, int vendingMachineId)
   {
      maxId++;
      id = maxId;
      this.name = name;
      this.quantity = quantity;
      this.cost = cost;
      this.vendingMachineId = vendingMachineId;
   }
   // get methods
   public int getId()
   {
      return id;
   }
   public String getName()
   {
      return name;
   }
   public int getQuantity()
   {
      return quantity;
   }
   public double getCost()
   {
      return cost;
   }
   public int getVendingMachineId()
   {
      return vendingMachineId;
   }
   // set Method
   public void setId(int id)
   {
      this.id = id;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public void setQuantity(int quantity)
   {
      this.quantity = quantity;
   }
   public void setCost(double cost)
   {
      this.cost = cost;
   }
   public void setVendingMachineId(int vendingMachineId)
   {
      this.vendingMachineId = vendingMachineId;
   }
   // a customer buys a snack
   public void removeSnacks(int snacksPurchased)
   {
      this.quantity -= snacksPurchased;
   }
   public void restockSnacks(int snacksAdded)
   {
      this.quantity += snacksAdded;
   }
}