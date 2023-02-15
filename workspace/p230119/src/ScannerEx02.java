import java.util.Scanner; //ctrl shift O
public class ScannerEx02 {

	public static void main(String[] args) {
		
		//1.scanner 객체 생성
		 Scanner input = new Scanner(System.in);
		
		 //2-1. 문자열 입력 :
		 //메서드는 문자를 받아 동작하는 기능 
		 //next는 공백 전까지 스페이스바
		 System.out.println("문자 입력하세요~ ");
		 String strOne = input.next();
		 
		 //버퍼 비우기 
		 input.nextLine();
		
		 
		 //2-2. 문자열 입력 : "엔터까지 문자열까지 들어 온다"
		 //nextline은 엔터줄 첫줄까지 출력함 
		 // Enter : CRLF - \r\n (케이지 리턴, 줄바꿈)
		 System.out.print("문자열 입력하세요~ ");
		 String strTwo = input.nextLine();
		 
		 //2-3.
		 
		 //3-1. 출력
		 
		 System.out.println("입력 받은 문자열 >> " +strOne);
		 
		 //3-2. 출력
		
		 System.out.println("입력 받은 문자열 >> " +strTwo);
	}

}
