package core;

import java.io.IOException;
import java.io.Serializable;

public class Test {
    public static void main(String[] args) {
        String s1 = "abc";

        for (int i=0;i<s1.length();i++){
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(i)!=s1.charAt(j)){
                    System.out.println(s1.charAt(i)+s1.charAt(j));
                }
            }
        }
    }

}

class Super {
    void foo() {
        System.out.println("Super");
    }
}

class Subclass extends Super {

     void foo() {


        System.out.println("Subclass");
    }

}




