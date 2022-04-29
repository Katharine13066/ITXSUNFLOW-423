import java.util.Scanner;

public class Greeting {

    public static void main(String [] args){
        //throws NegativeNumberException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        try {
            isNegativeNumner(num);
        } catch (NegativeNumberException e){
            System.out.println("Сaught exception " + e);
        }


    }

    public static void isNegativeNumner(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException(number, "Negative number");
        } else if (number == 0) {
            System.out.println("Zero number");
        }
        System.out.println("Success");
    }


}
