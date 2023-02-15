/*
 * <<리터널>> literal
 * 정수형 5    		int
 * 실수형 2.5  		double
 * 문자형 'a'  		char
 * 문자열 "사과"	string
 * 
 * 
 */
public class SwitchEx05 {

	public static void main(String[] args) {

		
		String f = "바나나";
		
		switch(f) {
		
		case "사과":
			System.out.println("사과는 오른쪽 창고에 있습니다.");
			break;
			
		case "배":
			System.out.println("배는 왼쪽 창고에 있습니다.");
			break;
		default:
			System.out.println("나머지는 과일은 위쪽 창고에 있습니다.");
			
		}
		
	}

}
