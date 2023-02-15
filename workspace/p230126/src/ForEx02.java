import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("숫자를 삽입해주세요");
		
		int num = input.nextInt();
		for (int index = 1; index < 10; index++) {
			System.out.println(num+"*"+index+"="+(num * index));
		}
		
		
	}

}
