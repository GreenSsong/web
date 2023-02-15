class Fruit{
	//field
	int count;
	//method
	public Fruit(int count) {
		this.count = count;
	}
	void showCount() {
		System.out.println("현재 남은 개수" + this.count + "입당");
	}
	void showInfo() {
		System.out.println("과일 정보 출력 하는 메서드 입니당");
	}
}
class Banana extends Fruit{
	//code.. 문제 1 오버라이딩
	//code.. 문제 2 생성자를 이용하여 부모 class Fruit의 멤버 변수 count에 값을 설정 하시오
	public Banana(int count) {
		super(count);
	}
	
	public void showInfo() {
		System.out.println("현재 과일은 바나나 입니다");
	}
}
public class InheritanceEx06 {

	public static void main(String[] args) {
		
		// 문제 1
		Banana b1 = new Banana(0);
		b1.showInfo();
		System.out.println();
		//문제 2
		Banana b2 = new Banana(10);
		b2.showInfo();
	}
}
