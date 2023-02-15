import java.util.Scanner;

public class IfQuiz05_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			char gd = ' ';
			char op = '0'; //초기값을 설정한 것으로 나중에 결과 도출로 나타나게 된다.
	//1. 정수 입력
		System.out.println("점수를 입력해주세요");
			int sc = input.nextInt();
	//2. 학점 출력
		if (sc >= 90) {
			gd = 'A';
		} else if (sc >= 80){
			gd = 'B';
		} else if (sc >= 70){
			gd = 'C';
		} else if (sc >= 60){
			gd = 'D';
		} else {
			gd = 'F';
			op = ' ';
			
		}	if (sc == 100 || sc % 10 >= 7) {
			op = '+';
		} else if (sc % 10 <= 3) {
			op = '-';
		} else {
			op = ' ';
		}
		System.out.println("학점은" + gd + op + "입니다");
	}
}
