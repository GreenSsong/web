class Person{
	int age;
	String name;
	String address;
	
	void setAge(int v) {
		age = v;
	}
	void setName(String n) {
		name = n;
	}
	int getAge() {
		return age = 11;
	}
	String getName() {
		return name;
	}
}
public class TestInstence01 {

	public static void main(String[] args) {

		Person p1;
		p1 = new Person();
		
		p1.setAge(131);
		p1.setName("홍홍홍");
		System.out.println("나이 >>" + p1.getAge());
		System.out.println("이름 >>" + p1.getName());
	}

}
