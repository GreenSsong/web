import java.util.Scanner;
public class IfQuiz02 {

	public static void main(String[] args) {

	//성별 : 남 -1, 여 -2
	//입력 값 " 성별 1또는 2를 입력 "문자열 먼저 출력
	//성별을 정수 1 또는 2로 입력
	//1이 되면 남자입니다. 
	//2가 입력 여자입니다.
	//1,2 이외의 정수가 입력되면 잘못된 값입니다.를 출력
	
	//정수 객체	
	Scanner input = new Scanner(System.in);
	
	System.out.print("성별 1 또는 2를 입력하세요!");
	int user_value = input.nextInt();
	//String result == (uesr_value);
	 if(user_value == 1) {
		System.out.println("남자");
	} else if (user_value == 2) {
		System.out.println("여자");
	} else { 
		System.out.println("잘못");
	}
	 
	System.out.println("당신은" + user_value + "입니다.");
	
 
	}
	
}
