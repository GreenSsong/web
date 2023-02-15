
public class NestedLoopQuiz02 {

	public static void main(String[] args) {
		int i = 2;
		outer:
			while(i < 9) {
				i++;
				System.out.println(i+"단");
				
				int j = 1;
				while(j<9) {
					j++;
					System.out.println(i + "*" + j + "=" + (i*j));
			}
	}
		
		
	}
}
