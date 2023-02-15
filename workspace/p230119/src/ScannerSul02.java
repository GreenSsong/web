import java.util.Scanner;
public class ScannerSul02 {

	public static void main(String[] args) {

		//해답편
		
		
				// 1.Scanner 객체 생성
				Scanner input = new Scanner(System.in);
				
				// 2. 정수 1개 입력
				System.out.println("정수 1개 입력하세요... ");
				int user_num = input.nextInt(); 
				
				// 3. 입력 받은 정수 출력
				System.out.println("입력 받은 정수 >> " + user_num);
				
				// 4. 문자열 1개 입력
				System.out.print("문자열 1개 입력하세요... ");
				String uesr_str = input.nextLine();
						
				// 5. 입력 반은 문자열 출력
				System.out.println("입력 받은 문자열 >> " + user_str);
				
	}

}
