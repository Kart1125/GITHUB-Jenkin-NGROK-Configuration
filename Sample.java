import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = reader.nextInt();
        System.out.println("********************************");
        System.out.println("This is my first sample program");
        System.out.println("You entered: " + number);
        System.out.println("********************************");
    }
}
