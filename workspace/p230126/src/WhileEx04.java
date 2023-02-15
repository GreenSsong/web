/*
 * 지역 변수
 * method
 * 영역 내 선언된 변수
 * 영역 내에서만 접근(사용) 가능 -> 영역 밖에서는 접근(사용) 불가능
 * 
 */
public class WhileEx04 {

	public static void main(String[] args) {

		int idx = 1; //지역 변수 : main method 영역 내에서만 가능
	
		while(idx < 10) {
			System.out.println("while문 선언된 변수 num >> " + num);
		
			idx++;
		}
		System.out.println("idx >> " + idx);
//		System.out.println("num >> " + num);
	}
	
}
