import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean fizz = num % 5 == 0;
        boolean buzz = num % 3 == 0;

        String result = (fizz ? "Fizz" : "") + (buzz ? "Buzz" : "");
        System.out.println(result.isEmpty() ? num : result);
    }
}