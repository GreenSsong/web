/*
 * 조건문 switch문
 * switch(값) 상수(변수, 간단한 식)
 * 스위치는 중가로가 필수
 * 스위치는 오직 정수만 가능
 * 
 * 스위치에 온 값에 대해 그 아래의 명령어를 실행한다.
 * 
 * switch(값) {
 * case 값1:
 * 		명령어;
 * 		명령어;
 * case 값2;
 * 		명령어;
 * 		명령어;
 * default:(나머지 모두다)
 * 		명령어;
 * 		명령어;
 * 
 * 
 * }
 * 
 */



public class SwitchEx01 {

	public static void main(String[] args) {

	int n=1;
	
	switch(n) {
	case 1:
		System.out.println("Simeple Java");
		break;
	case 2:
		System.out.println("Funny Java");
		break;
	case 3:
		System.out.println("Fantastic Java");
		break;
	default:
		System.out.println("The best programing language");
		break;

	}
	
	System.out.println("Do you like coffee?");
		
		
	}

}
