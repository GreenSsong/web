
public class WhileQuiz03 {

	public static void main(String[] args) {

		
		// 1부터 10까지 합을 구하시오 while를 사용하여 숫자 합
		//변수 선언
		int idx=1 , sum=0;

		while(idx < 11) {
			sum += idx; 
			idx++;
			System.out.println("현재 : " + idx + " 까지" + "\n누적합 " + sum);
		}
			System.out.println("1부터 10까지의 누적 합계:" + sum);		
		}
}
