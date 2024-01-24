package gradest;
import java.util.*;

public class Gradecalculator {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Grade of calculator");
		System.out.println("enter name of student");
		String name = sc.nextLine();
		
		System.out.println("Enter the no of subjects");
		int sub = sc.nextInt();
		
		
		if(sub <=0)
		{
			System.out.println("Please enter a valid no of subjects");
		}
		double totalmarks = 0;
		final int maxmarks = 100;
		for(int  i = 1;i<=sub;i++)
		{
			System.out.print("Enter mark obtained in subject"+i +"(out of 100)");
			int mark = sc.nextInt();
			totalmarks += mark;
		}
		double avgpercent  =  totalmarks / (maxmarks * sub)*100;
		char grade;
		
		if(avgpercent >=90)
		{
			grade  = 'A';
		}
		else if (avgpercent >=80)
		{
			grade = 'B';
			
		}
		
		else if (avgpercent >=70)
		{
			grade = 'C';
		}
		else if (avgpercent >=60)
		{
			grade = 'D';
		}
		else if (avgpercent >=35)
		{
			grade  = 'E';
		}
		else { 
			grade = 'F';
	
		}
	System.out.println("final result of "+name+" is:");
	System.out.println("total scored the marks"  +totalmarks+"");
	System.out.println("average percentage gained"  +avgpercent+"%");
	System.out.println("grade"  +grade);
	
  
}
}
