class Student{
	//멤버 변수(field 필드)
	int age;
	String name;
	
	Student(int age, String name){
		this.age = age;
		this.name = name;
	}
	//멤버 메서드
	void showInfo() {
		System.out.println(" 나이 : " + this.age);
		System.out.println(" 나이 : " + this.name);
	}
}
public class ArrayInstanceEx01 {
	public static void main(String[] args) {
		//객체 배열 : 1차원 배열
		//타입 배열명 = new 타입 [길이]
		Student[] smart = new Student[3];
		smart[0] = new Student(20, "hong");
		smart[1] = new Student(29, "park");
		smart[2] = new Student(35, "choi");
		
		//배열 생생과 동시에 초기화
		Student[] smartTwo = new Student[] {
				new Student(20, "hong"), 
				new Student(29, "park"), 
				new Student(35, "choi")};
		
		Student[] smartThree = {
				new Student(20, "hong"), 
				new Student(29, "park"), 
				new Student(35, "choi")};
		// 일반 for문 : 내장 변수 length
//		smart[0].showInfo();
//		smart[1].showInfo();
//		smart[2].showInfo();
//		
		for(int i=0; i<smart.length;i++) {
			smart[i].showInfo();
		}
		// 향상된 for문 
		//배열명을 찾아 갈때 주소로 가는 데 타입과 일치 해야하기에 (클래스)
		for(Student student : smart) {
			student.showInfo();
			
		}
	}
	
}
