import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the cost of the item being purchased? ");
        int cost = scan.nextInt();

        System.out.println("What is the current Sales Tax? ");
        double salesTax = scan.nextDouble();

        double taxAmount=cost*salesTax;
        System.out.println("The total amount of tax being paid is: "+taxAmount);

        double totalPrice=cost+taxAmount;
        System.out.println("\nThe total price for this item will be: "+totalPrice);
    }
}
