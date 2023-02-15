class Number{
	//멤버 변수 : field
//						메모리 영역			할당 시기
	// instance field : heap 영역 할당 instance 생성 될 때
	// static 	field : static 영역 할당 class 메모리 로드 될때 
	static int one = 100;
	int two;
	//멤버 메서드: method
	//						<메모리 영역> 		<할당
	//instance method : 	heap 영역 할당		instance생성이 될 떄
	static void staticShow() {
		System.out.printf("one : %d, two : %d\n", one , );
	}
	
	void show() {
		System.out.printf("one : %d, two : %d\n", one , two);
	}
}
public class VariableEx03 {

	public static void main(String[] args) {
		//문법 클래스명. 변수명 
		System.out.println("static field >> " + Number.one);
		
		 
		 /**
		  * static method 접근
		  * 문법 클래스명. 메서드명
		  */
		Number number = new Number();
		//instance field 접근
		//문법 참조변수.변수명
		System.out.println("instance field : " + number.two);
		System.out.println("[권장하지 않아요]참조"
				+ " 변수를 통한 static 멤버 접근 " + number.one);
		
		//instance method 접근
		//문법 참조변수. 메소드명();
		number.show( );
	}

}
