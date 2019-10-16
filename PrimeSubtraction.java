import java.math.BigInteger;
import java.util.*;
public class PrimeSubtraction{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            
        BigInteger bigInteger1=sc.nextBigInteger();
        BigInteger bigInteger2=sc.nextBigInteger();
       
        if((bigInteger1.subtract(bigInteger2)).compareTo(BigInteger.ONE)==0){
            System.out.println("NO");
        }else{
            System.out.println("Yes");
        }
        }
    }
}