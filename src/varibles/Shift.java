package varibles;
public class Shift {
public static void main(String[] args) {
	System.out.println(10*10/5+3-1*4/2);
	// left shift operator
	System.out.println(10<<3);//10*(2*2*2=8) 10*8=80
	System.out.println(40<<4);
	//right shift operator
	System.out.println(20>>3);//20/(2*2*2=8)=20/8=2
	System.out.println(20>>2);
	System.out.println(20>>>2); //postive >>> accepted value
	System.out.println(-20>>>2);//-20/(2*2)=1073.......//negative>>>shifts doesnot accept value 
//accept address

}
}
