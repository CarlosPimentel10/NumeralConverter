import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        float cityDistance = scanner.nextFloat();
        float travelTime = scanner.nextFloat();
        float result = cityDistance / travelTime;
        System.out.println(result);
    }
}