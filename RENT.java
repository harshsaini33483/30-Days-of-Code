import java.io.*;
import java.util.*;
class Solution{
	static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }
 
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
 
        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
 
        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
 
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
 
            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }
 
            if (neg)
                return -ret;
            return ret;
        }
 
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
	static int max=0;
	public static void main(String[] args)throws Exception {
		Reader sc=new Reader();
		int t=sc.nextInt();
		while(--t>=0)
		{
			int n=sc.nextInt();
			Items array[]=new Items[n];
			int start,end,price;
			for(int i=0;i<n;i++)
			{
				start=sc.nextInt();
				end=sc.nextInt();
				price=sc.nextInt();
				Items it=new Items();

				it.start=start;
				it.end=start+end;
				it.price=price;
				array[i]=it;
			}

			int max1=0;
			Arrays.sort(array,new SortingByStart());
		


			for(int i=0;i<n;i++)
			{
				int temp=backTracking(array,i,array[i].price);
			//	System.out.println(temp+"  temp ");
			}
			System.out.println(max);



		}

	}

	public static int backTracking(Items[]arr,int i,int prices)
	{
		if(i==arr.length)
		{
			return 0;
		}
		int count=0;

		for(int j=i+1;j<arr.length;j++)
		{
		//	System.out.println(j+"   "+i);
				
			if(arr[i].end<arr[j].start)
			{
				count=prices+arr[j].price;
				//System.out.println(arr[i].end+"   "+arr[j].start +"  "+count);
				backTracking(arr,j,count);
				if(max<count)
				{
					max=count;
				}

			}
		}
		return 0;
	}
}
class SortingByStart implements Comparator<Items>{
	public int compare(Items a,Items b)
	{
		if(a.start>b.start)
		{
			return 1;
		}
		else if(a.start<b.start)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}
class Items{
	int start;
	int end;
	int price;
}
