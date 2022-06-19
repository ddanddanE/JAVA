package Day0601;
class Gen<T>{
	
	T t,t1;
	Object[] st;
	
	Gen(T t,T t1) {
		this.t = t;
		this.t1=t1;
		}
	
	T one() {
		return t;
	}
	
	T two() {
		return t1;
	}
	boolean three() {
		if(t.equals(t1)) {
			return true;
		}
		return false;
	}


	
}
public class Day060103 {

	public static void main(String[] args) {
		Gen<String> g=new Gen<String>("seoul","busan");

		System.out.println(g.one());   //seoul 출력

		System.out.println(g.two());   //busan 출력

		System.out.println(g.three());  //false 출력 (두 문자열 비교)

	}

}
