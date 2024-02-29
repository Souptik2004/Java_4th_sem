class Sup{
	public void display2(){
		System.out.println("hello world");
	}
	
}
class Sub extends Sup{
	public void display(){
		System.out.println("wow world");
	}
}
class Sub2 extends Sub{
	public void display(){
		System.out.println("again wow");
	}
	
}
class MethodOverriding{
	public static void main(String args[]){
	Sub sb = new Sub();
	Sup su = new Sup();
	Sub2 sb2 = new Sub2();
	su.display2();
	sb.display();
	sb2.display();
	}
}