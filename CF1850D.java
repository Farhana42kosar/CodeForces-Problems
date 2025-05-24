package Lectures;

import java.util.Arrays;
import java.util.Scanner;

public class CF1850D {
public static void main(String args[]){
		        Scanner sc=new Scanner(System.in);
		        int t=sc.nextInt();
		        while(t-->0){
		        	int n=sc.nextInt();
		        	int k=sc.nextInt();
		        	
		        	 int arr[]=new int[n];
		        	for(int i=0;i<arr.length;i++) {
		        		arr[i]=sc.nextInt();
		        	}
		        	Arrays.sort(arr);
		        	int max=1;
		        	int cnt=1;
		        	for(int i=1;i<arr.length;i++) {
		        		if(arr[i]-arr[i-1]<=k) {
		        			cnt++;
		        		}else {
		        			max=Math.max(max, cnt);
		        			cnt=1;
		        		}
		        		
		        	}
        			max=Math.max(max, cnt);

		        System.out.println(arr.length-max);
          }
		       
         }
    }