// 22053201 java assignment1 Q3
import java.util.*;
import java.lang.*;
interface Calculate
{
	public void diagonal();
	public void area();
}
class RightAngledTriangle implements Calculate
{
	int base;
	int height;
	double area;
	double diagonal;
	RightAngledTriangle(int Ibase,int Iheight){
		base = Ibase;
		height = Iheight;
		
		area= 0.5*height*base;
		diagonal = Math.sqrt((base*base)+(height*height));
	}
	public void diagonal()
	{
		//diagonal = Math.sqrt((base*base)+(height*height));
		//System.out.println("RAT diagonal:"+diagonal);
	}
	public void area()
	{
		//area = 0.5*height*base;
		//System.out.println("RAT area:"+area);
	}
	public void display()
	{
		System.out.println("area of Triangle is :"+area);
		System.out.println("diagonal of the Triangle is :"+diagonal);	
	}
}
class Rectangle implements Calculate
{	
	int base;
	int height;
	double area;
	double diagonal;
	Rectangle(int Ibase,int Iheight){
		base = Ibase;
		height = Iheight;
		area = height * base;
		diagonal = Math.sqrt((base*base)+(height*height));
	}
	public void area()
	{
		//area = height * base;
		//System.out.println("REC Area:"+area);
	}
	public void diagonal()
	{
		//diagonal = Math.sqrt((base*base)+(height*height));
		//System.out.println("REC diagonal:"+diagonal);
	}
	public void display()
	{
		System.out.println("area of Rectangle is :"+area);
		System.out.println("diagonal of the Rectangle is :"+diagonal);
	}
}
class JavaAssignmentQ2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);	
	// we will create the rectangle first;
		System.out.println("enter the rectangle attributes:");
		System.out.println("enter the base of rectangle");
		int tempBase = sc.nextInt();
		System.out.println("enter the height of rectangle");
		int tempHeight = sc.nextInt();
		Calculate rectangle = new Rectangle(tempBase,tempHeight);
	//we will create the triangle object
		System.out.println("enter the triangle  attributes:");
		System.out.println("enter the base of triangle");
		tempBase = sc.nextInt();
		System.out.println("enter the height of triangle");
		tempHeight = sc.nextInt();			
		Calculate triangle = new RightAngledTriangle(tempBase,tempHeight);
		//now display function :
		((Rectangle)rectangle).display();
		((RightAngledTriangle)triangle).display();
		//rectangle.display();
		//triangle.display();
	}	
}