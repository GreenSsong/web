import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {   							//string으로 메인 정수 받
		Scanner input = new Scanner(System.in);							// scanner 를 임의 값을 input으로 받
		System.out.println("1~10 사이의 정수 입력");					// 출력 형태
		int userValue= input.nextInt();									// 받은 input을 userValue 로 치환 
		int fac =1;														// 펙토리 값 기본 설정
			if(userValue>11) {											// 10 사이의 값을 생각함
				System.out.println("1~10 사이의 정수 입력");
				userValue=input.nextInt();								// 무한 루프가 되지 못함
			}
			else {	
				for(int i =1; i<=userValue; i++) 						// 펙토리 값 설정
					fac =fac*i;
			}				
			System.out.println(userValue + "!  :" + fac );				//출력값
			}
}

/**
 * 답변: 
 * - 문제의 구조를 if형으로 생각 ture라고 생각 될시에 계산을 만들어 출력하려고 했음
 * 오류 
 * 	정수값 설정을 하지 않았음, do if문으로 먼저 실행되는 코드를 설정하는 것이 미흡함.
 * 결론 
 * 	코드 구조를 변경하여 만듬
 *  
