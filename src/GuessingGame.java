import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
    public static void main(String[] args) {
        int random = ThreadLocalRandom.current().nextInt(100);
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        List<String> messages = Arrays.asList(
                "You got an impossibly good score!",
                "You did a good job!",
                "Try the divide and conquer strategy next time!"
        );

        while (true) {
            cnt++;
            int a = sc.nextInt();
            if (a == random) {
                System.out.println(messages.get(cnt <= 7 ? 0 : cnt <= 10 ? 1 : 2));
                break;
            }
            System.out.println(a < random ? "Too low" : "Too High");
        }
    }
}