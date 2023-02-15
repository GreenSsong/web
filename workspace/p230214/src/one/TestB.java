package one;

public class TestB {
	// 객체 생성
	TestA a = new TestA();
	
	void show() {
		//System.out.println(a.num1); //Error! private
		System.out.println(a.num2); //default - 같은 패키지
		System.out.println(a.num3); //protected
		System.out.println(a.num4); //public
	}

}
