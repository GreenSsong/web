package p230130;
class Dog{
	// 멤버 변수
	int age;
	String name;
	
	Dog(){
		this(0, "미확인");
		System.out.println("매개 변수 없음 생성자 실행 완료");
		this.showInfo();
	}
		Dog(String name){
			this.name = name;
			this.age = 0;
			System.out.println("매개 변수가 1개인 생성자");
			this.showInfo();
	}
			Dog(int age, String name){
				this.age = age;
				this.name = name;
				System.out.println("매개 변수가 2개인 생성자");
				this.showInfo();
		}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//멤버 메서드
	void showInfo() {
		System.out.println("나이 :" + this.age + ", 이름  : " + name);
		
	}
	
	
}
public class ConstructorEx03 {

	public static void main(String[] args) {
		Dog happy = new Dog(45, "멍멍이");
//		happy.showInfo();
		
		Dog sky = new Dog(5, "하늘");
//		sky.showInfo();
		
		Dog blue = new Dog();
//		blue.showInfo();
	}

}
