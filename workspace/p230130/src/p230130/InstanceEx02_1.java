package p230130;
//멤버 메서드

//setter/getter : alt Shift s r
//
class Robot{
	int productYear;
		String productName;
		public int getProductYear() {
			return productYear;
		}
		public void setProductYear(int productYear) {
			this.productYear = productYear;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
	
	
}
public class InstanceEx02_1 {

	
	
	public static void main(String[] args) {
		
		Robot r1 = new Robot();
		r1.setProductYear(2017);
		r1.setProductName("Emily");
		
		System.out.println(r1.getProductName());
		System.out.println(r1.getProductYear());
		
		// 두번째 로봇 (여기만 사용되는 객체)
		new Robot().setProductYear(2032);
		
		//세번째 로봇 객체
		Robot r3 = r1;
		System.out.println(r3.getProductName());
		
		Robot r4 = new Robot();
		
		r4.setProductName("Ralf");
		r4.setProductYear(2077);
		System.out.println(r4.getProductName());
		
	}

}
