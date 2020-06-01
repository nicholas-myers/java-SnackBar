package snackbarApp;

public class Main {
   private static void workWithData() {
      VendingMachine food = new VendingMachine("Food");
      VendingMachine drink = new VendingMachine("Drink");
      VendingMachine office = new VendingMachine("Office");
      Snack chips = new Snack("Chips", 36, 1.75, food.getId());
      Snack chocolateBar = new Snack("Chocolate Bar", 35, 1.00, food.getId());
      Snack pretzel = new Snack("Pretzel", 38, 2.00, food.getId());
      Snack soda = new Snack("Soda", 19, 2.50, drink.getId());
      Snack water = new Snack("Water", 20, 2.75, drink.getId());
      Customer jane = new Customer("Jane", 45.25);
      Customer jane = new Customer("Bob", 33.14);
      
   }
}