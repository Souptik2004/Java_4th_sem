class Box{
	int height;
	int width;
	int length;
	
	Box(){
		height = 0;
		width = 0;
		length = 0;
	}
	Box(int a){
		height = a;
		width = a;
		length = a;
		
	}
	Box(int h,int w,int l){
		height = h;
		width = w;
		length = l;
	}
	void display(){
		System.out.println(height);
		System.out.println(length);
		System.out.println(width);
		
		
	}
}
class OverloadingConstructors{
	public static void main(String args[]){
		Box b1 = new Box();
		Box b2 = new Box(10);
		Box b3 = new Box(10,15,20);
		
		b1.display();
		b2.display();
		b3.display();
		
	}
	
}