
public class TypecastingEx01 {

	public static void main(String[] args) {
		// 형변환 1 unit ======================
		int n1 = 9;
		int n2 = 2;
		//int n1 = 9, n2 = 2;
		
		
		System.out.println("n1 / n2 = " + n1 / n2); //몫은 소괄호가 없어서 먼저 처리 된다.
		// 정수 / 정수 = 정수 이다.
		System.out.println("n1 / n2 = " + n1 / (float)n2); // -> 값이 4.5 강제 형변환은 퍼센트률이나 소숫점을 보기 위해 다른 말로 명시적 형변환
		System.out.println("n1 / n2 = " + ((float)(n1 / n2))); //-> 값이 4.0 가로 형식 차이
		//*컴퓨터 용어는 대상은 하나인데 용어가 여러가지 일 수 있다
		/* 형변환 Type Casting
		 * - 강제 형변화, 명시적 형변화
		 * - 자동 형변화, 묵시적 형변화
		 * @@@@@@@정수 @@@@@@@@@@      @@@ 실수 @@@@
		 * byte - short - int - long ---- float --- double
		 * 정수와 실수의 계산은 실수
		 * 바이트가 큰 단위로 변경됌
		 */
		
		
		// 형변환 2 unit ===================
		//자동 형변화는 작은 크기가 높은 크기로 변환을 할 때 / (타입)을 넣어주는 과정이다.
		//강제 형변화는 큰 크기를 작은 크기로 변환을 할때 
		int num = 100;
		//short sh = num; 컴파일러에게 알려줘야 함(int(4) 와 short(2) 의 차이 때문)
		short sh = (short) num; 
		byte by = (byte) num;

		long lo = num;
		
		float fo = num; //"num" 은 100.0
		double db = num;
		//정수 = 실수 -> 실수로 바뀐다. 자동 형변환 (int -> float 변경)
		
		
		
		
		
	}

}
