package core;
class TestMemberOuter1 {

    interface MyInterface{
        void hello();
    }

    private int data = 30;

    class Inner implements MyInterface{
        void msg() {
            System.out.println("data is " + data);
        }
        @Override
        public void hello() {
            System.out.println("hello");
        }
    }

    public static void main(String args[]) {
        TestMemberOuter1 outer1=new TestMemberOuter1();
        TestMemberOuter1.Inner inner=outer1.new Inner();
        inner.msg();
        inner.hello();
    }
}