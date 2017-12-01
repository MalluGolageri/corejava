package core;

import java.io.*;
import java.util.Scanner;

/**
 * Created by golagem on 10/3/17.
 */
public class Serialization {
int i=0;

    public static void main(String... args) throws IOException, ClassNotFoundException {

        Student s1 = new Student(12, "raju");
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/golagem/github/html-parsing/src/main/resources/ser.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(s1);
        outputStream.flush();
        outputStream.close();


        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/Users/golagem/github/html-parsing/src/main/resources/ser.txt"));
        Student student = (Student) inputStream.readObject();
        System.out.println(student.id + " " + student.name + " " + student.city);
    }

}

class Student implements Serializable {

    private static final long serialVersionUID=123L;

    int id;
    String name;
    String city = "Pune";

    public Student(){
        this.id=0;
        this.name=null;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


//    public void writeExternal(ObjectOutput out) throws IOException {
//        out.writeObject(id);
//        out.writeObject(name);
//        out.writeObject(city);
//    }
//
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//        this.id=(int)in.readObject();
//        this.name=(String)in.readObject();
//        this.city=(String)in.readObject();
//    }

    public static void main(String... args) throws IOException, ClassNotFoundException {

        Student s1=new Student(13,"raju");
        System.out.println("Initially: " + s1.toString());


        FileOutputStream fileOutputStream=new FileOutputStream("/Users/golagem/github/html-parsing/src/main/resources/ser.txt");
        ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(s1);

        outputStream.flush();
        outputStream.close();

//
//        Student s2=new Student();
//        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("/Users/golagem/github/html-parsing/src/main/resources/ser.txt"));
//        s2.readExternal(inputStream);
//
//        inputStream.close();
//        System.out.println(s2.toString());

    }

    @Override
    public String toString() {
        return this.name +"'s id is:"+this.id;
    }


}

