/*
 * 삼항 연산자
 * -조건 연산자
 * 조건 두개를 표현하는 연산자
 * 
 * -문법
 *	변수 = (조건식) ? true일 때 : false일 때; (하나의 연산자)
 * 	트루일 때는 물음표 옆, 페일 일때는 트루 옆인 콜론 다음
 * 	왼쪽에는 변수가 있어야 한다 항상 Java는 대입이 필요하다.
 * c언어 절차 지향, c++ 객체 지향(절차,객체 중간), java 객체 지향 
 * 
 */
public class OperatorEx01 {
	public static void main(String[] args) {
		// num의 값이 5이상이면, 10을 저장
		// num의 값이 5미만이면,  0을 저장
		
		int num = 3;
		
		int result = (num >= 5) ? 10 : 0; // 변수 = (조건식) ? true일 때 : false일 때
		
		System.out.println("result >> " + result);
		
 }
}
