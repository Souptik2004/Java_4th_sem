class overloadDemo{
	
	void test(){
		System.out.println("no parameter");
	}
	void test(int a){
		System.out.println("1 parameter:"+a);
	}
	void test(int a , int b){
		System.out.println("2 parameter :"+a+","+b);
	}
	
}
class MethodOverloader{
	public static void main(String args[]){
		overloadDemo ob = new overloadDemo();
		ob.test();
		ob.test(2);
		ob.test(4,5);
		
	}
}