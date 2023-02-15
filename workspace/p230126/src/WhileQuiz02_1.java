
public class WhileQuiz02_1 {

	public static void main(String[] args) {

		//초기값
		int idx = 1;
		//조건식
		while(idx <10) {
			System.out.println("2 * " +idx + "=" + (2*idx));
			idx++;
		}
		System.out.println("반복문 실행후" +idx);
	}

}
