class GrandParent{
	// 다중 상속 : 부모가 2개 이상 -> Java는 다중 상속을 허용 하지 않음
	// 단일 상속 : 부모가 1개      -> Java는 단일  상속만 허용
}


class Parent{
	//field
	int money;
	public Parent() {
		this.money = 10_000_000;
		System.out.println("부모 매개 변수가 없는 생성자 ");
	}
	public Parent(int money) {
		this.money = money;
		System.out.println("부모 매개 변수가 1개 생성자 ");
	}
	//method instance method
	void buy(int money) {
		this.money -= money;
		System.out.println("남은돈은 ::"+ this.money + "입니다");
	}
}
class Child extends Parent{
	public Child() {
		System.out.println("자식 매개 변수가 없는 생성자: ");
	}
	public Child(int money) {
		super(money);
		System.out.println("자식이 매개 변수가 1개인 생성자");
	}
	//method instance method
	/**
	 * 메서드 오버라이딩 method overriding
	 * - 상속 관계에서 자식(sub class) 가 부모 (super class) 의 멤버 메서드 재정의
	 * - 부모 class의 멤버 메서드에서 선언부 그대로, 바디(기능)만 수정
	 * - 반환형, 메서드명, 매개변수 정보가 같아야 함.
	 */
	
	void buy(int money) {
		System.out.println("용돈 ::"+ money + "입니다");
}
	/**
	 * 메서드 오버로딩 method overloading
	 * -같은 이름의 메서드를 여러 개 정의
	 * - 단, 매개 변수의 정보가 달라야 함
	 * - 반환형과는 관련 없음
	 */
	void buy() {
		System.out.println("용돈 주셈 ");
	}
}
public class InheritanceEx02 {
	public static void main(String[] args) {
		System.out.println("1. 아들 객체 생성 : new Child");
		Child c = new Child();
		c.buy(100_000);
		System.out.println("\n 2. 아들 객체 생성 : new Child");
		Child c2 = new Child(500_000);
		c2.buy(60_000);
	}

}
