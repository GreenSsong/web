package one;

public class TestD	extends TestA {
	//멤버 메서드
	void show() {
//		System.out.println(num1); //private 허용 안됭
		System.out.println(num2); //default 패키지 같으면 괜찮아
		System.out.println(num3);
		System.out.println(num4);
	}
}
