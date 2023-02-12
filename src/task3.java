import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scan.nextLine();

        System.out.println("Enter your middle name:");
        String middleName = scan.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        System.out.println(firstName +" "+ middleName +" "+ lastName +" age: " +age);


    }
}
