import java.util.Scanner;
public class ScannerSul02_1 {

	public static void main(String[] args) {

		// 객체
		Scanner input = new Scanner(System.in);
		
		//정수 1개 입력
		System.out.println("정수 1개 입력 해주세용 ");
		int user_num = input.nextInt();
		
		//입력 받은 정수 출력
		System.out.println("입력 받을 정수 >> " + user_num);
		
		
		// 버퍼 비우기
		input.nextLine(); //아래 내용이 실행이 되기 전에 버퍼를 초기화 하기
		
		//문자열 1개 입력
		System.out.println("문자열 1개 입력해주세용 ");
		String user_str = input.nextLine();
		
		//입력 받은 문자열 출력
		System.out.print("입력 받은 문자열 >>" + user_str);
		
		//버퍼 비우기
		input.nextLine();
		
		
		
		
	}

}
