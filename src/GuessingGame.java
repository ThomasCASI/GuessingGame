import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100);
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
            if (a == randomNum) {
                System.out.println(messages.get(cnt <= 7 ? 0 : cnt <= 10 ? 1 : 2));
                break;
            }
            System.out.println(a < randomNum ? "Too low" : "Too High");
        }
    }
}
