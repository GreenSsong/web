class Dog{
	// 멤버 변수
	int age;
	String name;
	
	
	// 멤버 메서드
	//setter/ getter : alt + shift + s + r
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
	
	
}

public class InstenceEx03 {
	
	public static void main(String[] args) {


		//객체 생성
		// "객체명" 개칙  
		Dog happy = new Dog();
		Dog sky = new Dog();
		
		//객체에 이름 저장
		happy.setName("행복");
		sky.setName("하늘");
		//객체에 저장된 이름 출력
		System.out.println("강아지  1 :" + happy.getName());
		System.out.println("강아지  2 :" + sky.getName());
		
		
		
	}

}
