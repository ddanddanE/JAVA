public class Test {
	public static void main(String[] args) {
		//for 조건식정리
		//1. int i = a;(i의 값은 a이다.)
		//2-1. i<b;(i가 b보다 같거나 커지면 for문 중지 b-1까지 출력)
		//2-2. i<=b;(i가 b보다 커지면 for문 중지 b까지 출력)
		//2-3. i>b;(i가 b보다 같거나 작아지면 for문 중지 b+1까지 출력)
		//2-3. i>=b;(i가 b보다 작아지면 for문 중지 b까지 출력)
		//3-1. i++,i--는 값이 넣어지고 증감된 수가 들어감
		//3-2. ++i,--i는 증감되고 값이 들어감
		
		//↓의 for문은 원하는 행의 갯수만큼 조건을주면된다
		for(int i=1; i<10; i++) {//1,2,3,4,5,6,7,8,9(밑에i를 이용하니 i는 0부터가 아니라 1부터 시작
			if(i<6) {//별 5개(5행)까지 출력하게 함.i=1,2,3,4,5 총 5회
				for(int bl=0; bl<5-i;bl++) {
					//a-1. 1행 for(int bl=0; bl<5-1; bl++) 0인 bl이 4미만이 될때까지 즉, 0,1,2,3 4번 반복하고 b-1로 넘어감
					//a-2. 2행 for(int bl=0; bl<5-2; bl++) 0인 bl이 3미만이 될때까지 즉, 0,1,2 3번 반복하고 b-2로 넘어감
					System.out.print(" ");
				}
				for(int st=0; st<i; st++) {
					//b-1. 1행 for(int st=0; st<1; st++) 0인 st가 1미만이 될때까지 즉, 0 1번 반복하고 c로 넘어감
					//b-2. 2행 for(int st=0; st<2; st++) 0인 st가 2미만이 될때까지 즉, 0,1 2번 반복하고 c로 넘어감
					System.out.print("*");
				}
				System.out.println();
					//c. a-1과 b-1입력 후 다음 줄에 a-2와 b-2를 입력하게함.
			}
			else {//i=6,7,8,9일때 이리로 넘어옴
				for(int bl=0; bl<i-5; bl++) {
					//d-1. 6행 for(int bl=0; bl<6-5; bl++) 0인 bl이 1미만이 될때까지 즉, 0 1번 반복하고 e-1로 넘어감
					//d-2. 7행 for(int bl=0; bl<7-5; bl++) 0인 bl이 2미만이 될때까지 즉, 0,1 2번 반복하고 e-2로 넘어감
					System.out.print(" ");
				}
				for(int st=10; st>i; st--) {
					//e-1. 6행 for(int st=10; st>6; st--) 10인 st가 6 초과 될때까지 즉, 10,9,8,7 4번 반복하고 f로 넘어감
					//e-2. 7행 for(int st=10; st>7; st--) 10인 st가 7 초과 될때까지 즉, 10,9,8 3번 반복하고 f로 넘어감
					System.out.print("*");
				}
				System.out.println();
					//e.d-1과 e-1입력 후 다음줄에 d-2와 e-2입력하게함
			}
		}
		//i = 10이라 반복문 종료
	}
}