package p230130;
//참조형 매개 변수는 다른 클래스에 있는 메서드를 사용하고 가져올 수 있다. 
// type이 클래스다.
public class InstanceEx03_1 {
	//메서드 정의
	//메서드에 메서드에 참조 변수가 올 수 있다. 
	
	public static void newYear(Student student) {
		System.out.println("참조변수 student 저장된 객체 주소 : " + student);
		System.out.println(student.name);
		System.out.println("나이" + student.age++);
	}
	//
	
	
	public static void main(String[] args) {
		Student hong = new Student();
		System.out.println("참조 변수 hong에 저장된 객체 주소 :" + hong);
		hong.age = 25;
		hong.name = "홍길동";
		hong.showInfo();
		
		newYear(hong);
		hong.showInfo();
		
		newYear(new Student());
		
		
		
	}

}
