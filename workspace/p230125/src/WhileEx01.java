/*
 *  반복문 while문
 *  
 *  초기값 설정 ;
 *  
 *  while(조건식) { //조건이 true일 동안 반복 -> 처음으로 false가 되는 순간 탈출
 *  명령문;
 *  증감식;
 *  }
 */
public class WhileEx01 {
	public static void main(String[] args) {
	//변수
		int num = 1; 
	//반복문 while(조건검사) 영역 실행
		while(num < 100) {
			System.out.println("num >>" + num);
			num*=2;
		}
		
	//실행
		System.out.println("실행 종료");
		
		
	}
}
