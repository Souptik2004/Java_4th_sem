class A{
	int i;
	int j;
	void display(){
		System.out.println(i);
		System.out.println(j);
	}
	
}
class B extends A{
	int k;
	void display(){
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);	
	}
	
}
class SuperSubClass{
	public static void main(String args[]){
		A superob = new A();
		B subob=new B();
	
		superob.i = 10;
		superob.j = 20;
		System.out.println(superob.i +" & "+ superob.j);
		
		subob.j = 30;
		subob.i = 40;
		subob.k = 50;
		
		System.out.println( subob.i+" "+subob.j+" "+subob.k);
	}
	

}