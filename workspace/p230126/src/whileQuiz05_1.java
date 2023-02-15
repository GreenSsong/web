import java.util.Scanner;

public class whileQuiz05_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//1.반복문 while
		int num= 0;
		int total= 0;
		while(true) {
			System.out.print("정수를 입력하세용(종료-1)");
			num = input.nextInt();
			if(num == -1)
				break;
			total += num;
		}
		System.out.println("총합은? " +total);
		
		//2.누적합
	}

}
