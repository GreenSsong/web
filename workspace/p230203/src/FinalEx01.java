/*
 *  final 금지 
 *  final field : 값 변경 금지
 *  final method : 오버 라이딩 금지
 *  final class는 상속이 되지 않아요.
 *  
 */

 class Fruit{
	//field instance field heap 영역 할당
	int count;
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	
	public Fruit(int count) {
		this.count = count;
	}
	// method
	public void showCount() {
		System.out.println("현재 남은 과일? " + this.count + "개 에용");
	}

	public void showInfo() {
		System.out.println("과일 출력 메서드르");
	}
}
class Banana extends Fruit{
	/**
	 * @Override
	 * 문법 검사도 해줌
	 */
	// 매개 변수 없는 생선자.
	public Banana() {
	}
	Banana(int count){
		super.count = count;
	}
	@Override
	public void showInfo() {
		System.out.println("현재 과일은 바나나 : ");
		System.out.println("바나나" + super.count + "있어용");
	}
}

public class FinalEx01 {
	public static void main(String[] args) {
		
		Banana nanaO = new Banana(0);
		nanaO.showInfo();
		System.out.println();
		Banana nanaT = new Banana(10);
		nanaO.showInfo();
	}
}
