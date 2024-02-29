class Parent{
	public Parent(){
		System.out.println("parent class created:'|");
	}
}
class Child extends Parent{
	public Child(){
		System.out.println("child class created:");
	}
}
public class InheritenceConstructor{

	public static void main(String args[]){
		Parent a2 = new Parent();
		System.out.println("");
		Child a1 = new Child();		
	}
	

}