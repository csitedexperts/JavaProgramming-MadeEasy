package chapter02;
/* J02_03.java   */
/* A Command Line Argumented Program */

public class J02_03{

	public static void main (String[] args )
	{	
		int i, c;
		String s;
		c = args.length;
		System.out.println("Number of arguments is : " +c);
		for (i =0; i<args.length; i++)
		{
			s = args[i];
			System.out.println("Arg["+i+"] is : " + s);
		}

	}
}

