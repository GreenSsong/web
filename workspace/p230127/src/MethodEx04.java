/*
 * 
 * 메서드 정의
 * 형태 4 매개변수 X , 리턴값 O
 * 기능: 호출하면 문자열 리턴 출력
 *
 */
public class MethodEx04 {
	public static String returnString() {
		return "돌아가세용~";
		
		
	}
	public static void main(String[] args) {

		//메서드 호출
		//1. 변수 저장 (변수에 저장해서 소장할 것이라는 명령어)
		//순서 -> 변수 처리부터 한다 - > 메서드를 실행 한다.
		String str = returnString();
		
		//2. 바로 출력
		System.out.println("메소드 바로 보여줘 :" + returnString());
		
		System.out.println("보여줘 : \n " + str);
		
	}

}
