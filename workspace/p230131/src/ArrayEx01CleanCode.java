

public class ArrayEx01CleanCode {

	public static void main(String[] args) {
		// 배열과 생성 할 때 초기화 하려면, 길이를 넣지 말자.
		int[] math = new int[] {80, 90, 68, 75, 68, 20, 77,};
		
		math[0] = 85;
		math[1] = 53;
		math[2] = 18;
		math[3] = 89;
		math[4] = 77;
//		for(int idx=0; idx<math.length;idx++) {
//			System.out.println("변수 : ["+idx+"]" + math[idx]);
//		}
		for (int element : math) {
			System.out.println(element);
		}
		
	}

}
