import java.util.Scanner;
public class ScannerQuiz01 {

	public static void main(String[] args) {

		
		
		/*
		 * 정수 2개를 입력 받은 후 , 덧셈 결과를 출력하시오 
		 * 
		 * 출력 문구 : 정수 2개를 입력하세요
		 * 
		 * 
		 */
		
		// ====================================================
		
		/*
		 * 코드를 작성
		 * -순서를 정리하여 차례로 하기 
		 * -뼈대 만들기 (목록표)
		 * -정수 2개 입력 객체 
		 * 
		 * 
		 */ 
		//1. Scanner 객체 생성
			Scanner input = new Scanner(System.in);
	
			
		//2. 정수 2개 입력
			System.out.print("정수 2개 입력하세요..");
			int ValueOne = input.nextInt();
			int ValueTwo = input.nextInt();
			//콘솔에서 숫자 입력 할 떄 숫자 대입을 엔터로도 가능하지만, 스페이스바로 가능
			
			//완성 하기 전에 실행을 하면서 확인하면서 다음 코드 진행하라.
			
			
		//3.덧셈 결과 출력
			System.out.println("덧셈 결과 >> " + (ValueOne + ValueTwo));
		 		
	}

}
