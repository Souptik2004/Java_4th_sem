class Box{
	int width;
	int height;
	int length;
	
	void volume() {
		int volume = width*height*length;
		System.out.println(volume);
	}
	void values(){
		System.out.println("height is: "+height);
		System.out.println("width is: "+width);
		System.out.println("length is: "+length);
	}
	int returnVolume(){
			return width*height*length;
	}

}
class Method{
	public static void main(String args[]){
		Box mybox1 = new Box();
		mybox1.length = 10;
		mybox1.height = 20;
		mybox1.width = 30;
	
		//int volume = mybox1.length*mybox1.height*mybox1.width;
		//System.out.println(volume);
		
		mybox1.values();
		mybox1.volume();
		int volume = mybox1.returnVolume();
		System.out.println("the volumr in return method is "+volume);
		
	}
	
	
}