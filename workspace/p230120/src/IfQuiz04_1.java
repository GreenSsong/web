import java.math.BigDecimal;
import java.util.Scanner;

public class IfQuiz04_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//1. 정수 입력
		System.out.print("점수를 입력하세용 >>");
		int sC = input.nextInt();
		//2. 학점 출력 
		// 첫번째
//		if(sC >= 90 && sC <= 100) {
//			System.out.println("학점은 A입니다.");
//		}else if(sC >= 80) {
//			System.out.println("학점은 B입니다.");
//		}else if(sC >= 70) {
//			System.out.println("학점은 C입니다.");
//		}else if(sC >= 0 && sC <= 69) {
//			System.out.println("학점은 D입니다.");
//		}else {
//			System.out.println("잘못 입력하셨어요.");
		
		// 두번째
		char gD = ' ';
		
		if (sC >= 90 ) {	
			gD = 'A';
		} else if (sC<= 80) {	
			gD = 'B';
		}else if (sC >= 70) {	
			gD = 'C';
		}else {	
			gD = 'D';
		}
		System.out.println("학점은 " + gD +"입니다. ");
		
	}

}
