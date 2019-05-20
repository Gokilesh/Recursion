public class list
{	
		public static int row= 4;
		public static int col= 4;
		public static int len= 4;
	public static void main(String args[])
	{
		char matrix[][] = {{'t', 'e', 's', 't'}, 
                {'l', 'm', 'n', 'e'}, 
                {'o', 'p', 'q', 's'},
                {'r', 's', 'u', 't'}
                };
		char str[] = {'t','e','s','t'};
		int array1[] = {-1, -1, -1,  0, 0,  1, 1, 1}; 
		int array2[] = {-1,  0,  1, -1, 1, -1, 0, 1}; 
		int t=1;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
					if(matrix[i][j] == str[0])
					{	String result = "";
						find(matrix,str,result,i,j,t,array2,array1);
					}					
			}
		}
		return;
	}
	public static void find(char matrix[][],char str[],String result,int i,int j,int t,int array2[],int array1[])
	{result = result +" "+'('+Integer.toString(i)+" "+Integer.toString(j)+')';
		if(t==len)
		{
			System.out.println(result);
			return;
		}
		for(int x=0;x<8;x++)
		{
			if(ischeck(matrix,str,i+array1[x],j+array2[x],t))
			{			
				find(matrix,str,result,i+array1[x],j+array2[x],t+1,array2,array1);
			}
		}
		return;
	}
	public static boolean ischeck(char matrix[][],char str[],int i,int j,int t)
	{
		if((i>=0)&&(i<row)&&(j>=0)&&(j<col)&&(t<len))
		{
			if(matrix[i][j]==str[t])
				return true;
			else
				return false;
		}
		else
		{
			return false;
		}	
	}
}
