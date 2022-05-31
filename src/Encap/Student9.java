package Encap;
public class Student9 extends Student8{
	public void setbookName(String name) {
		bookName=name;
	}
	public String getbookName() {
		return bookName;
	}
void s() {
	super.setbookName();
}
public static void main(String[] args) {
Student8 stu=new Student8();
Student9 a =new Student9();
stu.s("maths");
stu.setbookId(18);
stu.setbookSeq(3);
a.setbookName("topic");
System.out.println("bookName"+ stu.getbookName());
System.out.println("bookId"+ stu.getbookId());
System.out.println("bookSeq" + stu.getbookSeq());


stu.setbookName("novel");
stu.setbookId(15);
stu.setbookSeq(9);
System.out.println("bookName"+ stu.getbookName());
System.out.println("bookId"+ stu.getbookId());
System.out.println("bookSeq" + stu.getbookSeq());

stu.setbookName("pavani");
System.out.println("bookname" +stu.getbookName());
}
}	


