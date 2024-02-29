/*class Test{
	int value;
	Test(int i){
		value =i;
	}
	Test increamentBy10(){
		Test temp = new Test(value+10);
		return temp;
	}
	void display(){
		System.out.println("the value is : "+value);
	}
}*/
class Test{
	int value;
	Test(int i){
		value =i;
	}
	Test increamentBy10(){
		Test temp = new Test(value+10);
		return temp;
		
	}
	void display(){
		System.out.println(value);
	}
	
}

class ReturningObject{
	public static void main(String args[]){
		Test b1 = new Test(2);
		b1.display();

		
		Test b2;
		b2 = b1.increamentBy10();
		b2.display();	
		
	}
	
}