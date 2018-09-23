import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(--t>0)
		{
			int row=sc.nextInt();
			int col=sc.nextInt();
			int arr[][]=new int[row][col];
			int matrix[][]=new int[row][col+1];
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					arr[i][j]=sc.nextInt();
				}
				matrix[i][1]=arr[i][0];
			}
			
			for(int i=0;i<row;i++)
			{
				int rowjump=i;
				for(int j=0;j<col-1;j++)
				{
					int right=arr[rowjump][j+1];
		
					int rightup=rowjump==0 ? 0 :arr[rowjump-1][j+1];
			
					int rightdown=rowjump==row-1 ? 0:arr[rowjump+1][j+1];
				
					
					
					if(right>rightup)
					{
						if(right>rightdown)
						{
							matrix[i][j]=right+matrix[rowjump][j-1];
							System.out.println("   right");
						}
						else
						{
							matrix[i][j]=rightdown+matrix[rowjump][j-1];
							++rowjump;
							System.out.println("   rightdown");
					
						}

					}
					else
					{
						matrix[i][j]=rightup+matrix[rowjump][j-1];
						--rowjump;

							System.out.println("   rightup");
					}
				}
			}

			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{System.out.print(matrix[i][j]+" ");}
				System.out.println();
			}


		}
	}
}