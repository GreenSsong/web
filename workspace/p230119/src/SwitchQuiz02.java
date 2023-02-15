import java.util.Scanner;

public class SwitchQuiz02 {

	public static void main(String[] args) {
		//정수 객체
		Scanner input = new Scanner(System.in);
		System.out.println("정수 두개를 입력해주세용");
		int fN = input.nextInt();
		int sN = input.nextInt();
		
		input.nextLine();
				
		System.out.println("사칙연산(+, -, *, /) 중 하나를 입력해주세용");
		String s = input.nextLine();
		
		input.nextLine();
		
		int result = 0;
		
		switch(s) {
		case "+": 
			result = fN+sN;
			break;
		case "-": 
			result = fN-sN;
			break;
		case "*": 
			result = fN*sN;
			break;
		case "/":
			result = fN/sN;
			break;
		default:
			System.out.println("잘못된 연산자를 입력하셨군요!!");
			
		
		}	
		System.out.println("result");
	}

}
