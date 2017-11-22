package core;

import java.util.*;

/**
 * Created by golagem on 11/20/17.
 */
public class Comp {


    public static void main(String[] args) {
        Employee e1=new Employee("abc",26);
        Employee e2=new Employee("def",24);
        Employee e3=new Employee("bgc",23);

        List<Employee> employees=new ArrayList<>();
        employees.add(e1);employees.add(e2);employees.add(e3);

        Collections.sort(employees, new AgeComparator());
        employees.forEach(employee -> System.out.println(employee.getName() + " " + employee.getAge()));

    }
}

class AgeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}


class Employee implements Comparable<Employee>{

    Employee(String name, int age){
        this.name=name;
        this.age=age;
    }

    private String name;
    private double salary;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee e) {
        if(getAge()>e.getAge()) return 1;
        else if (getAge() < e.getAge()) return -1;
        else return 0;
        //return getName().compareTo(e.getName());
    }
}


//bgc 23
//def 24
//abc 26