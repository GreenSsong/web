

public class NestedLoopQuiz01_1 {

	public static void main(String[] args) {
		int i = 2;
		int j = 1;
		while(i<10) {
			System.out.println();
			System.out.println(i+"단");
			j=1;
			while(j<10) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
				j++;
			}
			i++;
		}
		
	}

}
