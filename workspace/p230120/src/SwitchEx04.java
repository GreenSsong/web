// 스위치는 / 10을 사용 하면 값이 나타 중간 값(나머지를 뺸 수)을 구한다.


public class SwitchEx04 {

	public static void main(String[] args) {

	int n = 8;
//		if(n>=0 && n<10)
//			System.out.println("0이상 10미만인 수");
//		else if(n>=10 && n<20)
//			System.out.println("10이상 20미만인 수");
//		else if(n>=20 && n<30)
//			System.out.println("20이상 30미만인 수");
//		else
//			System.out.println("30이상의 수");
		
	
	switch(n / 10) {
	case 0:
		System.out.println("0이상 10미안인 수");
		break;
	case 1 :
		System.out.println("10이상 20미안인 수");
		break;
	case 2 :
		System.out.println("20이상 30미안인 수");
		break;
	default :
		System.out.println("30이상 수");
		
	
	}
	
	
	
	
	
	
		}

}
