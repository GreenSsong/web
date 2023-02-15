/*
 * 조건문 "if"
 *	if(조건식 only true/false) 
 *
 * == 조건 1개	
 * if(조건식) { 
 *  	//조건이 ture일 때, 실행 되는 영역
 *  	명령어;
 * }
 * 
 * == 조건 2개
 * 	 if(조건식) {
 *  //조건이 ture일 때, 실행 되는 영역
 *  	명령어;
 * } else {
 * 		//조건이 false 일 때, 실행되는 영역
 * 		명령어;
 * }
 * 
 * == 조건 3개
 * 
 * 
 *  
 *  
 */



public class IfEx03 {
	public static void main(String[] args) {

		int num = 11;
		
		if(num >= 5) {
			System.out.println("num이 5보다 크다.");
		} else if(num < 5) {
			System.out.println("num이 5보다 작다.");
		} else {
			System.out.println("num이 5와 같다.");
		}
			
			
			
		System.out.println("num >> " + num);
		
		
		
		
		
		
		
		
		
		
	}

}
