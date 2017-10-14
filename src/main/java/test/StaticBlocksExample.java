package test;

/**
 * Created by golagem on 10/14/17.
 */
public class StaticBlocksExample {
    // block to be executed before any constructor.
    {
        System.out.println("init block");
    }

    // no-arg constructor
    StaticBlocksExample() {
        System.out.println("default");
    }

    // constructor with one arguemnt.
    StaticBlocksExample(int x) {
        System.out.println(x);
        System.out.println(new User().getName());
    }

    {
        System.out.println("second init block");
    }

    public static void main(String... ar) {
        // Object creation by calling no-argument
        // constructor.
        new StaticBlocksExample();

        // Object creation by calling parameterized
        // constructor with one parameter.
        new StaticBlocksExample(10);

    }

    class User{
        public String name;

        public String getName(){
            return this.name;
        }
    }
}
