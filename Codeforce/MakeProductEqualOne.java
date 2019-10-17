import java.util.*;
public class MakeProductEqualOne{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        int oneN=0,oneP=0,zero=0;
        Long sum=0L;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            if(array[i]==-1){
                ++oneN;
            }else if(array[i]==1){
                ++oneP;
            }else if(array[i]==0){
                ++zero;
            }else if(array[i]<0){
                sum+=(int)Math.abs(array[i]+1);
                array[i]=-1;
                ++oneN;
            }else{
                sum+=(int)Math.abs(array[i]-1);
                array[i]=1;
                ++oneP;
            }
        }
        for(int i=0;i<n;i++){
            if(array[i]==0 ){
                ++sum;
                if(oneN%2!=0){
                    ++oneN;
                }
               
            }
        }
        
        if(oneN%2!=0){
            sum+=2;
        }
        System.out.println(sum);
   
    }   

}
