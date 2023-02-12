import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your maximum amount of credit? ");
        int credit = scan.nextInt();


        System.out.println("How much credit have you used to date? ");
        int creditUsed = scan.nextInt();

        int remainingCredit = credit-creditUsed;
        System.out.println("Your remaining credit is: "+remainingCredit);
    }
}
