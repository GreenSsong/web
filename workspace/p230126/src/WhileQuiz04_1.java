/*
 * 이해
 * 순서
 * -입력 
 * 랜덤값
 * 실행 횟수 출력
 * 
 */
import java.util.Scanner;

public class WhileQuiz04_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//입력
		System.out.print("1~100 중 1개 정수 입력해주세용 ");
		int userValue = input.nextInt();
		int random = 0;
		int count = 0;
		//[반복] 랜덤
		
		while(true) {
			count++;
			
			random = (int)(Math.random()*100) +1; 
			
			System.out.print(random + " ");
			
			if(userValue == random)
				break;
			
		}
//		System.out.println();
		System.out.println("\n" + count + "회 실행해서 찾았어요");
			input.close();
	}

}
