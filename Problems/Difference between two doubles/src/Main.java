import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double firstNumber = scanner.nextInt();
        String operator = scanner.next();
        double secondNumber = scanner.nextInt();
        double result = 0;
        if (operator == "-")
            result = firstNumber - secondNumber;

        System.out.println(result);
    }
}