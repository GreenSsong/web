/*
 * "클래스" class
 * - 클래스는 "자료형" 이다.
 * - 사용자(개발자) 정의 자료형
 * -참조 자료형 (참조형) reference type
 * 
 * cf) 기본 자료형 : primitive type : int , float, double ...
 * -클래스 명은 대문자로 시작(반드시 문자로 시작)		
 * -클래스 내 member : 변수, 메소드, 
 * 
 * 용어
 * 변수 선언 
 * 메서드 정의 -> 호출
 * 클래스 정의 -> 객체 생성
 * 
 * "객체" object, instance
 * - 클래스로 생성된 구체화(실체화) 된 대상
 * java는 모든 객체를 heap 영역에 생성 -> member도 heap 영역에 할당
 * RAM 안에 객체를 나누는 분류(OS 영역 = stack(지역 변수) , constant, Heap)
 * -객체는 heap영역에 생성되면, 할당된 주소를 리턴(반환)
 * 생성된 객체는 반드시 주소를 통해 접근
 * 
 * -객체 생성 문법
 * new 클래스명();
 * 
 * -참조(reference) 변수 선언 문법
 * 클래스명 변수명;
 * 
 */

//클래스 정의(자료형 다르게)
//클래식 안에 있는 변수는 (멤버 변수) <- 메소드 안에 변수와 다름
//type를 만든 것뿐 출력이 된 것 아니다.
class Student{
		
	//member 변수
	int age;
	public String name; { 
	String name;
	}
	
	//member 메서드
	void study() {
		System.out.println("출력해주세용");
	}
	
}
public class InstenceEx01 {

	
	public static void main(String[] args) {
//기본 자료형
		// 변수 선언 
		// 문법 >> 자료형 변수명;
				//변수 초기화
		int num = 1;
		System.out.println("num >>" +num);
		//참조 자료형(참조형)
		//문법 >> 클래스명 변수명;
		
		//Student hong;
				//메모리 공간에 실체화 된 것 (instant) 객체 형성
			//주소 hong(주소가 저장이 된 변수 참조 변수)으로 들어가 
			//     -> student 실체화를 찾아 간다
		Student hong = new Student();
		
		hong.age = 25;
		hong.name = "춍춍";
		System.out.println(" age >>" + hong.age);
		System.out.println("name>> " + hong.name);
		
		//멤버 메소드
		hong.study();
	
	Student hongTwo = hong;
	System.out.println("hongTwo age?" + hongTwo.age);
	}

}
