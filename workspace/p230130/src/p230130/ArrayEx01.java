package p230130;
/*
 * 배열은 ?? array 
 * : 하나의 이름으로 여러 값(요소, 원소, "객체")를 관리하고 싶은 것
 * 메모리 공간을 할당하는 것
 * :여러 값을 구분하기 위해서 index(번호) 사용
 *  -> index는 0부터 시작 (주소 개념)이 있다.
 *  
 * :자바는 배열을 "객체"로 생성 ==> heap 영역 생성
 * : heap를 사용 하기에 주소를 통해서만 접근 가능(간접 접근)  
 *  
 *  문법
 *  자료형[] 배열명 = new 자료형[길이]; <--길이 = 갯수 의미
 *  
 * :배열 생성과 동시에 초기화할 경우, 반드시 길이 생략
 * 문법
 *	자료형[] 배열명 = new 자료형[]{초기값1,초기값2 초기값 ..}
 *	자료형[] 배열명 = {초기값1,초기값2 초기값..}
 *  
 *  배열을 생성하면, 배열의 길이가 length 변수에 저장
 *  문법 
 *  배열명.length
 *  --> length 변경 불가능 ef) 배열명.length =6;
 *  
 */
public class ArrayEx01 {

	public static void main(String[] args) {

		// 반 학생들의 수학 점수 저장 "
//		int math1 = 80;
//		int math2 = 95;
//		int math3 = 90;
//		int math4 = 70;
//		int math5 = 100;
		
		// 배열 생성
		//1-1 참조 변수 선언
		int[] math;
		//자료형[] 배열을 나타내는 자료형 "[]" math는 참조 변수
		//int형의 배열(대가로가 하나다 "1차원 배열")
		
		
		//1-2	배열 생성 
		math = new int[5];  
		//참조 변수를 = new 자료형[길이]
		//참조 변수 math에 int형의 길이가 5인 1차원 배열 생성후 주소저장
		
		// 2 배열 요소(원소)에 값 출력 -> 반복문: for
//		System.out.println("Math [0] :" + math[0];
//		System.out.println("Math [1] :" + math[1];
//		System.out.println("Math [2] :" + math[2];
//		System.out.println("Math [3] :" + math[3];
//		System.out.println("Math [4] :" + math[4];
		
		//일반 for문을 변경
		for(int idx = 0; idx<5; idx++) {
			System.out.println("math["+ idx + "] >> " + math[idx]);
			
		//향상된 for문 (only 배열만)
		//문법
		//for(자료형 변수명: 배열의 참조변수){
		//		명령어;
		//}
		for(int element: math) {
			System.out.println(element);
		}
		}
	}

}
