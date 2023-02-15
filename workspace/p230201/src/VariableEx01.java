/**
 * 
 * 변수 종류
 * ---------------------------------------------------------
 * 						|	메모리영역  |		메모리 할당 시기
 * ---------------------------------------------------------
 * 지역 변수			|	stack		|	해당 영역이 실행
 * 멤버 변수	instance|	heap		|	객체 생성 됢
 * 멤버 변수	static	|static(class)	|	class가 로드(load) 됢
 * ---------------------------------------------------------
 * 
 * static
 * static(class) 변수 field(변수)
 * :class 메모리에 로드 될 떄 static class 영역에 해당
 * instance 생성과 상관없이 접근 사용 가능 -
 * -- 객체 생성과 상관없이 변수 사용하고자 할 떄
 * - 문법 클래스명.변수명
 * 해당 클래스로 생성된 객체들이 공유하는 변수
 *  
 *  static method
 * :class 메모리에 로드 될 떄 static class 영역에 해당
 * instance 생성과 상관없이 접근 사용 가능 -
 * -- 객체 생성과 상관없이 변수 사용하고자 할 떄
 * 문법 크랠스명.메서드명();
 * -> 생성 시기가 다름
 * -> static 멤버 메모리 할당 후, instance 멤버가 메모리 할당 됨 
 * 
 * 
 *	final (변수 or 메서드 or class) possible
 * : 변수를 상수화 - > 상수
 * : 기능 : "변경 금지"
 * : cf) final
 * : final 변수
 * : final 메서드
 * : final 클래스
 * 
 */

class Product{
	int year;
	String name;
	final String company;
	
	public Product(int year, String name, String company) {
		this.year = year;
		this.name = name;
		this.company = company;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCompany(String company) {
	}
	void showInfo() {
		System.out.println("생산년도  :" +this.year);
		System.out.println("제품  :" +this.name);
		System.out.println("제조회사  :" +this.company);
	}
	
}
public class VariableEx01 {
	public static void main(String[] args) {
		//일반적인 상수처럼 변경 불가능
		//지역 변수
		final float PI = 3.14F;
		final int num;
		
		// 초기화
		num = 5;
		
		//값 변경 Error!
//		num = 7;
//		4 = 6;  //literal 
		
		//객체 생성
		System.out.println("변경 값 전 :");
		Product p1 = new Product(2020, "곰", "무지");
		System.out.println("변경 값 :");
		//멤버 변수의 값을 변경
		p1.setYear(2055);
		p1.setCompany("다이소");
		p1.showInfo();
	}
}
