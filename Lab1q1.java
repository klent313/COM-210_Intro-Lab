import java.util.Scanner;

public class Lab1q1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String item1, item2, item3;
    double price1, price2, price3, average;
    
    System.out.print("Enter the name of item 1: ");
    item1 = scanner.nextLine();
    System.out.print("Enter the price of item 1: ");
    price1 = scanner.nextDouble();
    
    scanner.nextLine();
    
    System.out.print("Enter the name of item 2: ");
    item2 = scanner.nextLine();
    System.out.print("Enter the price of item 2: ");
    price2 = scanner.nextDouble();
    
    scanner.nextLine();
    
    System.out.print("Enter the name of item 3: ");
    item3 = scanner.nextLine();
    System.out.print("Enter the price of item 3: ");
    price3 = scanner.nextDouble();
    
    scanner.nextLine();
    
    average = (price1 + price2 + price3) / 3;
    double roundedAverage = Math.round(average * 100.0) / 100.0;

    System.out.println("Item 1: " + item1 + ", Price: $" + price1);
    System.out.println("Item 2: " + item2 + ", Price: $" + price2);
    System.out.println("Item 3: " + item3 + ", Price: $" + price3);
    System.out.println("Average Price: $" + roundedAverage);
  }
}
