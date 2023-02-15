import java.util.Scanner;

/*
 * refcatoring 작업은 가독성 코드의 정리 이다.
 * 메서드는 코드를 모아둔 것 반복적인 코드를 모아 둔것. 
 * 반복문: 반복되는 코드를 모아둔 것(연속적으로 연이어서 실행)
 * 메서드는 비연속적이고 중간에 다른 코드로 되어있다. (필요할 때마다 불러서 쓰는 것이 메서드)
 */
public class MethodRefactoring {

	public static void increment(int args) {
		
		args++;
		System.out.println(args);
	}
		
	
	public static void main(String[] args) {
		//매개변수 1 , 리턴 x 
		int num = 5;
		increment(num);
		
		Scanner input = new Scanner(System.in);
		System.out.print("입력");
		int userNum = input.nextInt();
		
		increment(userNum);
		
		int var = 10;
		increment(var);
	}



}
