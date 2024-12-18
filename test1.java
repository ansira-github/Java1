
class MyPackage{
	public void display() {
		System.out.println("This msg is from MyPackage class within pkg2");
	}
}
public class test1 {

	public static void main(String[] args) {
		System.out.println("Package");
		MyPackage mypack1=new MyPackage();
		MyPackage mypack2=new MyPackage();
		MyPackage mypack3=new MyPackage();
		mypack1.display();
		mypack2.display();
		mypack3.display();
	}
}