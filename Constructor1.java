class Box{
	int width;
	int height;
	int length;
	
	Box(){
		width = 10;
		height = 10;
		length = 10;
	}
	void setAttribute(int w, int h , int l){
		this.width = w;
		this.height = h;
		this.length = l;
	}
}
class Constructor1{
	public static void main(String args[]){
		Box b1 = new Box();
		System.out.println(b1.width);
		System.out.println(b1.height);
		System.out.println(b1.length);
		
		System.out.println("after the modifier");
		b1.setAttribute(2,3,4);
		
		System.out.println(b1.width);
		System.out.println(b1.height);
		System.out.println(b1.length);
	}
	
}