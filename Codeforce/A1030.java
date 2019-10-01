import java.io.*;
import java.util.*;
public class A1030{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ok=false;
        for(int i=0;i<n;i++){
            if(sc.nextInt()==1){
                ok=true;
            }
        }
        if(ok){
            System.out.println("HARD");
        }else{
            System.out.println("EASY");
        }
    }
}