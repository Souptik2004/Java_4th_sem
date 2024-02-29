import java.util.*;

class Factorial{
	int result;
	int fact(int i){
		int number = i;
		if(number==1 || number==0){
			result =1;
		}
		else{
			result = number* fact(number -1);
		}
		return result ;
	}
	void display(int i){
		System.out.println("the factorial is :"+fact(i));
	}
}
class FactorialDemo{
	public static void main(String args[]){
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		number = sc.nextInt();
		Factorial f = new Factorial();
		f.display(number);
	}
	
	
}