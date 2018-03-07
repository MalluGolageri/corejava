package com.mallu.Strings;

/**
 * Created by golagem on 10/25/17.
 */
public class ToStringDemo {
    public static void main(String[] args) {
        String s = "hello";
      //s += null != s ? "Got It" : "Nope";
        User user = new User();
        System.out.println("user is " + user);
        //String s1="hel";
       //"str"+null;
       // s+=null!=s?"Dude":"Jine";
        
        
    }
}

class User {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Oye";
    }
}
