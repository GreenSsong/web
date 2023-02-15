/*
 * 구구단 에서 짝수단은 0보이게 홀수단은 1로 만들기
 */
import java.util.Scanner;

public class nestedLoopQuiz04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("짝수단은 0, 홀수 단은 1을 입력 :");
		int userN = input.nextInt();
		
			switch(userN) {
				case 0 :
					for(int i=2; i<10; i+=2)
						for(int jo = 1; jo<10; jo++)
							System.out.println("짝수" + i +"*" + jo + "=" + (i*jo) );
					break;
				case 1 :
					for(int i=1; i<10; i+=2) 
						for(int jo = 1; jo <10; jo++)
							System.out.println("홀수" + i +"*" + jo + "=" + (i*jo) );
					break;
				default :
					System.out.println("잘못 입력했습니당");
					}
			
		input.close();
	}
}
