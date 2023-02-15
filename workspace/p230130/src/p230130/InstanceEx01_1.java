package p230130;

class Student{
	// 멤버 변수
	
	int age;
	String name;
	//멤버 메소드
	
	void study() {
		System.out.println("공부해용!");
	}
	void showInfo() {
		System.out.println("나이 > " + age + "\n name > " + name);
	}
	void setAge(int age){
		this.age = age;
		
	}
	void setName(String name) {
		this.name = name;
	}
}

public class InstanceEx01_1 {

	public static void main(String[] args) {
		//객체 생성: 메모리 할당 => heap 영역 할당
		
		Student p1 = new Student(); 
		//참조 변수 선언
		
		//멤버 접근
		//문법) 참조 변수.멤버 변수  
		//객체 지향은 외부접근을 통한 멤버변수 접근 : 권장 X 
		//문법) 참조 변수.멤버 메서드
		p1.age = 10;
		p1.name = "춍춍";
		System.out.println(p1.age);
		System.out.println(p1.name);
		p1.study();
		p1.showInfo();
		
	}

}
