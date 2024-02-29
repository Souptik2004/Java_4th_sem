//22053201 javaAssignment Q3

import java.util.*;

class Address{
	private String address;
	
	public void setaddress(String address){
		this.address = address;
	}
	public void getaddress(){
		System.out.println("Address :"+address);
	}
}

class Homeaddress extends Address{
	@Override
	public void getaddress(){
		//System.out.println("Address :"+address);
		super.getaddress();
	}
}
class Officeaddress extends Address{
	@Override
	public void getaddress(){
		super.getaddress();
	}
}

class JavaAssignmentQ3{
	public static void main(String args[]){
		Address home = new Homeaddress();
		Address office= new Officeaddress();
		
		home.setaddress("panskura , purbaMedinipur,WestBengal,721139");
		office.setaddress("bhubneswar,patia,kiit,751024");
		System.out.println("displaying the address :");
		home.getaddress();
		office.getaddress();
	}
}