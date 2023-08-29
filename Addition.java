import java.io.*;
import java.util.*;
public class Addition {
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first integer ");
	int i1 = sc.nextInt();
	System.out.println("Enter second integer ");
	int i2 = sc.nextInt();
	int i3 = i1+i2;
	System.out.println("Sum of "+i1+" and "+i2+" is "+i3);
}
}