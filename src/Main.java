import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");

        int number = input.nextInt();
        if ((number % 5 == 0) && (number % 3 != 0) )
            System.out.print("Fizz");
        else if ((number % 3 == 0) && (number % 5 != 0))
            System.out.print("Buzz");
        else if ((number % 5 == 0) && (number % 3 == 0))
            System.out.print("FizzBuzz");
        else
            System.out.println(number);
    }
}