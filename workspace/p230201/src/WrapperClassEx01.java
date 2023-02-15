/**
 * wrapper class
 * 
 * byte - short - character - integer - long
 * float - double
 * boolean
 * 
 * 자동 형반환
 * 					boxing
 * 기본 형			->>>			참조형
 * primitive type			reference type
 * 					<<<-
 * 					unboxing
 * 
 * 
 */			
public class WrapperClassEx01 {

	public static void main(String[] args) {

		int num = 5; 
		Integer num2 = 6;
//		Integer num3 = new Integer(8); //앞으로 없어 질 수 있으니 사용 자제
		Integer num3 = Integer.valueOf(6);
		System.out.println(num3);
		
		int num4 = num3;
		
	}

}
