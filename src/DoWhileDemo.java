
import java.util.Scanner;
public class DoWhileDemo 
{
	public static void main(String args[])
	{
		int n1,n2,ans;
		String choice;
		Scanner s1=new Scanner(System.in);
		do
		{
			System.out.print("Please enter fist number:");
			n1=s1.nextInt();

			System.out.print("Please enter second number:");
			n2=s1.nextInt();

			ans=n1+n2;

			System.out.print("Sum of two numbers is:"+ans);
			System.out.print("\nDo want to add other numbers..?Yes or No");
			choice=s1.next();
			
		}while(choice.equalsIgnoreCase("Yes")||choice.equalsIgnoreCase("Y"));
		s1.close();
		if(choice.equalsIgnoreCase("No")||choice.equalsIgnoreCase("N"))
		{
			System.out.println("Program will end...");
		}
		else
		{
			System.out.println("Your choice is wrong...\nProgram will end...");
		}
	}
}

