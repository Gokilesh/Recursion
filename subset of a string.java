import java.util.*;

public class subset {
	public static String str = "";
	public static int n;
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		 n = in.nextInt();
		
		System.out.println("enter string");
		String  name = in.next();
		char array[] = new char[name.length()];
		array = name.toCharArray();
		int level = 0;
		subsetter(array,level,str);
	}
	static void subsetter(char[] array,int level,String str)
	{
		if(level == n)
		{	
			if(str == "")
			{
				System.out.println("{ }");
			}
			else
			{
				System.out.println('{'+str+'}');
			}
			return;
		}	
		subsetter(array,level+1,str);
		str = str+Character.toString(array[level]);
		subsetter(array,level+1,str);
	}
}
