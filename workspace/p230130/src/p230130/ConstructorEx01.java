//package p230130;
//
///*
// * [객체 생성시 순서]
// * 1. 메모리 할당 (heap 영역)
// * 2. 생성자 호출
// * 
// * [생성자를 사용하는 이유]
// * -객체를 생성할 때, 멤버 변수를 원하는 값으로 초기화: 멤버 변수 초기화 
// * -객체 생성할 때 원하는 기능(특정 멤버 메서드) 실행하기 위함
// * [생성자 특징]
// *생성자 constructor
// * - 객체 생성시, 무조건 하나의 생성자 호출
// * - 생성자는 '메서드' -> "method overloading" 를 가능
// * - 생성자 여러 개 정의 가능
// * 
// * - 생성자명 : 클래스명과 같음
// * - 생성자는 반환값(리턴값)이 없음 ==> 반환 return를 하지 않음
// * 
// * - 생성자를 명시하지 않으면, default 생성자(기본 생성자)가 실행
// * -defailt 생성자는 매개변수 없고, 하는 일도 없음 -> 형식상 실행
// * 생성자가 하나라도 명시되어 있다면, default 생성자는 실행 안됌
//
// */
//class Person{
//	int age;
//	String name;
//	// 기본 생성자(default constructor)
//	//	Person(){
//	//	}
//	//setter / getter
//	
//	// 생성자 
//	Person(int age, String name){
//		this.age = age;
//		this.name = name;
//	}
//		Person(String name) {
//			this.age = 1;
//			this.name = name;
//		}	
//			Person() {
//				this.age = 1;
//				this.name = "미입력";
//			}
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	void showInfo() {
//		System.out.println("나이 :" + age + " 이름 : " + name);
//	}
//}
//
//public class ConstructorEx01 {
//
//	public static void main(String[] args) {
//		Person hong = new Person(55, "abcef"); 
//		//매개 변수가 2개인 생성자 호출
//		
//		//첫번째 : 외부접근을 통한 멤버변수 값 설정 : 하지마!
////		hong.age = 27;
////		hong.name = "가나다라";
//		
//		
//		//두번째 : setter/ getter 통한 멤버변수 값 설정
//		// 이미초기화된 변수에 값 설정(덮어쓰기)
////		hong.setAge(25);
////		hong.setName("홍홍홍");
//		
//		System.out.println("객체 생성후 멤버 변수 값" );
//		hong.showInfo();
//		System.out.println("멤버 변수 값 설정 후 변수 출력");
//		
//		//세번째 방법
//		
//		hong.showInfo();
//		// Qiuz
//		
//		Person park = new Person("박보검");
//		park.showInfo(); //이름 O
//		
//		Person choi = new Person();
//		choi.showInfo();// 없음
//	}
//
//}
