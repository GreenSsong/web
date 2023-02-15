/*
 * 메서드 오버로딩 method Over loading
 * 같은 이름의 메서드를 여러 개 정의
 * 단, 매개변수의 정보가 달라야 함.
 * 	(개수, 자료형) 둘중에 하나만 다르면 된다.
 * 반환형(리턴형과는 관련없음)
 */

public class MethodOverLoading {
	
//메서드 정의
//  기능 : 정수 두개를 받아서, 덧셈 결과를 출력
	//매개변수는 타입을 생략이 불가 (다른 객체이기 때문에)
	
	public static void showString() {
		System.out.println("=======");
		System.out.println( "보여줘" );
		System.out.println("=======");

		
	}
	public static void sum(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("덧셈 해줘 :" + result);
	}
	public static void sum(double n1, double n2) {
		double result = n1 + n2;
		System.out.println("실수 덧셈 결과  : " + result);
	}
	public static void sum(int n1,double n2) {
		
	}
	public static void sum(int n1) {
		
	}
	
	public static void main(String[] args) {
		//메서드의 이름은 갖지만 타입만 변경 되도록
		sum(2, 7);
		sum(1.2, 3.5);
		showString();
	}

}
