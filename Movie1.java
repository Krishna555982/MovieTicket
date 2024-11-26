import java.util.Scanner;
class  Movie1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:-");
		int age=sc.nextInt();
		System.out.println("Enter day:-");
		String day=sc.next();
		if (age <= 18 )
		{
			System.out.println("hey you are child");
			if( day.equals("Saturday") || day.equals("saturday")|| day.equals("SATURDAY") || day.equals("SUNDAY") || day.equals("Sunday") || day.equals("sunday"))
			{
				System.out.println("your fare is 200");
			}
			else
			{
				System.out.println("your fare is 150");
			}
		}
		else if ( age>18 && age <=60)
		{
			System.out.println("hey you are young man");
			if( day.equals("Saturday") || day.equals("saturday")|| day.equals("SATURDAY") || day.equals("SUNDAY") || day.equals("Sunday") || day.equals("sunday"))
			{
				System.out.println("your fare is 250");
			}
			else
			{
				System.out.println("your fare is 200");
			}
		}
		else if ( age >=61)
		{
			System.out.println("hey you are Senior citizen");
			if( day.equals("Saturday") || day.equals("saturday")|| day.equals("SATURDAY") || day.equals("SUNDAY") || day.equals("Sunday") || day.equals("sunday"))
			{
				System.out.println("your fare is 300");
			}
			else
			{
				System.out.println("your fare is 250");
			}
		}
		else
		{
			System.out.println("enter proper age");
		}
	}
}
