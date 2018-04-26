package core;

import java.util.LinkedHashMap;
import java.util.Map;

public class InterviewQues {
    public static int a1=10;
    private static int a2=10;
    public  int a3=10;
    private int a4=10;

    class Inner{
        public int getSum(){
            return a1+a2+a3+a4;
        }
    }

    public static void main(String[] args) {
        InterviewQues.Inner inner=new InterviewQues().new Inner();
        new C();
    }

}

class A{
    public A(){
        System.out.print("a");
    }
}

class B extends A{
    public B(){
        System.out.print("b");
    }
}

class C extends B{
    public C(){
        System.out.print("c");
    }
}
