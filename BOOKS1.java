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
    		int scriber=sc.nextInt();
    		Long array[]=new Long[n];
    		Long sum1=0L;
    		Long mini=Long.MAX_VALUE;
    		for(int i=0;i<n;i++)
    			{array[i]=sc.nextLong();sum1+=array[i];mini=mini>array[i]?array[i]:mini;}

    		Long low=0L;
    		Long high=sum1;
    		Long best=Long.MAX_VALUE;
       		while(low<=high)
    		{
   				int booke=scriber-1;
   				Long mid=(low+high)/2;
   				Long total=0L;
   				Long carry=0L;
   				for(int i=array.length-1;i>=0;i--)
   				{
   					if(total+array[i]>mid && booke>0)
   					{
   						--booke;
   						total=0L;
   					}
   					if(booke==0)
   					{
   						carry=carry+array[i];
   						best=mid;
   					}
   					total=total+array[i];
   					//System.out.print(booke+" ");

   				}
   				//System.out.println(mid+" ");
   				if(booke==0 && carry<mid)
   				{
   					high=mid-1;
   				}
   				else if(booke==0 && carry>mid)
   				{
   					low=mid+1;
   				}
   				else if(booke>0)
   				{
   					high=mid-1;
   				}
   				else
   				{
   					low=mid+1;
   				}


			}	
			Long sumtotal=0L;
			int splits[]=new int [scriber-1];
			int j=splits.length;
			

			for(int i=array.length-1;i>=0;i--)
			{
				sumtotal+=array[i];
				if(sumtotal>=best)
				{	
					    		System.out.println(sumtotal+" "+best);

					if(sumtotal.equals(best))
					{

						splits[--j]=i;	
					}
					else
						{
							splits[--j]=i+1;	

						}
						sumtotal=0L;
				}

				if(i==j)
				{
					for(; i > 0; i--){
                    splits[--j] = i;}
				}
			}

    		int l=0;
    		System.out.print(array[0]+" ");
    		for(int i=1;i<n;i++)
    		{
    			
    			if(l<splits.length&& i==splits[l])
    				{System.out.print("/ ");++l;}
    	

    			System.out.print(array[i]+" ");
    		}
    		System.out.println();
    	}
    }
}