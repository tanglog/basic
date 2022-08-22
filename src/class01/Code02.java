package class01;

import java.sql.SQLOutput;

/**
 * 数据结构
 * */
public class Code02 {
    public static void main(String[] args) {
//        double ans = Math.random();
        int testTimes = 1000000;
        int count = 0;
        for (int i = 0; i <testTimes; i++){
            if (Math.random() < 0.75){
                count++;
            }
        }
        System.out.println((double) count/(double) testTimes);
        System.out.println("=======");

        int K = 9;
        //[0,K)
        int[] counts = new int[9];
        for (int i = 0; i < testTimes; i++){
            int ans = (int) (Math.random() * K);
            counts[ans]++;
        }
        for (int i = 0; i < K;i++){
            System.out.println(i + "这个数出现的次数" + counts[i]);
        }
        System.out.println("======");

        int count1 = 0;
        double x = 0.15;
        for (int i = 0; i < testTimes; i++){
            if (xToPower2() < x){
                count++;
            }
        }
        System.out.println((double) count1/(double)testTimes);
        System.out.println((double) Math.pow(x,2));


        count1 = 0;
        for (int i = 0; i <testTimes; i++){
            if (f2() == 1){
                count1++;
            }
        }
        System.out.println((double) count1/(double)testTimes);
        System.out.println("=====");

        counts = new int[8];
        for (int i = 0;i<testTimes;i++){
            int num = f4();
            counts[num]++;
        }
        for (int i = 0; i < 8;i++){
            System.out.println(i + "这个数出现的次数" + counts[i]);
        }

    }

    //返回一个[0,1)的小鼠
    //任意x,x属于[0,1)或[0,x)的概率为x的平方
    public static double xToPower2(){
        return Math.max(Math.random(), Math.random());
    }

    //lib里的,不可以改
    public static  int f1(){
        return (int) (Math.random() * 5) + 1;
    }


    //随机机制,只能用f1()
    //等概率返回0和1
    public static int f2(){
        int ans = 0;
        do {
            ans = f1();
        }while (ans == 3);
        return ans < 3 ? 0 : 1;

    }

    //得到000 ~ 111做到等概率 0~7等概率返回一个 02917
    public static int f3(){
        return  ((f2() << 2) + (f2() << 1) + (f2() << 0));
    }

    public static int f4(){
        int ans = 0;
        do {
            ans = f3();
        } while (ans == 0);
        return ans;
    }
}
