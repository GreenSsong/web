/*
 * 랜덤 값 범위 
 * - 0 <= 랜덤값 < 1 
 * 0 이상 1 미만 사이의 실수인 랜덤 값
 * 
 */
public class RandomEx01 {

	public static void main(String[] args) {
 // System.out.println((int)(Math.random()*3)+ 1);
		
			// 랜덤값 : 1~100
			int random = ((int)(Math.random()*100) +1);
			System.out.println("1 ~ 100 랜덤 값 >> " + random);
			
	}

}
