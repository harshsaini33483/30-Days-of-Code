import java.util.*;
public class PensandPencils{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            double c=sc.nextDouble();
            double d=sc.nextDouble();
            int k=sc.nextInt();
            int countPen=0,countPencil=0;
            countPen=findPen(a,c);
            countPencil=findPen(b,d);
            if(countPen+countPencil<=k){
                System.out.println(countPen+" "+countPencil);
            }else{
                System.out.println(-1);
            }
        }
    }
    public static int findPen(int tempA,double tempB){
        if(tempA<tempB){
            return 1;
        }
        return (int)Math.ceil(tempA/tempB);
    }
}