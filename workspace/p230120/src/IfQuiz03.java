import java.util.Scanner;
public class IfQuiz03 {

	public static void main(String[] args) {

		
		
		//정수 2개 입력 한후 
		//큰 값 , 작은 값
		//1. 객체
		Scanner input = new Scanner(System.in);
		
		//2. 정수 값 입력 2가지
		System.out.println("정수를 2개 입력해주세요"); 
		int numOne = input.nextInt();
		int numTwo = input.nextInt();
		
		//3. 큰값, 작은 값
		String resultOne = (numOne >= 5) ? "큰 값" : "작은 값";
		String resultTwo = (numTwo >= 5) ? "큰 값" : "작은 값";
		
		System.out.println("입력한 값은 " + resultOne + "입니다");
		System.out.println("입력한 값은 " + resultTwo + "입니다");
	}

}
