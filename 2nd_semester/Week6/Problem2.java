//Multiple Inheritance with Interfaces 

interface A{
	void methodA();
}
interface B{
	void methodB();
}
class C implements A,B
{
	public void methodA(){
		System.out.println("method A is called");
	}
	public void methodB(){
		System.out.println("method B is called");
	}
}

interface X {
    void methodX();
}

interface Y {
    void methodY();
}

class Z implements X, Y 
{

    public void methodX() {
        System.out.println("Method X is executed.");
    }


    public void methodY() {
        System.out.println("Method Y is executed.");
    }
}
class Problem2 {
    public static void main(String[] args) {
	
	C obj = new C();
	obj.methodA();
	obj.methodB();
	Z z = new Z();
	z.methodX();
	z.methodY();

    }
}