import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input	= new Scanner(System.in);
		int userValue = 0;
		int fac = 1;
		do {
			System.out.println("1 ~ 10 사이의 정수");
			userValue = input.nextInt();
		}
			while(userValue <1 || userValue > 10); {
				
				for(int i = 1; i<=userValue; i++)
					fac= fac*i;
			}
			System.out.println(userValue + " !: " + fac);
	}

}
