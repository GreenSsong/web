import java.util.Scanner;

/*
 * refcatoring 작업은 가독성 코드의 정리 이다.
 * 메서드는 코드를 모아둔 것 반복적인 코드를 모아 둔것. 
 * 반복문: 반복되는 코드를 모아둔 것(연속적으로 연이어서 실행)
 * 메서드는 비연속적이고 중간에 다른 코드로 되어있다. (필요할 때마다 불러서 쓰는 것이 메서드)
 */
public class MethodRefactoringEx02 {

	
	public static void main(String[] args) {

		int num = 5;
		crement(num);
		
		Scanner input = new Scanner(System.in);
		System.out.println("입력해주세요");
		int userNum = input.nextInt();
		
		crement(userNum);
		
		int var = 10;
		crement(var);
	}

	public static void crement(int args) {
		args++;
		System.out.println(args);
	}

}
