import java.util.Scanner;

public class Greeting {

    public static void main(String [] args){
        //throws NegativeNumberException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

    }

}
