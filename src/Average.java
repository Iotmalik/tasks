import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int average = 0;
        int count = 0;
        int sum = 0;
        while (true) {
            int a = scanner.nextInt();
            if (a == 0) {
                break;
            }
            sum += a;
            count++;
        }
        average = sum / count;
        System.out.println(average);
    }
}

