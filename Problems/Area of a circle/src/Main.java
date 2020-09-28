import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final double pi = Math.PI;
        double radius = scanner.nextFloat();

        double result = Math.pow(radius,2) * pi;

        System.out.println(result);
    }
}