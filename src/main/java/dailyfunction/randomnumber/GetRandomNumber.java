package dailyfunction.randomnumber;

import java.util.Random;

/**
 * @description:
 * @time: 2021/8/21 23:06
 */
public class GetRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(10);
        long time = System.currentTimeMillis();
        String str1 = Long.toString(time);
        String str2 = str1.substring(2);
        System.out.println(str1);
        System.out.println(str2);
    }
}
