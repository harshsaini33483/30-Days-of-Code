import java.util.*;
public class FillingTheGrid{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int array[][]=new int[r+1][c+1];
        for(int i=0;i<r;i++){
                int temp=sc.nextInt();
                if(temp==0){
                    array[i][0]=1;    
                }else{
                    for(int j=0;j<c;j++){
                        if(temp>j){
                            array[i][j]=2;
                        }else{
                            array[i][j]=1;  
                            break;
                        }
                    }
                }
                
        }
       
        boolean ok=true;
        for(int i=0;i<c;i++){
            int temp=sc.nextInt();
            if(temp==0){
                if(array[0][i]==2){
                    ok=false;
                    break;
                }
                array[0][i]=1;    
            }else{
                for(int j=0;j<r;j++){
                    if(temp>j){
                        if(array[j][i]==1){
                            ok=false;
                        }else{
                              array[j][i]=2;
                          }  
                    }else{
                        if(array[j][i]==2){
                            ok=false;      
                        }
                        array[j][i]=1; 
                        break;
                    }
                }
            }
            if(!ok){
                break;
            }
        }     
     
        if(!ok){
            System.out.println(0);
        }else{
            long res = 1L;
            int mod = (int)1e9 + 7;
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    if(array[i][j] == 0){
                        res *= 2;
                        res = res % mod;
                    }
                }
            }
            System.out.println(res);
        }
        
    }
}