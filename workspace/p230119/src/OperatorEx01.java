
public class OperatorEx01 {

	public static void main(String[] args) {

		//연산자
		
		//대입 연산자
		int num = 5;
		System.out.println(" num : " + num);
		//Error
		//3 = 5; 
		
		// 산술 연산자
		// + : 덧셈
		// - : 뺄셈 
		// * : 곱셈
		// / : 몫
		// % : 나머지
		
		//int n1 = 5;
		//int n2 = 3;
		
		int n1 = 5, n2 = 3;
		
		System.out.println("덧셈 : " + (n1 + n2));
		System.out.println("뺼셈 : " + (n1 - n2));
		System.out.println("곱셈 : " + (n1 * n2));
		System.out.println("몫 : " + (n1 / n2));
		// 몫은 나머지 없는 정수 
		System.out.println("몫의 나머지 : " + (n1 % n2));
		// 몫의 나머지 필요 할 때
		
		//복합 대입 연산자
		
		//n1 = n1 + n2;  
		//n1 += n2; (간결하게)  
		n1 += n2; 
		System.out.println("n1 : " + n1 + ", n2 : " + n2);
		
		
		
		
		
		
		
		
		
		
	}

}
