/*
 * 안쪽은 1번 실행 할때 0또는 for 3번 안쪽은 9번 사선으로 1로 만들기 나머지 1
 * 배열을 나오는 코드를 알기 위해
 */
public class NestedLoopQuiz03 {
	public static void main(String[] args) {
		
		outer:
			for(int i=0; i<3; i++) {
				
				for(int j=0; j<2; j++) {
					System.out.print('0');
					
					System.out.print('1');
					
//				if(j == 3)
//					break outer;
//					
					
					
				}			
				System.out.println("");
				}
		}
}
