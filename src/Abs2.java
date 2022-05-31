
public class Abs2 extends Abs1{
	 public void  Loan() {
		 System.out.println("This is the implementation of the abstract method");
	 }
		public void getdata() {
		
		System.out.println("sbi loan");
		}
		public void data(){
		System.out.println("hdfc loan");	
		
	
		}
		
		public static void main(String[] args) {
			Abs2 B = new Abs2();
			B.getdata();
			B.data();
			B.Loan();
		}
	}


