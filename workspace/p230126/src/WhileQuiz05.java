/*
 * 프로그램 정수를 입력하세요 (종료-1) 계속 나옴
 * 정수 값의 총합
 */
import java.util.Scanner;

public class WhileQuiz05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//정수 입력
		int num =0;
		int total = 0;
		
		System.out.print("정수를 입력하시오(종료 -1)");
		
		while((num = input.nextInt()) != -1) {
			total += num;
			System.out.print("정수를 입력하시오(종료 -1)");
			
		}
			System.out.println("총합" + total);
	}
}
