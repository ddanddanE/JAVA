package Day0526;
interface A{
	public void funcA();
}
interface B{
	public void funcB();
}
interface C extends A,B{
	public void funcC();
}
class D implements C{

	@Override
	public void funcA() {
		System.out.println("funcA");
	}

	@Override
	public void funcB() {
		System.out.println("funcB");		
	}

	@Override
	public void funcC() {
		System.out.println("funcC");		
	}
	
}

public class Day052602 {

	public static void main(String[] args) {
		D d1=new D();
		A a1= d1;
		a1.funcA();
		
		B b1= d1;
		b1.funcB();
		
		C c1=d1;
		c1.funcA();
		c1.funcB();
		c1.funcC();
	}

}
