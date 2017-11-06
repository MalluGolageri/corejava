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
        System.out.println(inner.getSum());
        Map map=new LinkedHashMap<>();
        map.put(11 ,20);
        map.put(11,30);
        map.put(null,null);
        map.put(null,"ref");
        System.out.println(map);
    }

}
class A{
    public A(){
        System.out.println("a");
    }
}

class B extends A{
    public B(){
        System.out.println("b");
    }
}

class C extends B{
    public C(){
        System.out.println("c");
    }
}
