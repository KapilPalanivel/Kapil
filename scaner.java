package scanner;

import java.util.Scanner;
 
public class scaner 
{

	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String tc="";
		int a=0;
		while (a<=5)
		{
			System.out.print("Enter Your Qualification:");
			tc=sa.nextLine();
			switch(tc)
			{
			case"java":case"c":case"oracle":
				System.out.println("You Have Software Developer Job Vacant In Our Company");
				break;
			case"python":
				System.out.println("Sorry! We Don't Have Any Vacancies Right Now");
				break;
			}
			System.out.print("Do You Want To Continue:");
			String op=sa.nextLine();
			if(op.equals("no"))
			{
				break;
			}
		}
	}
}