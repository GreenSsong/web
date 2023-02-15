import java.util.Scanner; //자바라는 폴더 아래 유틸 아래 스캐너라는 파일을 설명.
public class ScannerExo1 {

	public static void main(String[] args) {

		//파일이 실행중에 값을 넣어 주기 위해 아래 콘솔창을 사용
		System.out.println("num에 저장된 값 >> " + num);
		
		
		//클래스는 파일 위치가 있는데 기본적으로 인식이 안되서 오류가 나타남.
		//Scanner 객체 생성
		Scanner input = new Scanner(System.in); 
		//Scanner input(변수) = new Scanner(System.in) [객체]; 변수만 변경 가능 
		
		
		System.out.print("정수 1개 입력하세요@@ ");
		
		
		//정수 입력
		//num에 받아진 input를 받아 질때 . 를 누르면 지문창 나옴.
		num = input.nextInt(); //현재 정수가 입력되지 않아서 그렇다 
		System.out.println("입력 받은 값 >> " + num);
		
		//num = input.nextInt(); //현재 정수가 입력되지 않아서 그렇다 
		//콘솔창 아래 회색에서 빨강으로 변경되면 아직도 실행중이라고 된다. 
		//"enter"의 의미 입력이 끝났다 작업의 끝
		
		// * 무슨 작업하기 전에 출력부터 하라
		
		
		
		
	}

}
