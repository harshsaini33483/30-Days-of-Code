import java.io.*;
import java.util.*;
class Solution{
	public static void main(String[] args)throws Exception {
		
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
		String f=in.readLine();
		while(f!=(null))
	{	


		
		String ar[]=f.split(" ");
		String st1=ar[0];
		String st2=ar[1];
		int matrix[][]=new int[st2.length()+1][st1.length()+1];
		for(int i=0;i<=st2.length();i++)
		{
			Arrays.fill(matrix[i],0);
		}

		String sub=lcs(st1,st2,matrix);

	//	System.out.println(sub);
		String finstring="";

		int i=0,j=0,l=0,k=0;
		while(i<st1.length() && j<sub.length())
		{

			//System.out.println(st1.charAt(l)+"    "+sub.charAt(j));
			if(st1.charAt(i)==sub.charAt(j))
			{
				while(l<st2.length())
				{

					
					if(st2.charAt(l)==sub.charAt(k))
					{
						finstring=finstring+st2.charAt(l);
						++l;
						++k;

				//System.out.println(finstring+" h");
						break;
					}
					else
					{
						finstring=finstring+st2.charAt(l);
						
				//System.out.println(finstring+" f");
						++l;
					}
				}
				++j;
				++i;
			}
			else
			{
				finstring=finstring+st1.charAt(i);
				//System.out.println(finstring+" e");
				++i;
			}
		}




			while(l<st2.length())
			{
				finstring=finstring+st2.charAt(l);
				++l;
			}

			while(i<st1.length())
			{
				finstring=finstring+st1.charAt(i);
				++i;

			}

		
			System.out.println(finstring);
			f=in.readLine();

	}


	}





	public static String lcs(String st1,String st2,int matrix[][])
	{
		String re="";

		/**/
		for(int i=0;i<st2.length();i++)
		{
			for(int j=0;j<st1.length();j++)
			{

				if(st1.charAt(j)==st2.charAt(i))
				{
					matrix[i+1][j+1]=matrix[i][j]+1;
				}
				else
				{
					matrix[i+1][j+1]=Math.max(matrix[i][j+1],matrix[i+1][j]);
				}
			}
		}


		

		int i=st2.length(),j=st1.length();
		while(i>0 && j>0)
		{
			//System.out.println(matrix[i][j]+"   "+Math.max(matrix[i-1][j],matrix[i][j-1])+"   "+i+"   "+j);
			if(matrix[i][j]>Math.max(matrix[i-1][j],matrix[i][j-1]))
			{

				re=st2.charAt(i-1)+re;
				
				--i;--j;

			}
			else if(matrix[i-1][j]>matrix[i][j-1])
			{
				--i;

			}
			else
			{
				--j;
			}
		}
		return re;
	}
}