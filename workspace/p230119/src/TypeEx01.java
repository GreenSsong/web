
public class TypeEx01 {

	public static void main(String[] args) {

		/* 
		 *===========  정수형 ==============
		 byte - char - short - int - long 
		  1	     2		2		4	  8
		        문자		기본
		  
		 */
		
		char ch1 = 65;
		System.out.println("ch1 : " + ch1);
		
		// char _ 2byte 할당
		
		/* =========== 실수형 ===============
		 * float - double
		 *  4 		 8
		 *  7		16 (소수 자리수)
		 *  0 - 1 사이에 많은 수를 표현하기 어렵다. 
		 *  컴퓨터의 표현 할 수 있는 소수 자리수 정확히 표현 중요 한지가 중요 (정확도가 중요하다.)
		 *  
		 */		
		double one = 2.34;
		
		System.out.println("one : " + one);
		
		float two = 2.34F;
		System.out.println("two : " + two);
		
		/*
		 * ===========논리형======
		 * boolean
		 * 1
		 * true/false
		 */
		
		boolean value = false;
		System.out.println("value : " + value);
		
		
		/*
		 *  참조형
		 *  reference Type : class
		 */
		String str = "즐거운 하루";
		System.out.println("문자열 출력 : " + str);
		
	}

}
