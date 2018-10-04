import java.io.*;
import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(--t>=0)
		{
			String str=sc.next();
			int count=0;
			int max=0;
			int prev=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='>')
				{
						--t;
						if(t==0)
						{
							if(max>i+1)
							{
								max=i+1;
							}
							else if(t<0)
								{break;}
						}
				}

				else if(str.charAt(i)=='<')
				{
					++t;
				}
			
			
			
		}
		System.out.println(max);
	}}
}