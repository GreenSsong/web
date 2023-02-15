/**
 * 상수 Literal
 *type: 정수, 실수, 문자, 문자열 
 *
 */
public class StringEx01 {

	public static void main(String[] args) {

		String s = "안녕";
		String s2 = "안녕";
		String s3 = new String("안녕");
		String s4 = new String("안녕");
	System.out.println("참조변수 s에 저장된 문자열의 시작 주소 : " + s);
		if(s2 == s3) 
			System.out.println("같아?" );
		
		else 
			System.out.println("다르다?");
		
		//String 객체에 저장된 문자
		System.out.println("문자열 비교 >" + s3.equals(s4));
		
		
		//String 객체 배열
//		String[] strArr= new String[3];	
//		strArr[0] = new String("java");
//		strArr[1] = new String("H");
//		strArr[2] = new String("pyth");
		
///		String[] strArr1 = new String[] {new String("java"), 
//				new String("java"), new String("pyt")};
//		String[] strArr1 = {new String("java"), 
//				new String("H"), new String("pyt")};
		String[] strArr = {"java", "H", "pyt"};
		
			
		for (String a : strArr) {
			System.out.println(a);
		}
	}
	
}
