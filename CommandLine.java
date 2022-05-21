import java.lang.*;

class CommandLine
{
	public static void main(String args[])
	{
		System.out.println("First number is : "+(args[0]+1));
		System.out.println("First number is : "+args[1]);
		
		int iAns=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
	
		System.out.println("Addition is :"+iAns);
	}
	
}