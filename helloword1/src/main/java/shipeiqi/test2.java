package shipeiqi;

import java.util.Date;

public class test2 {
    public static void main(String[] args) {
        /*Long a = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("00");
        for (int i = 0; i < 10000000; i++) {
            sb.append(i);
        }
        *//*StringBuilder sd = new StringBuilder("00");
        for (int i = 0; i < 10000000; i++) {
            sd.append(i);
        }*//*
        long b = System.currentTimeMillis();

        System.out.println("他用了"+(b - a)+"毫秒");*/
        test1();


    }
    public static void test1(){
       /* int[] b = {1,8,8,2,6,4};
        for (int i : b) {
            System.out.print(" "+i);
        }*/
        String s = "法山豆根士大夫很特殊的";
        char[] chars = s.toCharArray();
        for (char c : chars) {
            System.out.println(c);
        }


    }
}
