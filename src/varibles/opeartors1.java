package varibles;
public class opeartors1 {
public static void main(String[] args) {
	int a=20;  
	int b=5;  
	System.out.println(a+b);
	System.out.println(a-b);  
	System.out.println(a*b);  
	System.out.println(a/b);  
	System.out.println(a%b);

	System.out.println(10*10/5+3-1*4/2);

	//Left Shift Operator
	System.out.println(10<<3);//10*(2*2*2=8) --3 times = 80
	System.out.println(40<<4);//40*2^4=40*16=640

	//Right Shift Operator
	System.out.println(20>>3);//20/(2*2*2=8)  =20/8=2
	System.out.println(20>>2);//20/(2*2=4)    =20/4=5
	System.out.println(20>>>2);//  20/(2*2=4)    =20/4=5
	System.out.println(-20>>>2);//-20/(2^2=4) -20/4=-5

	}

}


