package com.mallu.hashing;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by golagem on 10/13/17.
 */
public class Hashing {

    public static void main(String[] args) {

        User user1=new User("abc","abc@gmail.com");
        User user2=new User("abc1","abc1@gmail.com");
        User user3=new User("abc1","abc@gmail.com");
        User user4=new User("abc2","abc2@gmail.com");

        List<User> userList=new ArrayList<>();
        userList.add(user1);userList.add(user2);userList.add(user3);userList.add(user4);

        Set<User> users=new HashSet<>();
        users.add(user1);users.add(user2);users.add(user3);users.add(user4);
        users.forEach(System.out::println);
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


