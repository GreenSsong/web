
public class NestedLoopQuiz01 {

	public static void main(String[] args) {
		
		outer:
		for(int i=2; i<10; i++) {
			System.out.print(i+"단");
			System.out.println();
			//루프
			for (int j=1; j<10; j++) {
				System.out.println(i +"*"+j+"=" + (i*j) );
			}
			System.out.println();
		}
	}

}
