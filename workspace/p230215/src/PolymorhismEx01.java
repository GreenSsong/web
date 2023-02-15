/**
 * @polynorhism
 * 다형성
 * 1. 부모의 참조변수로 자식 객체를 찾아가는 것 (가르키다)
 * 
 * 
 * ========================================================
 * 
 * 2.
 * 
 */

class Parent{
	private int money = 100_000;
	public void spend(int money) {
		this.money -= money;
		System.out.println("남은 돈" + this.money + "입니다");
	}
	public void working() {
		System.out.println("부모님은 일하는중");
	}
	
}

class Son extends Parent{
	public void play( ) {
		System.out.println("slay~~");
	}
	/**
	 * @see method overriding
	 * 상속 관계에서 부모의 멤버 메서드를 자식이 재정의 선언부는 그대로 사용하고, 
	 * body(기능)만 수정 접근권한은 부모의 멤버 메서드의 접근권한보다 크거나 같아야 함
	 */
	@Override
	public void spend(int money) {
		System.out.println("@@@@@@@@@@ overriding method @@@@@@");
		System.out.println("놀래 " + money +"입니다");
	

	}
}

class Daughter extends Parent{
	public void study() {
		System.out.println("study~~");
	}
	@Override
	public void spend(int money) {
		System.out.println("######overriding######");
		System.out.println("학원비 " + money);
	}
}
public class PolymorhismEx01 {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		/**
		 * 다형성
		 * 부모의 참조변수로 자식의 객체를 가리킴
		 */
		Parent p2 = new Son();
//		p2.play(); 불가함
		p2.spend(1000);
		
		Parent p3 = new Daughter();
		p3.spend(200);
		
//		Daughter d = new Parent();
		//객체 배열
		
		//첫번째 형태 객체 배열 생성 후 초기화
//		Parent[] p4 = new Parent[2];
//		p4[0] = new Son();
//		p4[1] = new Daughter();
		
		//두번째 형태
		//객체 배열 생성과 동시에 초기화
//		Parent p4[] = new Parent[2] {new Son(), new Daughter()};
		Parent p4[] = {new Son(), new Daughter()};
		
		/**
		 *  형변환
		 *  1. 다형성
		 */
			Parent pr = new s
			
			
			
		p4[0].spend(11);
		p4[1].spend(22);
		
		
		Son s = new Son();
		s.spend(1_000_000);
		
		
	}

}
