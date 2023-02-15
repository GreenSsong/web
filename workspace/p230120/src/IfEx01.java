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
 * if(조건식1) {
 * 	조건식1이 true일 때, 실행되는 영역
 * } else if(조건식2) {
 * 	조건식2가 ture일 때, 실행되는 영역
 * } else {
 * 	위 조건을 만족하지 않는, 나머지 모두
 * }
 */



public class IfEx01 {
	public static void main(String[] args) {

		int num = 5;
		
		if(num >= 5) {
			num = num + 1;
		}
		
		System.out.println("num >> " + num);
		
		
		
		
		
		
		
		
		
		
	}

}
