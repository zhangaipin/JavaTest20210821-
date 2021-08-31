package dailyfunction.randomnumber;

import java.util.Random;

/**
 * @description:    随机数获取
 * @time: 2021/8/21 23:06
 */
public class GetRandomNumber {
    public static void main(String[] args) {
        GetRandomNumber getRandomNumber = new GetRandomNumber();
        getRandomNumber.getRandomNum1();
        getRandomNumber.getRandomNum2();
        getRandomNumber.getRandomNum3();
    }

    /**
     * @Description:    使用随机算法
     * @param:	null
     * @Return:
     * @Date: 2021/8/31 22:10
     **/
    void getRandomNum1(){
        Random random = new Random();
        int num1 = random.nextInt(10);
        System.out.println(num1);
    }

    /**
     * @Description: 使用时间戳的方法生成随机数
     * @param:	null
     * @Return:
     * @Date: 2021/8/31 22:11
     **/
    void getRandomNum2(){
        //获取时间戳
        long time = System.currentTimeMillis();
        String str1 = Long.toString(time);
        System.out.println(str1);

    }

    /**
     * @Description: 使用时间戳的方法生成随机数--优化
     * @param:	null
     * @Return:
     * @Date: 2021/8/31 22:11
     **/
    void getRandomNum3(){
        long time = System.currentTimeMillis();
        String str2 = Long.toString(time).substring(2); //从第二个之后开始取数字
        System.out.println(str2);
    }
}
