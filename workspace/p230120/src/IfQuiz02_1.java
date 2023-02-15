import java.util.Scanner;

public class IfQuiz02_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//출력 
		System.out.print("성별 1 또는 2를 입력하세요.");
		
		// 입력 : 성별 -1 또는 2
		int gender = input.nextInt();
		
		
		// 출력 성별 출력
		//if 조건 3가지
		
		if(gender == 1) {
			System.out.println("남자");
		}else if(gender == 2) {
			System.out.println("여자");
		}	else {
			System.out.println("잘못된 값을 입력하셨어요");
			
		}
		
		System.out.println("당신은 " + gender + "입니다");
	}

}
