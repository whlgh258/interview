import java.util.Random;

/**
 * Created by wanghl on 17-4-2.
 */
public class GiftDispatch {

    public static void main(String[] args) {
        double amount = 100;
        double count = 10;
        Random random = new Random();

        while(count > 1){
            double avg = amount / count;
            double money = random.nextDouble() * avg * 2;
            money = money <= avg / 2 ? avg / 2 : money;
            money = money >= avg * 1.5 ? avg * 1.5 : money;
            System.out.println(money);

            amount -= money;
            count--;
        }

        System.out.println(amount);
    }
}
