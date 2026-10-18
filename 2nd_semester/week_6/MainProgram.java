import java.util.*;

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {

    public void methodA() {
        System.out.println("Method A is called");
    }

    public void methodB() {
        System.out.println("Method B is called");
    }

    public void methodC() {
        System.out.println("Class C should be able to call both methodA() and methodB().");
    }
}

public class MainProgram {
    public void multipleInheritance(Scanner sc) {
        C obj1 = new C();
        obj1.methodA();
        obj1.methodB();
        obj1.methodC();

        sc.nextLine();

    }
}
