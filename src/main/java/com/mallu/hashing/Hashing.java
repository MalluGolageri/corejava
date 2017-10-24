package com.mallu.hashing;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.*;

/**
 * Created by golagem on 10/13/17.
 */
public class Hashing {

    public static void main(String[] args) {

        User user1=new User("abc","abc@gmail.com");//1
        User user2=new User("abc1","abc1@gmail.com");//2

        User user3=new User("abc6","abc34@gmail.com");//not inserted

        User user5=new User("abc4","abc34@gmail.com");//

        User user4=new User("abc2","abc2@gmail.com");

        Map<User,Map<String,User>[]> users=new HashMap<>();

        String s1="abc";
        String s2=new String("abc").intern();
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode() + " "+s2.hashCode());
    }
}

class User {

    private String name;
    private String email;

    public User(String name,String email){
        this.name=name;
        this.email=email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        HashCodeBuilder codeBuilder=new HashCodeBuilder();
        return codeBuilder.append(getName()).toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        EqualsBuilder equalsBuilder=new EqualsBuilder();
        User user=(User)obj;
        if (getName().equals(user.getName())){
            return equalsBuilder.append(getName(), user.getName()).isEquals();
        }
        return equalsBuilder.append(getEmail(), user.getEmail()).isEquals();
    }

    @Override
    public String toString() {
        return "Name:"+getName()+ " Email:"+getEmail();
    }

}


