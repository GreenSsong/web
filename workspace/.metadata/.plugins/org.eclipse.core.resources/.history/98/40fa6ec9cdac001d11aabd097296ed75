package two;

import one.TestA;

public class TestC {
	// 객체 생성
	TestA a = new TestA();
	
	void show() {
		System.out.println(a.num1); // Error! - private : 내부접근만 허용
		System.out.println(a.num2); // Error! - default : 같은 패키지만 허용
		System.out.println(a.num3); // Error! - protected : 상속만 허용
		System.out.println(a.num4); // public
	}

}
