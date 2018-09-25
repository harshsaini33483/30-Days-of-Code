import java.io.*;
import java.util.*;
class Solution{
	static boolean ok=false;
	static int dx[]={-1,1,0,0};
	static int dy[]={0,0,1,-1};
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int spike=sc.nextInt();
		char array[][]=new char[row][col];
		int offx=0,offy=0;
		for(int i=0;i<row;i++)
		{
			String st=sc.next();
			for(int j=0;j<st.length();j++)
			{
				array[i][j]=st.charAt(j);
				if(array[i][j]=='@')
				{
					offx=i;
					offy=j;
				}
			}
		}
		array[offx][offy]='#';
		backTrack(offx,offy,array,spike);
		if(ok)
		{
			System.out.println("SUCCESS");
		}
		else
		{
			System.out.println("IMPOSSIBLE");
		}
	}
	public static void backTrack(int offx,int offy,char array[][],int spike)
	{


		//	System.out.println(offx+"  "+offy+"  "+spike+"  "+array[offx][offy]);
		for(int i=0;i<dx.length;i++)
		{
			int x=offx+dx[i];
			int y=offy+dy[i];

			if(x>=0 && x<array[0].length&& y>=0 && y<array[0].length && spike>=0 && array[x][y]!='#' )
			{


				if(array[x][y]=='x' && spike>=0)
				{
					ok=true;
					return;
				}

				if(array[x][y]=='s')
				{

					spike-=2;
				}
				array[x][y]='#';
				backTrack(x,y,array,spike);
				array[x][y]='.';
			}
		}
	}
}