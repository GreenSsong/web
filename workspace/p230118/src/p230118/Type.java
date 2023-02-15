package p230118;

public class Type {

	
	public static void main(String[] args) {
		
		/*
		 * [자료형] 
		 * 
		 * 정수형 : 정수 자료형
		 * byte  - char  - short  - int  - long 
		 *  1		2		 2		 4 		 8
		 *  
		 * 실수형 : 실수 자료형 
		 * float - double 
		 *  4		8
		 * 논리형
		 * boolean : true/false
		 * 
		 * 
		 *  변수 : 메모리(*Ram 항상) 
		 *  공간에 부여한 이름, 
		 *  부여한 이름을 통해서 메모리 접근
		 *  변하는 값
		 * 
		 * 변수 선언
		 * 형태 : 자료형 변수명(제일 작은 단위);
		 * 
		 * byte num; (num에서 변수를 만듬)
		 *  크기  
		 * 메모리에 남은 공간에 1byte를 할당할때, 
		 * 각 공간들마다 주소가 있다.(주소는 2진수로 되어있다) 
		 * num은 남은 공간에 부여한 명칭 
		 * byte num;
		 * num = 5;
		 * 
		 * checkup는 삽입 되었는지 출력. 
		 * 
		 */
		byte num;
		//초기화
		num = 5;
		System.out.println("num : " + num);
// 		변수 선언과 동시에 초기화 *권장 
		short two = 3;
		
		System.out.println("two : " + two);
		
		two = 446;
		System.out.println("값 변경 후 two : " + (two + num));
		//변수의 자료형을 붙일 때 자료형을 제거해야한다. 그리하여 붙여넣기가 가능.
		
	}
}
