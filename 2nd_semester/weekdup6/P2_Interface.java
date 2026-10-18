// You need to develop a module for a software design tool that supports multiple inheritances 
// using interfaces. Implement a standalone Java program that demonstrates this concept.

interface A{
    default void methodA(){
        System.out.println("Method of Interface A");
    }
}
interface B{
    void methodB();
}
public class P2_Interface implements A,B {
    @Override
    public void methodB(){
        System.out.println("Method of interface B from class P2_Interface");
    }
    public static void main(String[] args) {
        P2_Interface obj = new P2_Interface();

        obj.methodA();
        obj.methodB();
    }
}
