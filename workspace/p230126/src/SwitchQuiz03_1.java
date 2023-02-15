import java.util.Scanner;

public class SwitchQuiz03_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int user = 1;
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력해 주세요");
		user = input.nextInt();
		int computer=(int)(Math.random()*3)+1;

		System.out.println("당신은" + user + "입니다");
		System.out.println("컴퓨터는" + computer + "입니다");
		
		String exp = "당신은"; 
	
		switch(user-computer) {
		case 1: case -2:
			System.out.println(exp +"\t이겼다.");
			break;
		case 2: case -1:
			System.out.println(exp +"\t졋다.");
			break;
		case 0:
			System.out.println(exp +"\t비겼다.");
			break;
		}		
	//자원 해제
		input.close();
		
	}
}

