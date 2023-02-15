import java.util.Scanner;
public class SwitchQuiz01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("현재 월을 입력하세용!");
		int n = input.nextInt();
		
		switch (n) {
		case 12: case 1: case 2:
			System.out.println("Winter");
			break;
		case 3: case 4: case 5:
			System.out.println("Spring");
			break;
		case 6: case 7: case 8: 
			System.out.println("Summer");
			break;
		default :
			System.out.println("Autumn");				
		
		}
		
		System.out.println("현재의 계절은 " + n + "입니다");	
	}

}
