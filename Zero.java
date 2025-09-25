package Class;
class Zeromain {
	void result(int num1,int num2) {
		try {
			int s=num1/num2;
			System.out.println("result:"+s);
		}
		catch(ArithmeticException e) {
			System.out.println("Exceptional handled");
		}
	}	
}
public class Zero {
	public static void main(String[] arg) {
		Zeromain z=new Zeromain();
		System.out.println("GOKUL RAM R");
		System.out.println("2117240070090");
		z.result(10,2);
		z.result(20,0);
		z.result(-5,5);
		z.result(0,3);
		z.result(100,-10);
		
	}
}
