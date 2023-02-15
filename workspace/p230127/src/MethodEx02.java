	
public class MethodEx02 {
	
/*
 * 메소드 정의
 * 형태 2 매개 변수 O , 리턴 값 O
 * 기능 : 인수 2개를 받아서 덧셈한 결과를 리턴
 * 
 * return 의미 
 * -- method의 실행 끝
 * -- return값을 호출한 쪽으로 넘겨줌 
 * 
 */
	
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
		return result;		
		// int 필수, result(변수 통일)
	}
	
	
	//
	public static void main(String[] args) {

		System.out.println("main 시작");
		int sumresult = sum(2, 6);
		System.out.println("결과" + sumresult);
		System.out.println("main 종료");
		
	}

}
