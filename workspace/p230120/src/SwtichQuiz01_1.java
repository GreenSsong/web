import java.util.Scanner;

public class SwtichQuiz01_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//월 입력
		System.out.println("월을 입력해주세용 >>>");
		int mt = input.nextInt();
		String se = "";
		
		//계절 출력
		switch (mt) {
		case 3: case 4: case 5:
			se = "봄";
//			System.out.println("현재 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			se = "여름";
//			System.out.println("현재 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			se = "가을";
//			System.out.println("현재 계절은 가을입니다.");
			break;
		default:
			se = "겨울";
//			System.out.println("현재 계절은 겨울입니다.");
		}
		System.out.println("현재 계절은 " + se + "입니다." );
	}

}
