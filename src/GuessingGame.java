import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int cnt = 0;
        List<String> message = new LinkedList<>();
        message.add("You got an impossibly good score!");
        message.add("You did a good job!");
        message.add("Try the divide and conquer strategy next time!");

        while (a != randomNum) {
            cnt++;
            a = sc.nextInt();
            if (a == randomNum) {
                System.out.println(cnt <= 7 ? message.get(0) : cnt <= 10 ? message.get(1) : message.get(2));
                break;
            }
            System.out.println(a < randomNum ? "Too low" : "Too High");
        }
    }
}
