package snackbarApp;

public class Main {
   private static void workWithData() {
      VendingMachine food = new VendingMachine("Food");
      VendingMachine drink = new VendingMachine("Drink");
      VendingMachine office = new VendingMachine("Office");
      Snack chips = new Snack("Chips", 36, 1.75, food.getId()); // snack 1
      Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId()); // snack 2
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
      System.out.println("Customer 2 buys 2 of snack 4.");
      bob.buySnacks(soda.getCost(), 2);
      soda.removeSnacks(2);
      System.out.println("Customer 3 Cash on Hand: " + bob.getCashOnHand());
      System.out.println("Quantity of snack 4 is " + soda.getQuantity());
      jane.findCash(10.00);
      System.out.println("Customer 1 Cash on Hand: " + jane.getCashOnHand());
      System.out.println("Customer 1 buys 1 of snack 2.");
      jane.buySnacks(chocolateBar.getCost(), 1);
      chocolateBar.removeSnacks(1);
      System.out.println("Customer 1 Cash on Hand: " + jane.getCashOnHand());
      System.out.println("Quantity of Snack 2: " + chocolateBar.getQuantity());
      pretzel.restockSnacks(12);
      System.out.println("Quantity of Snack 3: " + pretzel.getQuantity());
      System.out.println("Customer 2 buys 3 of snack 3.");
      bob.buySnacks(pretzel.getCost(), 3);
      pretzel.removeSnacks(3);
      System.out.println("Customer 2 Cash on Hand: " + bob.getCashOnHand());
      System.out.println("Quantity of Snack 3: " + pretzel.getQuantity());
      System.out.println();
      System.out.println("*** STRETCH ***");
      System.out.println();
      System.out.println("Snack: " + chips.getName());
      System.out.println("Vending Machine: " + food.getName() );
      System.out.println("Quantity: " + chips.getQuantity() );
      double totalChipCost = chips.getQuantity() * chips.getCost();
      System.out.printf("Total Cost: $%.2f %n", totalChipCost);
      System.out.println();
      System.out.println("Snack: " + chocolateBar.getName());
      System.out.println("Vending Machine: " + food.getName() );
      System.out.println("Quantity: " + chocolateBar.getQuantity() );
      double totalChocolateBarCost = chocolateBar.getQuantity() * chocolateBar.getCost();
      System.out.printf("Total Cost: $%.2f %n", totalChocolateBarCost);
      System.out.println();
      System.out.println("Snack: " + pretzel.getName());
      System.out.println("Vending Machine: " + food.getName() );
      System.out.println("Quantity: " + pretzel.getQuantity() );
      double totalPretzelCost = pretzel.getQuantity() * pretzel.getCost();
      System.out.printf("Total Cost: $%.2f %n", totalPretzelCost);
      System.out.println();
      System.out.println("Snack: " + soda.getName());
      System.out.println("Vending Machine: " + drink.getName() );
      System.out.println("Quantity: " + soda.getQuantity() );
      double totalSodaCost = soda.getQuantity() * soda.getCost();
      System.out.printf("Total Cost: $%.2f %n", totalSodaCost);
      System.out.println();
      System.out.println("Snack: " + water.getName());
      System.out.println("Vending Machine: " + drink.getName() );
      System.out.println("Quantity: " + water.getQuantity() );
      double totalWaterCost = water.getQuantity() * water.getCost();
      System.out.printf("Total Cost: $%.2f %n", totalWaterCost);

   }

   public static void main(String[] args)
   {
      workWithData();
   }
}