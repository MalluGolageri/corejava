package core;

import java.util.LinkedList;

/**
 * Created by golagem on 11/9/17.
 */
public class JavaReference {

}


class User{
    int id;

    User(int id){
        this.id=id;
    }

    public void test(){
        try{
            int a=3/0;
            System.out.println("inside");
        }catch (Exception ie){
            System.out.println("hell");
        }finally {
            System.out.println("finally");
            return;
        }
    }

    public static void main(String[] args) {
        System.out.println("user");

        User a=new User(1);
        User b=new User(2);
        b.test();
        merge(a, b);
        System.out.println(a.id +","+ b.id);


        Point pnt1 = new Point(0,0);
        Point pnt2 = new Point(0,0);
        System.out.println("X: " + pnt1.x + " Y: " +pnt1.y);
        System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
        System.out.println(" before tricky");


        tricky(pnt1,pnt2);
        System.out.println("X: " + pnt1.x + " Y:" + pnt1.y);
        System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
    }

    public static void tricky(Point arg1, Point arg2)
    {
        arg1.x = 100;
        arg1.y = 100;
        arg2.x=200;
        arg2.y=200;
        arg2=arg1;
        Point temp = arg1;
        arg1 = arg2;
        arg2 = temp;
    }

    private static void merge(User a, User b) {
        a.id=10;
        b.id=a.id;

    }
}
