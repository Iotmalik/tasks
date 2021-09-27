import java.util.Scanner;

public class Quadratic {
    //    ( ax 2 + bx + c = 0 )
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
//        D = b2 - 4ac
        double discriminant = (b * b) - (4 * a * c);
        if (discriminant < 0) {
            System.out.println("no roots");
        } else if (discriminant == 0) {
//            х = -b/2a;
            double x = -b / 2 * a;
            System.out.println(x);
        } else if (discriminant > 0) {
//            x1 = (-b - √discriminant)/2а
//            x2 = (-b + √discriminant)/2а
            double x1 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
            double x2 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
            System.out.println(x1 + " " + x2);
        }
    }
}
