class Parent{
	//field instance field
	int money = 10000000;
	public Parent() {
		System.out.println("parent 생성자 실행");
		
	}
	
	//method instance method 
	void buy(int money) {
		this.money -= money;
		System.out.println(" 남은 돈 : " + this.money + "입니당");
	}
	
}
	//
	class Child extends Parent{
		//첫 라인에는 생성자에서 다른 생성자를 호출하는 것으로 시작
		public Child() {
			System.out.println("child 생성자 실행");
		}
	}
public class InheritanceEx01 {
	public static void main(System[] args) {
		
		Child c1 = new Child();
		c1.buy(111111);
	}
}
