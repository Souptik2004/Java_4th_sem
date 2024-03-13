class Box{
	int width;
	int height;
	int length;
}
class BoxDemo{
	public static void main(String args[]){
		Box mybox1 = new Box();
		mybox1.length = 10;
		mybox1.height = 20;
		mybox1.width = 30;
	
		int volume = mybox1.length*mybox1.height*mybox1.width;
		System.out.println(volume);
	}
//hello world
	
	
}