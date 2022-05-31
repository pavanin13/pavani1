
public class Ab2 extends Ab1{
	
	public void msg() {
	System.out.println("loan enterd");
	
	}
	
	
	public void msg1() {
		System.out.println("amount enterd");
	}

	void p() {
		super.msg1();
	}
	
		
		public void msg2() {
			System.out.println("amount display");
		}
		
		
		
	public static void main(String[] args) {
		Ab2 c =new Ab2();
		c.msg();
c.msg1();
c.msg2();
c.msg5();
c.p();

	}
}

