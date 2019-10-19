    import java.io.*;
    import java.util.*;
    public class  MaximalContinuousRest{
        public static void main(String[] args)throws IOException {
            OutputStream outputStream = System.out;
            PrintWriter out = new PrintWriter(outputStream);
            BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
            Scanner sc=new Scanner(System.in);
            int n=Integer.parseInt(bReader.readLine());
            String str=bReader.readLine();
           
            int max=0,currentCount=0;
            for(int i=0;i<str.length()*2;i++){
                if(str.charAt(i%str.length())=='1'){
                        ++currentCount;
                        if(max<currentCount){
                            max=currentCount;
                        }
                 
                }else if(str.charAt(i%str.length())=='0'){
                    if(i>str.length()){
                        break;
                    }
                    currentCount=0;
                }
            }
            out.println(max);
            out.close();
            outputStream.close();
        }
    }