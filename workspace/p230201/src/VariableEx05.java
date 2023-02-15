class Animal{
//	final static field 
//	final field : 초기화한 값으로 값 고정 -> 값 변경 금지
	// 변수 명이 대문자 -> 값 변경이 불가
	final static int COUNT = 6;
}
public class VariableEx05 {

	public static void main(String[] args) {

		System.out.println("동물 몇마리  " + Animal.COUNT);
		System.out.println("현재는 ? : " + Animal.COUNT);
	}

}
