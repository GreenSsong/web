import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		System.out.println("학점을 입력해주세요");
		int n = input.nextInt();
		char gD = ' ';
		if(n >= 97)
			System.out.println("A+");
		else if(n >= 94)
			System.out.println("A0");
		else if(n >= 90)ㅇ
			System.out.println("A-");
		else if(n >= 87)
			System.out.println("B+");
		else if(n >= 84)
			System.out.println("B0");
		else if(n >= 80)
			System.out.println("B-");
		else if(n >= 77)
			System.out.println("C+");
		else if(n >= 74)
			System.out.println("C0");
		else 
			System.out.println("C-");
		
		System.out.print("당신의 학점은" + n +"입니다");
	}

	
}
