import java.io.*;
import java.util.*;
public class FoxandSnake{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean first=false;
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j++){
                    System.out.print("#");
                }
                if(first){
                    first=false;

                }else{
                    first=true;
                }
            } 
            else{
                for(int j=0;j<m;j++){
                    if(!first && j==0){
                        System.out.print('#');
                    }else if(first && j==m-1){
                        System.out.print("#");
                    }else{
                        System.out.print('.');
                    }
                }
            }  
            System.out.println("");
        }
    }
}