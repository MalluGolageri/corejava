package core;

/**
 * Created by golagem on 11/22/17.
 */
public class ObjectHashCode {

    public static void main(String[] args) {

        ObjectHashCode code1=new ObjectHashCode();
         code1=new ObjectHashCode();
        code1=new ObjectHashCode();
        ObjectHashCode code2=new ObjectHashCode();

        System.out.println(code1.hashCode());
        System.out.println(code2.hashCode());

        //1414644648
        //1414644648
    }
}
