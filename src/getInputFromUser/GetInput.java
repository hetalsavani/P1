package getInputFromUser;

import java.util.Scanner;

class GetInput
{	
	public static void main(String[] args) 
	{
		int no;
		Scanner obj=new Scanner(System.in);
			System.out.print("Enter a number :");
				no=obj.nextInt();
		System.out.print("Square is :"+(no*no));

	}

}
