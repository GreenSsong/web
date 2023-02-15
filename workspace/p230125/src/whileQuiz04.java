import java.util.Scanner;

public class whileQuiz04 {

	public static void main(String[] args) {

		
		// 1-10까지 사이의 정수 1개 입력 랜덤으로 맞추는 것 
		// 출력값은 옆으로
		// 몇번 수에서 실행하여 값을 찾는 것
		
		//정수 입력 
		Scanner input = new Scanner(System.in);
			System.out.println("1-10까지 사이의 정수 1개를 입력해주세요");

		int userN = input.nextInt();
		int random =((int)(Math.random()*10+1));
		
		while(true) {
			System.out.print(random);
			System.out.println(random = userN);
			break;
		}
		System.out.println(random);
		}
	}


