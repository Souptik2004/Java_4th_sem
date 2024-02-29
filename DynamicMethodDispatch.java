class Superclass{
	void meth1(){
		System.out.println("hello 1 ");
	}
	void meth2(){
		System.out.println("superClass meth2");
	}
}
class Subclass extends Superclass{
	void meth2(){
		System.out.println("Subclass meth2");
	}
	void meth3(){
		System.out.println("meth 3");
	}
}
class DynamicMethodDispatch{
	public static void main(String args[]){		
		Superclass s = new Subclass();
		s.meth2();
		//s.meth3();
		s.meth1();
	}
}