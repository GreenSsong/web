//각자 자기 변수를 사용하여 사용한다. 
//이름은 같으나 다른 변수를 사용된다.
public class InstanceEx04_1 {

	public static void increment(int num) {
		System.out.println("increment 증가전 " + num);
		num++;
		System.out.println("increment 증가후 " + num);
	}
	
	public static void main(String[] args) {

		int num = 5;
		System.out.println("메서드 호출전 :" + num);
		
		increment(num);
		System.out.println("메서드 호출후 :" + num);
		
		
	}

}
