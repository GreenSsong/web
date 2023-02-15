/*
 * 1. 무한 루프(loop)
 * 문법: while(true)
 * 좋다 나쁘다가 아니라 코드를 작성하는 기법중에 하나이다.
 * 
 * 2. break 는 반복문을 빠져 나가주세요
 */
public class WhileEx02 {

	public static void main(String[] args) {

		int idx = 1;
//		
//		//무한 루프문 구현
//		while(true) {
//		System.out.println("IDX >> " + idx);
//		
//		if(idx == 3) 
//			break;
//		
//			idx++;
//		}
		// 위 무한 루프문을 조건식이 있는 while문으로 변경하기
		
		
		while(idx < 4) {
			System.out.println("IDX >>>" + idx);
			idx++;
			
		}
		
		
		
		System.out.println("반복문 실행 후 idx >> " + idx);
		System.out.println("프로그램 종료>>");
		
		
		}
	 

}
