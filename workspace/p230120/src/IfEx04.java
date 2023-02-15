import java.util.Scanner;

public class IfEx04 {

	public static void main(String[] args) {

		//사용자가 입력한 정수를 짝수/홀수 구분하여 출력
		
		//스캐너 객체
		Scanner input = new Scanner(System.in);
		
		//정수 1개 입력
		System.out.print("숫자 입력해주세용~");
		int user_value = input.nextInt();
		
		//짝/홀 구분 출력(조건문 2개인 if)
		
		// 입력한 값이 짝수 입니다.
		// 입력한 값이 홀수 입니다.
		if(user_value % 2 == 0) {
			System.out.println("입력한 값은 짝수입니다.");
		} else {
			System.out.println("입력한 값은 홀수입니다.");
		}
		
		System.out.println(user_value);
		
		input.nextLine();
	
		
	}

}
