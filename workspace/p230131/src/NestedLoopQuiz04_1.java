import java.util.Scanner;

public class NestedLoopQuiz04_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		System.out.print("짝수 단은 0, 홀수 단은 1 입력 :");
		int user = input.nextInt();
//		int dan;
//			if(userValue == 0)
//				dan =2;
//			else
//				dan =3;
		int dan = (user==0) ? 2:3; //"삼항 연산자"
				for(int i=dan; i<10; i+=2) {
					for(int j=1; j<10; j++)
						System.out.printf("%d*%d = %d\n", i, j, i*j);
		}
				input.close();
	}
}
