import java.util.*;

class Box{
	int width;
	int height;
	int length;
	
	void volume(){
		int volume = width*height*length;
		System.out.println(volume);
	}
	void setAttribute(int w,int h,int l){
		height = h;
		width  = w;
		length = l;
	}
}
class BoxDemo2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Box mybox = new Box();
		System.out.println("enter the values of width , height and length:");
		int w = sc.nextInt();
		int h = sc.nextInt();
		int l = sc.nextInt();
		mybox.setAttribute(w,h,l);
		mybox.volume();
	}
}