import java.util.Scanner;

public class SwitchQuiz03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int user = 1;
		int computer=((int)(Math.random()*3)+1);
		//1. 정수 입력
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력해 주세요");
		user = input.nextInt();
		//컴퓨터 스위치
		switch (computer) {
		case 1 :
			 switch(user) {
			 case 1:
				 System.out.println("컴퓨터 : 가위 (1), 당신 : 가위 (1)");
				 System.out.println("비겼습니다");
				 break;
			 case 2:
				 System.out.println("컴퓨터 : 가위 (1), 당신 : 바위 (2)");
				 System.out.println("당신 승리");
				 break;
			 case 3:
				 System.out.println("컴퓨터 : 가위 (1), 당신 : 보 (3)" );
				 System.out.println("컴퓨터 승리");
				 break;
			 }
			 break;
			 
		 case 2 :
			 switch(user) {
			 case 1:
				 System.out.println("컴퓨터 : 바위 (2), 당신 : 가위 (1)");
				 System.out.println("컴퓨터 승리");
				 break;
			 case 2:
				 System.out.println("컴퓨터 : 바위 (2), 당신 : 바위 (2)");
				 System.out.println("비겼습니다");
				 break;
			 case 3:
				 System.out.println("컴퓨터 : 바위 (2), 당신 : 보 (3)" );
				 System.out.println("당신 승리");
				 break;
			 }
			 break;				 
		 case 3 :
			 switch(user){
			 case 1:
				 System.out.println("컴퓨터 : 보 (3), 당신 : 가위(1)");
				 System.out.println("당신 승리");
				 break;
			 case 2:
				 System.out.println("컴퓨터 : 보 (3), 당신 : 바위 (2)");
				 System.out.println("컴퓨터 승리");
				 break;
			 case 3:
				 System.out.println("컴퓨터 : 보 (3), 당신 : 보 (3)" );
				 System.out.println("비겼습니다");
				 break;
			 
		default:
			System.out.println("잘못된 숫자를 입력하였습니다.");
		}		
		
	}
	}
}
