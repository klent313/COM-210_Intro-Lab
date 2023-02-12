import java.util.Scanner;
import java.util.ArrayList;

public class Lab1q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfItems;
        String itemName;
        double itemPrice, totalPrice = 0, average;
        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> itemPrices = new ArrayList<>();
        
        System.out.print("Enter the number of items: ");
        numberOfItems = scanner.nextInt();

        for (int i = 1; i <= numberOfItems; i++) {
            scanner.nextLine();
            System.out.print("Enter the name of item " + i + ": ");
             itemName = scanner.nextLine();
            itemNames.add(itemName);
            System.out.print("Enter the price of item " + i + ": ");
            itemPrice = scanner.nextDouble();
            itemPrices.add(itemPrice);
            totalPrice += itemPrice;
        }

        average = totalPrice / numberOfItems;
        double roundedAverage = Math.round(average * 100.0) / 100.0;

        System.out.println("\nItems in reverse order: ");
        for (int i = numberOfItems - 1; i >= 0; i--) {
            System.out.println("Item: " + itemNames.get(i) + ", Price: $" + itemPrices.get(i));
        }

        System.out.println("\nAverage Price: $" + roundedAverage);

    }
}