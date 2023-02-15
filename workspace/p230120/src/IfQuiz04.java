import java.util.Scanner;
public class IfQuiz04 {

	public static void main(String[] args) {

		// 점수를 입력 받은 후 학점을 출력하시오.
		// 학점 
			// 90 - 100 
			// 80 - 89
			// 70 - 79
			// 70미만
		//객체
		Scanner input = new Scanner(System.in);
		// 정수 값
		System.out.println("학점을 입력해주세요");
		int num = input.nextInt();
		char gD = ' ';
		if(num >= 90){
			System.out.println("A");
		} else if(num >= 80) {
			System.out.println("B");
		} else if(num >= 70) {
			System.out.println("C");
		} else { 
			System.out.println("D");
		}
		
		
		
			System.out.println("당신의 학점은 " + num + "입니다");
			
		
		
	}

}
