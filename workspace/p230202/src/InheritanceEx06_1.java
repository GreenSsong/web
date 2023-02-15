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
class Banana {
	Fruit yummy;
	public Banana(int count) {
		if(count !=0)
				yummy=new Fruit(count);
		else
				yummy=null;
	}
	public void showInfo() {
			System.out.println("현재 과일은 바나나 입니다");
			
	public void showCount() {
			System.out.println("과일 개수는" + count + "ㅇㅇ");
	}
	}
}
public class InheritanceEx06_1 {

	public static void main(String[] args) {
		
		// 문제 1
		Banana b1 = new Banana(0);
		b1.showInfo();
		b1.showCount();
		//문제 2
		Banana b2 = new Banana(10);
		b2.showInfo();
		b2.showcount();
	}
}
