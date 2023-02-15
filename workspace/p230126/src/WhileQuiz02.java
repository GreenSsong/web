//2단의 형태
public class WhileQuiz02 {

	public static void main(String[] args) {
//입력
		int numOne = 2; 
		int numTwo = 1;
		
		//while 반복 설정
		while (numOne < 10) {
		while (numTwo < 10) {
System.out.println(numOne + "*" + numTwo +"=" +(numOne*numTwo));			
			numTwo++;
			break;
		}
		
	}
	}
}
