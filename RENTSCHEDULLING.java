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
	public static void main(String[] args)throws Exception {
		Reader sc=new Reader();
		int t=sc.nextInt();
		while(--t>=0)
		{
			int n=sc.nextInt();
			Items array[]=new Items[n];
			int priceold[]=new int[n];
			int pricenew[]=new int[n];
			
			for(int i=0;i<n;i++)
			{
				int start=sc.nextInt();
				int end=sc.nextInt();
				int price=sc.nextInt();
			
				Items p=new Items();
				p.start=start;
				p.end=end+start;
				p.price=price;
				array[i]=p;
			}
			Arrays.sort(array,new SortingByStart());
			for(int i=0;i<n;i++)
			{
				//System.out.println(array[i].start+"  "+array[i].end);
				pricenew[i]=priceold[i]=array[i].price;
			}
			
			for(int i=1;i<n;i++)
			{
				int j=0;
				while(j<i)
				{
						//	System.out.println(i+"   "+j+"  "+(priceold[i])+"  "+pricenew[i]+"  "+(priceold[j])+"  "+pricenew[j]) ;
					
					if(array[i].start>array[j].end)
					{

				
						if(priceold[i]+pricenew[j]>pricenew[i])
						{

							pricenew[i]=priceold[i]+pricenew[j];
							
						}
						

					}
					
					++j;
				}
			}
			int m=0;
			for(int i=0;i<n;i++)
			{
				m=pricenew[i]>m?pricenew[i]:m;
			}
			System.out.println(m);

		}
	}
}
class Items{
	int start;
	int end;
	int price;
}
class SortingByStart implements Comparator<Items>{
	public int compare(Items a,Items b)
	{
		if(a.end>b.end)
		{
			return 1;
		}
		else if(a.end<b.end)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}