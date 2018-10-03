import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

 class Solution {


    public static void main(String[] args) throws IOException {
            Scanner sc=new Scanner(System.in);
            String str=sc.next();
            char ar[]=str.toCharArray();
            int n=str.length();
            for(int i=1;i<n;i++)
            {
                int j=i-1;
                while(true && j>=0)
                {
                    if(ar[i]==ar[j])
                    {
                        ar[i]='#';
                        ar[j]='#';
                        break;
                    }
                    else if( ar[j]=='#')
                    {
                        --j;
                    }
                    else
                    {
                        break;
                    }
                }

            }

            String fina="";
            for(int i=0;i<n;i++)
            {   
               // / System.out.println(ar[i]);
                if(ar[i]!='#')
                {
                    fina=fina+ar[i];
                }
            }

            if(fina.equals(""))
            {
                System.out.println("Empty String");
            }
            else
            {
                System.out.println(fina);
            }
            }
}
