package core;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by golagem on 11/28/17.
 */
public class UniqueFriends {

    public static void main(String[] args) {
        Set<Friend> friends=new HashSet<>();

        Friend f1=new Friend("A","B");
        friends.add(f1);

        Friend f2=new Friend("B","A");;
        friends.add(f2);

        Friend f3=new Friend("B","C");;
        friends.add(f3);

        Friend f4=new Friend("C","B");;
        friends.add(f4);

        Friend f5=new Friend("A","C");;
        friends.add(f5);

        friends.forEach((f)->{System.out.println(f.f1 +","+f.f2);});
    }
}

class Friend {
    String f1,f2;

    Friend(String f1,String f2){
        this.f1=f1;
        this.f2=f2;
    }

    @Override
    public int hashCode() {
        return this.f1.hashCode() + this.f2.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        Friend f = (Friend) o;
//a,b ,b,a
        //return (this.f1.equals(f.f1) && this.f2.equals(f.f2)) || (this.f1.equals(f.f2) && this.f2.equals(f.f2));

        return true;
    }
}


class overload {
    int x;
    int y;
    void add(int a){
        x = a + 1;
    }
    void add(int a , int b){
        x = a + 2;
    }
}
class Overload_methods {
    public static void main(String args[])
    {
        overload obj = new overload();
        int a = 0;
        obj.add(6, 7);
        System.out.println(obj.x);
    }
}