import java.util.*;

public class subset_sum {
	
	public static int n;
	public static int target;
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number of element");
		 n = in.nextInt();

		System.out.println("enter elements");
		int array[] = new int[n];
		
		for(int t=0;t<n;t++)
			array[t] = in.nextInt();
		
		int[]  result = new int[n];
		int level = 0;
		int sum=0;
		
		System.out.println("enter the target sum");
		target = in.nextInt();
		
		subsetter(array,level,0,result,sum);
	}
	static void subsetter(int[] array,int level,int i,int result[],int sum)
	{
		if(level == n)
		{
			return;
		}
		
		subsetter(array,level+1,i,result,sum);
		
		if(i==0)
		{
			result[i] = array[level];
			sum = result[i];
		}
		else
		{
			result[i] = result[i-1] + array[level];
			sum = result[i];
		}
		
		if(sum == target)
		{
			System.out.println();
			
			for(int t=i;t>=1;t--)
					System.out.print(result[t]-result[t-1]+" ");
			System.out.print(result[0]+" ");
			System.out.print('=' +" "+sum);
		}
		
		if(sum > target)
		{
			return;
		}
		
		subsetter(array,level+1,i+1,result,sum);
		
	}
}
