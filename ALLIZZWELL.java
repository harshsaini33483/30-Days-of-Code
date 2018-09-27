import java.io.*;
import java.util.*;
class Solution{
	static char AIW[]={'A','L','L','I','Z','Z','W','E','L','L'};
	static int rdir[]={-1,-1,-1,0,1,1,1,0};
	static int cdir[]={-1,0,1,1,1,0,-1,-1};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(--t>=0)
		{
			int r=sc.nextInt();
			int c=sc.nextInt();
			ArrayList<Structure>ar=new ArrayList<Structure>();
			char array[][]=new char[r][c];
			for(int i=0;i<r;i++)
				{
					String s=sc.next();
					for(int j=0;j<c;j++)
					{
						array[i][j]=s.charAt(j);
						if(array[i][j]=='A')
						{
							Structure si=new Structure();
							si.r=i;si.c=j;
							ar.add(si);
						}
					}
				}

				if(ar.size()==0)
				{

					System.out.println("NO");
				}

			else
				{	

					boolean ok=false;
					String finalString="A";
					for(int i=0;i<ar.size();i++)
						{
							Structure a=ar.get(i);
							int iindex=a.r;
							int jindex=a.c;
							array[iindex][jindex]='#';
							if(dfsCharSearch(array,iindex,jindex,1,r,c,finalString))
							{
								ok=true;
								break;
							}
						}

						if(ok)
						{
							System.out.println("YES");
						}
						else
						{
							System.out.println("NO");
						}
				}
	}



	}


	public static boolean dfsCharSearch(char array[][],int r,int c,int index,int row,int col,String finalString)
	{
		boolean ok=false;
		if(index>=AIW.length)
		{
			//System.out.println(finalString);
			ok=true;
			return true;
		}

		for(int i=0;i<8;i++)
		{
			int ir=r+rdir[i];
			int ic=c+cdir[i];

			if(ir>=0 && ir<row && ic>=0 && ic<col && index<AIW.length)
			{
				if(array[ir][ic]==AIW[index])
				{
					array[ir][ic]='#';
					finalString+=AIW[index];
				//	System.out.println(AIW[index]+"  "+index+"  "+finalString);
					if(dfsCharSearch(array,ir,ic,index+1,row,col,finalString))
						{ok=true;break;}
					array[ir][ic]=AIW[index];
				}
				
			}

		}
		return ok;
	}


	static class Structure{
		int r,c;
	}
}