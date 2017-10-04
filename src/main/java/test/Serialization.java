package test;

import java.io.*;

/**
 * Created by golagem on 10/3/17.
 */
public class Serialization {
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

    int id;
    String name;
    String city = "Pune";

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void writeExternal(ObjectOutput out) throws IOException {

    }


    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}

