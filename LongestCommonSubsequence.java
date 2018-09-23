import java.io.*;
import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int matrix[][]=new int[a.length()+1][b.length()+1];
		for(int i=0;i<a.length();i++){Arrays.fill(matrix[i],0);}
		for(int i=1;i<=a.length();i++)
		{
			for(int j=1;j<=b.length();j++)
			{
				if(a.charAt(i-1)==b.charAt(j-1))
				{
					matrix[i][j]=matrix[i-1][j-1]+1;
				}
				else {
					matrix[i][j]=Math.max(matrix[i-1][j],matrix[i][j-1]);
				}
				//System.out.print(matrix[i][j]+" ");
			}
		//	System.out.println();
		}





		int i=a.length();
		int j=b.length();
		ArrayList<Integer>ar=new ArrayList<Integer>();
		
		while(i>0 && j>0)
		{
			//System.out.print(matrix[i][j]+"  " +matrix[i-1][j]+"  "+matrix[i][j-1]);
			
			if(matrix[i][j]>matrix[i-1][j] && matrix[i][j]>matrix[i][j-1])
			{
			//System.out.println(" Diagonal");
				ar.add(0,(int)a.charAt(i-1)-48);
				--i;
				--j;
			}
			else if(matrix[i-1][j]>=matrix[i][j])
			{--i;//System.out.println(" Up");
	}
			else{--j;//System.out.println("LEft");
		}
		}
		int finalarr[]=new int[ar.size()];
		for(int k=0;k<ar.size();k++)
		{
			finalarr[k]=ar.get(k);
			System.out.print(finalarr[k]+" ");
		}

		
	}
}