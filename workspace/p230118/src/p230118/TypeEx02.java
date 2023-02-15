package p230118;

public class TypeEx02 {

	public static void main(String[] args) {
		
		/* 
		 * 명명 규칙
		 * 
		 * - 숫자로 시작 하면 안됨.
		 * - 띄어쓰기 불가
		 * - 기호는 _만 가능
		 * Java는 변수명 길이 제한이 없다.
		 * 변수명은 저장에 대한 내용을 나타냄.
		 * 
		 *  형태
		 * 이름을 만들 때 형태가 있음.
		 * -snake case : firstnum(구분하기 어려워)
		 * -first_num(변수명을 만들 때 보기 좋기 하기 위함)
		 * -변수명,메서드명은 소문자로 시작함.
		 * -클래스명은 대문자
		 * 
		 * -camel case :
		 *  firstNum(두번째 단어를 대문자로 함) 낙타 처럼 표기한것 같아서
		 * -num(number) 
		 * 잘못 표기 first_Num(두가지 섞어서)
		 * 회사마다 정해진 명칭으로 한다.
		 * 
		 */
		
		
		int num2;

		// [error]변수명은 숫자로 시작 불가능 
		// int 2num;
		
		// [error] 띄어쓰기 사용 불가
		// int num two;
		
		//예시 _기호는 사용 가능
		int num_two;
		int _num;
		
		//error _이외의 기호는 사용 불가
		
		// int num!two;
		
		
	}
}
