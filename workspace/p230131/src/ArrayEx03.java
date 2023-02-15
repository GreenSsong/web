
public class ArrayEx03 {

	public static void main(String[] args) {

	//2차원 배열 생성중 
	//열 길이 생략 O
	//행 길이 생략 X
	int[][] arr2 = new int[6][];
//	String[][] arr3 = new String["Jack"]["Calbin"];
	System.out.println("what about arr2 : " + arr2[0]);
	System.out.println("what about arr2 : " + arr2[1]);
	
	//열 넣기
	arr2[0] = new int[2];
	//초기화
	arr2[1] = new int[] {8, 10, 12};
	
	for(int[] ar: arr2) {
		for(int a: ar)
			System.out.println(" " + a);
		
		System.out.println();
	}
	}

}
