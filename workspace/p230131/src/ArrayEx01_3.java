
public class ArrayEx01_3 {
	public static void main(String[]arg) {
		int[] arr = new int[6];
		System.out.println(arr);
		
		int[][] arr2 = new int[2][3];
		System.out.println(arr2);
		
		arr2[0][0] = 4;
		arr2[0][1] = 8;
		arr2[0][2] = 12;
		arr2[1][0] = 24;
		arr2[1][1] = 36;
		arr2[1][2] = 48;
		
			for(int i=0; i < arr2.length; i++) {
				for(int j=0; j<arr2[i].length; j++) {
					System.out.println();
					System.out.print(" " + arr2[i][j]);
				}
				
				
				System.out.println("행 길이 arr2.length :" + arr2.length);
				System.out.println("arr2[0].length :" + arr2[0].length);
				System.out.println("arr2[1].length :" + arr2[1].length);
				System.out.println("arr2 : " + arr2);
				System.out.println("'행의 정보' 첫 번째 1차원 배열의 주소 : arr2[0] <행의 정보> :" + arr2[0]);
				System.out.println("'행의 정보' 두 번째 1차원 배열의 주소 : arr2[0][0] <행의 정보> :" + arr2[0][0]);
				
				System.out.println("향상된 for문");
				for(int[] ar : arr2) {
					for(int s : ar) {
						System.out.print(s);
					}
				}
			}
	}
}
