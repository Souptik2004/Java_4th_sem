class Super{
	Super(){
		System.out.println("Super Constructor");
	}
	void meth1(){
		System.out.println("Meth1 of super");
	}
	abstract public void meth2();
}
class Sub extends Super{
	@Override
	
	public void meth2(){
		
	}
	
}
public class AbstractExample{
	public static void main(String args[]){
		Super s = new Super();
		s.meth1();
	}
}