
public class Abs3 extends Abs2{
	
	void Loan1() {
		System.out.println("This is override method");
	}
	
	void ab() {
		super.Loan();
		Loan1();
		
	}
public static void main(String[] args) {

	Abs2 A = new Abs2();
	A.Loan();
	A.getdata();
	A.data();
Abs3 B = new Abs3();
B.ab();

	}

}
