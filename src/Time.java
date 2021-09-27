import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        Duration d = Duration.ofSeconds(seconds);
        LocalTime t = LocalTime.of(0, 0, 0).plus(d);
        System.out.println(t.format(DateTimeFormatter.ofPattern("H:mm:ss")));
        scanner.close();


//        String sec = String.format("%02d", seconds % 60);
//        String min = String.format("%02d", ((seconds % 60) % 60));
//        int hours = (seconds / 60) / 60;
//        if (hours >= 24){
//            hours = hours % 24;
//        }
//        System.out.println(hours + ":" + min + ":" + sec);
    }
}
