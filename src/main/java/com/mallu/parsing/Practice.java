package com.mallu.parsing;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.*;

/**
 * Created by golagem on 7/12/17.
 */
public class Practice extends Parent {
    public static void main(String... args) {
        List<Employee> list=new ArrayList<>();

        Employee e1=new Employee("mallu","bolageri");
        Employee e2=new Employee("hem", "chandra");
        Employee e3=new Employee("hem", "chandra");
        list.add(e1);
        list.add(e2);
        list.add(e3);

        Collections.sort(list, new LastNameComparator());

        list.forEach(o -> {
            Employee e = (Employee) o;
          //  System.out.println(e.getName() + " " + e.getLastName());
        });


        HashSet hashSet=new HashSet();
        hashSet.add(e1);hashSet.add(e2);hashSet.add(e3);

        hashSet.forEach(o -> {
            Employee e=(Employee)o;
            System.out.println(e.getName() +" "+e.getLastName());
        });
    }
}

class Super {
    public int a = 20;
    public void print() {
        System.out.println("super");
    }
}

final class Child extends Super {
    @Override
    public void print() {
        System.out.println("child:" + a);
    }
}

class Department extends Super {
    Employee employee;
    public Department(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void print() {
        System.out.println(employee.getName());
        super.print();
    }
}

class Employee implements Comparable {
    private String firstName;
    private String lastName;

    Employee(String name) {
        this.firstName = name;
    }

    Employee(String name, String lastName) {
        this.firstName = name;
        this.setLastName(lastName);
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    @Override
    public int hashCode() {
//        int prime = 31;
//        int result = 1;
//        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
//        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
//        //return result;
//        System.out.println("Result:"+result);

        int result1=new HashCodeBuilder().append(firstName).append(lastName).toHashCode();
        System.out.println("Result1:"+result1);
        return result1;

    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee employee=(Employee)obj;
//        return this.getName().equals(((Employee) obj).getName());

        return new EqualsBuilder().append(getName(),employee.getName()).append(getLastName(),employee.getLastName()).isEquals();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Object o) {
        Employee e=(Employee)o;
        return this.getLastName().compareTo(e.getLastName());
    }
}

class FirstNameComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1= (Employee)o1;
        Employee e2= (Employee)o2;
        return e1.getName().compareTo(e2.getName());
    }
}
class LastNameComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1= (Employee)o1;
        Employee e2= (Employee)o2;
        return e1.getLastName().compareTo(e2.getLastName());
    }
}
/**
 * //        System.out.println("aB".hashCode());
 * //        System.out.println("`a".hashCode());
 * <p>
 * <p>
 * Set<Employee> hashSet = new HashSet();
 * hashSet.add(new Employee("mallu","golageri"));
 * hashSet.add(new Employee("mallu","golageri"));
 * hashSet.add(new Employee("mallu","golageri"));
 * <p>
 * //        hashSet.add(new Employee("mallu"));
 * //        hashSet.add(new Employee("mallu"));
 * <p>
 * <p>
 * <p>
 * hashSet.forEach(o -> {
 * System.out.println(((Employee) o).getName() +" "+((Employee) o).getLastName());
 * });
 * <p>
 * <p>
 * Map map=new HashMap<>();
 * map.put("1",new Employee("mallu","golageri"));
 * map.put("2",new Employee("mallu","golageri"));
 * map.put("3",new Employee("mallu","golageri"));
 * <p>
 * map.forEach((o, o2) -> {
 * System.out.print(o + " ");
 * System.out.println(((Employee)o2).getLastName());
 * });


Set<String> hashSet =  new HashSet<>();
Set<String> linkedHashSet=new LinkedHashSet<>();
Set<String> treeSet=new TreeSet<>();

for (String s:Arrays.asList("mango","banana","orange")){
        hashSet.add(s);
        linkedHashSet.add(s);
        treeSet.add(s);
        }

        System.out.println("HASH SET:"+hashSet);
        System.out.println("LInked HASH SET:"+linkedHashSet);
        System.out.println("TREE SET:"+treeSet);
 */