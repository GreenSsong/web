
public class OperatorEx04 {

	public static void main(String[] args) {

		
		int num = 5;
		int result1;   //쓰레기 값이 저장되어 있으면 좋은 것이 아니다.
		
		// num++; (후증가) 
		//result1 = ++num; //++num (선증가 연산자: 변수 왼쪽에 있는 증가를 말한다 ) 
		result1 = num++;  // result1 = num; + num = num +1; 두개의 코드를 합친 것 
		//곧 다음 값에 증가된 값을 사용하기 위함이다.
		
		System.out.println("num >> " + num);
		System.out.println("result1 >> " + result1);
		
		
		
	}

}
