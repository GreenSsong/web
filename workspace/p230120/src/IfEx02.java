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



public class IfEx02 {
	public static void main(String[] args) {

		int num = 5;
		//조건문 시작
		if(num >= 5) {
			System.out.println("true 일 때, 실행 되는 영역");
			num = num + 1;
			
		} else {
			System.out.println("false 일 때, 실행 되는 영역");
			num *=2;
			
		}
		
		System.out.println("num >> " + num);
		
		
		
		
		
		
		
		
		
		
	}

}
