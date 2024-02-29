/*interface Test
{
	void meth1();
	void meth2();
	
}
class My implements Test
{
	public void meth1()
	{
		System.out.println("meth1 of class My");
	}
	public void meth2()
	{
		System.out.println("meth2 of class MY");
		
	}
	
	
}
class You implements Test	{
	public void meth1()
	{
		System.out.println("meth1 of class You");
	}
	public void meth2()
	{
		System.out.println("meth2 of class MY");
		
	}
	public void meth3()
	{
		System.out.println("meth3 of class My");
	}
}

class InterfacePractice
{
	public static void main(String args[])
	{	
		Test t2 = new You();
		
		Test t = new My();
		t.meth2();
		t2.meth1();
		//t2.meth3();
	}
}
*/

interface Man
{
	public void name();
	public void age();
	public void branch();
}

class Souptik implements Man
{
	public void name(){
		System.out.println("soutpik");
	}
	public void age()
	{
		System.out.println("18");
	}
	public void branch()
	{
		System.out.println("CSE");
		
	}
}

class Karan implements Man
{
	public void name(){
		System.out.println("Karan");
	}
	public void age()
	{
		System.out.println("19");
	}
	public void branch()
	{
		System.out.println("CSSE");
		
	}
}
class Roni implements Man
{
	public void name(){
		System.out.println("Roni");
	}
	public void age()
	{
		System.out.println("20");
	}
	public void branch()
	{
		System.out.println("ECE");
		
	}
}

class InterfacePractice
{
	public static void main(String args[])
	{
		Man m1 = new Souptik();
		Man m2 = new Karan();
		Man m3 = new Roni();
		
		m1.name();
		m1.age();
		m1.branch();
		
		m2.name();
		m3.name();
		
		m2.branch();	
	}
	
	
}