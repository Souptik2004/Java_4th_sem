//22053201 javaAssignment Q1

import java.util.*;

class Time{
	int hour ;
	int minute;
	int second;
	
	public Time(){
		hour   = 0;
		minute = 0;
		second = 0;
	}
	public Time(int mhour){
		hour = mhour;
		minute =0;
		second =0;
	}
	public Time(int mhour , int mminute){
		hour = mhour;
		minute = mminute;
		second=0;
	}
	public Time(int mhour , int mminute,int msecond){
		hour = mhour;
		minute = mminute;
		second=msecond;
	}
	public void display(){
		System.out.printf("%d hour %d minute %d second\n",hour,minute,second);
	}
	
}
class JavaAssignmentQ1{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		//first time with only hour 
		System.out.println("enter the hour for time1");
		int hour1=sc.nextInt();
		Time time1 = new Time(hour1);
		
		//second time with hour and minute
		System.out.println("enter the hour and minute of the second time :");
		int hour2=sc.nextInt();
		int minute2=sc.nextInt();
		Time time2 = new Time(hour2,minute2);
		
		//third and final time with all the attribute , hour , minute and second.
		System.out.println("enter the hour ,minute , and second for the third time");
		int hour3 = sc.nextInt();
		int minute3 = sc.nextInt();
		int second3 = sc.nextInt();
		Time time3 = new Time(hour3,minute3,second3);
		
		
		// now we will display the time , as we created already all the objects of the respective time 
		time1.display();
		time2.display();
		time3.display();
	}
}