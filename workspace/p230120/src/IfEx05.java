import java.util.Scanner;

public class IfEx05 {

	public static void main(String[] args) {

		//사용자가 입력한 정수를 짝수/홀수 구분하여 출력
		
		//스캐너 객체
		Scanner input = new Scanner(System.in);
		
		//정수 1개 입력
		System.out.print("숫자 입력해주세용~");
		int user_value = input.nextInt();
		
		//짝/홀 구분 출력(조건문 2개인 if)
		String result = "도레미";
		
		// 입력한 값이 짝수 입니다.
		// 입력한 값이 홀수 입니다.
		// 3-1. if문 짝수 홀수 구분
		if(user_value % 2 == 0) 
			result = "짝수";
		else
			result = "홀수";
		//3-2.조건 연산자 짝수 홀수 구분
		
		// String result = (user_value % 2 == 0) ? "짝수" : "홀수";
		
			
		// 출력
		System.out.println("입력한 값은 " + result + "입니다");
		
		
		
	}

}
