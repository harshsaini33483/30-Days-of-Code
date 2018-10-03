import java.io.*;
import java.util.*;
class Solution{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
				int left[]=new int[26];
				int right[]=new int[26];
		while(--t>=0)
		{
			
			String str=sc.next();
			int n=str.length();
			if(str.length()%2==0)
			{
				boolean ok=false;
				Arrays.fill(left,0);
				Arrays.fill(right,0);
				for(int i=0;i<n/2;i++)
				{
					++left[str.charAt(i)-97];
				}
				for(int i=n/2;i<n;i++)
				{
					++right[str.charAt(i)-97];
				}
				for(int i=0;i<26;i++)
				{
					if(left[i]!=right[i])
					{
						ok=true;
						break;
					}
				}
				if(ok)
				{
					System.out.println("NO");
				}
				else
				{
					System.out.println("YES");
				}
		
			}



			else
			{
				boolean ok=false;
				Arrays.fill(left,0);
				Arrays.fill(right,0);
				for(int i=0;i<n/2;i++)
				{
					++left[str.charAt(i)-97];
				}
				for(int i=n/2+1;i<n;i++)
				{
					++right[str.charAt(i)-97];
				}
				for(int i=0;i<26;i++)
				{
					if(left[i]!=right[i])
					{
						ok=true;
						break;
					}
				}
				if(ok)
				{
					System.out.println("NO");
				}
				else
				{
					System.out.println("YES");
				}
		
			}
		}
	
	}
}
