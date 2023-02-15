
public class OperatorEx02 {
	public static void main(String[] args) {
		
		
		  //관계 연산자
		/* 결과값은 true / false
		 * 	<	작다,미만
			>	크다,초과
			<=	작거나 같다,이하
			>=	크거나 같다. 이상
			!=	같지 않다. 다르다
			==	같다.

		 */
		
		int n1 = 5, n2 = 3;
		System.out.println("크니? " + (n1 > n2));
		System.out.println("다르니? " + (n1 != n2));
		System.out.println("같니? " + (n1 == n2));
		
		/*
		 * 논리 연산자
		 * 	&&			And 연산자	Tr && fa = Fa	이항 연산자(양쪽에 식이 온다)
			|| 세로바	Or 연산자	Tr || fa = Tr	이항 연산자 
			!			Not 연산자	! tr = fa	단항 연산자(오른쪽에만 식) 항상 반대 값을 준다. 부정 연산 값이기 때문이다.
		 */
		
		System.out.println("and 연산자 >> " + (n1 > 4 && n1 > 4));
		System.out.println("and 연산자 한쪽이 F 일때 >> " + (n1 > 4 && n2 > 4));
		System.out.println("or 연산자 >> " + (n1 > 4 || n2 > 4));
		System.out.println("or 연산자 >> " + (! (n1 > 4)));
		// System.out.println("or 연산자 >> " + (! n1 > 4)); 오류는 소괄호 때문에
		
		
	}
}
