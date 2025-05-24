package Lectures;
import java.util.*;
public class CF1878A {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            boolean result =false;
            for(int i=0;i<arr.length;i++){
        
                if(arr[i]==k){
                    result= true;
                }
          
            }
            System.out.println(result==true?"Yes":"No");

        }
        sc.close();
}
}

