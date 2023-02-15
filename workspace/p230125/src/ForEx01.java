/*
 * while - for 서로 변환이 가능하다.
 * 
 * "반복문" 은 내가 원하는 횟수 만큼 연속 해서 사용하고 싶을 때 사용.
 * 
 * 반복 횟수 결정을 한다고 정해 질때, 
 * for문 사용
 * 
 * 코드를 작성할 때 몇번이 반복될 지는 모르겠다. 
 * 실행이 된 후에 반복이 결정 될 때는 
 * while를 사용
 */
public class ForEx01 {

	public static void main(String[] args) {

		// while 문
		int idx = 1; //초기 값
		
		while(idx < 3) { //조건식
			System.out.println("while문 idx >>" + idx);
			idx++;       //증감식
		}
		//for문
		//for(초기값; 조건식; 증감식) {
		//	명령문;
		
		for(idx = 1; idx <3; idx++) {
			System.out.println("for문 idx >>" + idx);
		}
		
		System.out.println("프로그램 종료 : " + idx);
		
	}
}
