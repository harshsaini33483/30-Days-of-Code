import java.util.*;
import java.io.*;

class Solution{
	public static void main(String[] args)throws IOException {
		Parser sc=new Parser(System.in);
		int n=sc.nextInt();
		long array[]=new long[n];
		
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		ArrayList<Long>arr1=new ArrayList<Long>();

		ArrayList<Long>arr2=new ArrayList<Long>();
		for(int i=0;i<n;i++)
		{
				for(int j=0;j<n;j++)
				{
					for(int k=0;k<n;k++)
					{
						arr1.add((array[i]*array[j])+array[k]);
						if(array[i]!=0)
							{arr2.add((array[i])*(array[j]+array[k]));}

					}	
				}
			
		}	
		Long arr11[]=new Long[arr1.size()];

		Long arr12[]=new Long[arr2.size()];
		
		for(int i=0;i<arr1.size();i++)
			{arr11[i]=arr1.get(i);}

		for(int i=0;i<arr2.size();i++)
			{arr12[i]=arr2.get(i);}

		Long count=0L;
		Arrays.sort(arr11);
		Arrays.sort(arr12);
		for(int i=0;i<arr1.size();i++)
		{
			int low=binarySearchLower(arr12,arr11[i]);

			int high=binarySearchHigher(arr12,arr11[i]);
			//System.out.println(low+" "+high);
			if(low!=-1 || high!=-1){
			count=count+(high-low)+1;}
		}

		System.out.println(count);

	}



	public static int binarySearchLower(Long[]arr2,long p)
	{
		int low=0;
		int result=-1;
		int high=arr2.length;
		while(low<=high)
		{
			int mid=(low+high)/2;

			if(arr2[mid]==(p))
			{
				result=mid;
				high=mid-1;
			}
			else if(arr2[mid]>p)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}

		}
		return result;
	}
	public static int binarySearchHigher(Long[]arr2,long p)
	{
		int low=0;
		int result=-1;
		int high=arr2.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr2[mid]==(p))
			{
				result=mid;
				low=mid+1;
			}
			else if(arr2[mid]>p)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}

		}
		return result;
	}





}

class Parser
{
   final private int BUFFER_SIZE = 1 << 16;

   private DataInputStream din;
   private byte[] buffer;
   private int bufferPointer, bytesRead;

   public Parser(InputStream in)
   {
      din = new DataInputStream(in);
      buffer = new byte[BUFFER_SIZE];
      bufferPointer = bytesRead = 0;
   }

   public long nextLong() throws Exception
   {
      long ret = 0;
      byte c = read();
      while (c <= ' ') c = read();
      boolean neg = c == '-';
      if (neg) c = read();
      do
      {
         ret = ret * 10 + c - '0';
         c = read();
      } while (c > ' ');
      if (neg) return -ret;
      return ret;
   }
   
   //reads in the next string
   public String next() throws Exception
   {
      StringBuilder ret =  new StringBuilder();
      byte c = read();
      while (c <= ' ') c = read();
      do
      {
         ret = ret.append((char)c);
         c = read();
      } while (c > ' ');
      return ret.toString();
   }

   public int nextInt() throws Exception
   {
      int ret = 0;
      byte c = read();
      while (c <= ' ') c = read();
      boolean neg = c == '-';
      if (neg) c = read();
      do
      {
         ret = ret * 10 + c - '0';
         c = read();
      } while (c > ' ');
      if (neg) return -ret;
      return ret;
   }
   
   private void fillBuffer() throws Exception
   {
      bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
      if (bytesRead == -1) buffer[0] = -1;
   }

   private byte read() throws Exception
   {
      if (bufferPointer == bytesRead) fillBuffer();
      return buffer[bufferPointer++];
}
}
