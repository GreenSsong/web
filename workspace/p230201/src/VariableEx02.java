class Item{
	int year;
	String name;
	final String company;
	
	public Item(int year, String name, String company) {
		this.year = year;
		this.name = name;
		this.company = company;
	}
	void setCompany(String company) {
	}
	void showInfo() {
		System.out.println("생산년도  :" +this.year);
		System.out.println("제품  :" +this.name);
		System.out.println("제조회사  :" +this.company);
}

public class VariableEx02 {

	public static void main(String[] args) {

		Item item = new Item(2222, "라이언", "이마트");
		Item itemTwo = new Item(2222, "라이언", "이마트");
//		item.setCompany("하이마트");
		
		
	}
}
}
