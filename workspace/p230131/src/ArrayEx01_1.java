

public class ArrayEx01_1 {

	public static void main(String[] args) {
		int[] math = new int[6];
		math[0] = 746;
		math[1] = 372;
		math[2] = 547;
		math[3] = 456;
		math[4] = 237;
		math[5] = 845;
		System.out.println("배열의 길이 :" +math.length);
		for(int index = 0; index < math.length; index++) {
		}
			for(int element: math) {
					System.out.println(element);
		}
	}
}

