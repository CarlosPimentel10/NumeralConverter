import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double liquidPressure = scanner.nextDouble();
        final double GRAVITY = 9.8;
        double density = scanner.nextDouble();

        double result = liquidPressure * GRAVITY * density;
        System.out.println(result);

    }
}