class Student {
	//method overriding
	public String toString() {
		System.out.println("재정의 된 메서드 toString 실행됨");
		return " student Class" ;
	}
}
public class InheritanceEx04 {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s);
		System.out.println(s.toString()); //object 메서드
		
	}
}
