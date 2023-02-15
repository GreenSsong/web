
	// 클래스 정의

	class Person{
		//맴버 변수
		int age;
		String name;
		String address;
		
		//member 메서드 (메서드 명 : set)
		// 반환형 메서드명(매개변수){
		// 명령어;
		// return 값;
		//setter 세터
		void setAge(int a){
		age = a;
		
		//	getter : 게터
		int getAge() {
			return age;
		}
	}
		public class InstenceEx02 {

		public static void main(String[] args) {
			// 참조 변수 선언..
			//문법 자료형  변수명
			//	class명  참조 변수
			Person p1;
			
			// 객체 생성..
			//문법 new 클래스명();
			//new : heap 영역에 할당 하세용
			
			p1 = new Person();
			
			// member 접근
			// member 변수 값 설정
			//	 	참조 변수를 통한 멤버 변수 값 설정 : 외부 접근
			//		==> 객체지향에서는 권장하지 않는다.
			//p1.age = 27;
			p1.setAge(100);
			System.out.println("나이 >> " + p1.age);
		}	
		}

	

}