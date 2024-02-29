/*class Test{
	public int a;
	private int c;
	void setc(int i){
		c = i;
	}
	int getc(){
		return c;
	}
}
class AccessControl{
	public static void main(String args[]){
		Test t1 = new Test();
		t1.a = 10;
		t1.setc(20);
		System.out.println(t1.a);
		int getc = t1.getc();
		System.out.println(getc);
		
	}
	
}*/
import java.util.*;
class Test{
	public int a;
	private int b;
	
	void setb(int n){
		b = n;
	}
	int getb(){
		return b;
	}

}
class AccessControl{
	public static void main(String args[]){
		Test t1 = new Test();
		t1.setb(100);
		int number = t1.getb();
		System.out.println(number);
		
	}
	
}