package snackbarApp;

public class Main {
   private static void workWithData() {
      VendingMachine food = new VendingMachine("Food");
      VendingMachine drink = new VendingMachine("Drink");
      VendingMachine office = new VendingMachine("Office");
      Snack chips = new Snack("Chips", 36, 1.75, food.getId()); // snack 1
      Snack chocolateBar = new Snack("Chocolate Bar", 35, 1.00, food.getId()); // snack 2
      Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId()); //snack 3
      Snack soda = new Snack("Soda", 24, 2.50, drink.getId()); //snack 4
      Snack water = new Snack("Water", 20, 2.75, drink.getId()); //snack 5
      Customer jane = new Customer("Jane", 45.25); //customer 2
      Customer bob = new Customer("Bob", 33.14); //customer1
      //methods to do math
      //customer buys a item and the cost is deducted from their cashOnHand
      

      System.out.println("*** Check the Data being Returned");
      System.out.println(food.toString());
      System.out.println("Customer 1 buys 3 of snack 4.");
      jane.buySnacks(soda.getCost(), 3);
      System.out.println("Customer 1 Cash on Hand: " + jane.getCashOnHand());
      soda.removeSnacks(3);
      System.out.println("Quantity of snack 4 is " + soda.getQuantity());
      System.out.println("Customer 1 buys 1 of snack 3.");
      jane.buySnacks(pretzel.getCost(), 1);
      pretzel.removeSnacks(1);
      System.out.println("Customer 1 Cash on Hand: " + jane.getCashOnHand());
      System.out.println("Quantity of snack 3 is " + pretzel.getQuantity());

   }

   public static void main(String[] args)
   {
      workWithData();
   }
}