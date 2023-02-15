class Baseball{
	// field instance field
	static int count = 10;
	//method instance method
	void increment(){
		count++;
	}
	void decrement() {
		
		count--;
	}
	void baseballInfo() {
		System.out.println("현재 개수  : " + count);
	}
}
public class VariableEx11 {

	public static void main(String[] args) {
		Baseball b1 = new Baseball();
		b1.increment();
		b1.baseballInfo();
		
		Baseball b2 = new Baseball();
		b2.increment();
		b2.baseballInfo();
	}

}
