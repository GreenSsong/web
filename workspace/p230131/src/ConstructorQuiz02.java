	class Caculator{
		int i, j;
		public Caculator(int i, int j) {
		}
		int add(int i, int j) {
			this.i=i;
			this.i=j;
		return i+j;
	}
		int sub(int n1, int n2) {
		return n1-n2; 		
		}
		int mul(int n1, int n2) {
		return n1*n2;
		}
	static int div(int n1, int n2) {
		return n1/n2;
	}
	static void showInfo() {
		System.out.println(add);
	}
}
public class ConstructorQuiz02 {

	public static void main(String[] args) {
		System.out.println("첫 번째 계산");
		Caculator firstCaculator = new Caculator(5, 2);
		firstCaculator.add();
		
	}

}
