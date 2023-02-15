/*
 * 메서드 
 * 기능 동작
 * 
 * 
 */
public class MethodEx01 {
 //메소드 정의
	
	public static void increment(int num) {
		num++;
		System.out.println("1증가한 값 >" + num);
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(" 시작 >>");
		int num = 100;
		increment(5);
		System.out.println("num" + num);
		System.out.println(" 끝 >>");
		
		
	}

}
