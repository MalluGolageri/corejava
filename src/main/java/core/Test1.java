package core;

import java.util.Calendar;

/**
 * Created by golagem on 11/9/17.
 */
public class Test1  {

    public static String variable = "ONE";

    public static void main(String[] args) throws InterruptedException{



        Runnable t= ()->{System.out.println("thread");};
        t.run();



        int[][] m = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        String s="first";
        System.out.println(s.split(" ")[0]);

        int length = m.length;
//        for (int i=0,j=length-1;i<length;i++,j--){
//            System.out.println(m[i][j]);
//        }

        for (int i = 0; i < length; i++) {

            for (int j = 2, k=i; j >=0 ; j--) {




                //i=0,j=2, i=1,j=1, i=2,j=0



//                if(i==j)
//                    System.out.print(m[i][j] + " ");
//                else
//                    System.out.print(" ");

            }
            System.out.println();
        }
    }

}

class X {

    static void test() {

        System.out.println(Test1.variable);
    }
}

class Y extends X {

    static void test() {
        System.out.println("Y");
    }
}

enum WEEK {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum MySingleton {
    INSTANCE;

    private MySingleton() {
        System.out.println("Here");
    }
}