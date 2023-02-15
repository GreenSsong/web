//입력을 받으면서 초기화 가능하다.
import java.util.Scanner;

public class IfQuiz03_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	
		System.out.println("정수 두가지를 입력해주세요");
		int uO = input.nextInt();
		int uT = input.nextInt();
//	
//	 if (uO > uT) {
//		System.out.println("큰값 :" + uO + ", 작은 값 : " + uT);
//	 } else if(uO < uT) {
//		System.out.println("큰값 :" + uT + ", 작은 값 : " + uO);
//	}	
		
	int max , min ;
		
	 if (uO > uT) {
		max = uO;
		min = uT;
	} else {
		max = uO;
		min = uT;
			}
		}
}

