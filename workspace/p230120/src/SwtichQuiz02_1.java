import java.util.Scanner;
public class SwtichQuiz02_1 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		//1. 입력 정수 두개
		System.out.println("정수 두개 입력해주세용 >>>");
		int valueOne = input.nextInt();
		int valueTwo = input.nextInt();
		
		//2. 입력 사칙연산 기호
		System.out.println("사칙연산 [+,-,*,/] 중 하나를 입력해주세요 >> ");
		String operator = input.next();
		
		String expression = valueOne + operator + valueOne + "=";
		
		//3. 식과 결과값 출력
		
		switch(operator) {
		case "+":
			System.out.println( + (nO + nT));
			break;
		case "-":
			System.out.println(+ (nO - nT));
			break;
		case "*":
			System.out.println(+ (nO * nT));
			break;
		case "/":
			System.out.println(+ (nO / nT));
			break;
		default:
			System.out.println("잘못된 연산자를 입력하셨습니다");
			
			
		}
	}

}
