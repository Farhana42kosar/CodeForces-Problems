package Lectures;

import java.util.Arrays;
import java.util.Scanner;

public class CF1875A {
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	int n=sc.nextInt();
        	 int arr[]=new int[n];
	        	for(int i=0;i<arr.length;i++) {
	        		arr[i]=sc.nextInt();
	        	}
	        	Arrays.sort(arr);
	        	long  sum=b;
	        	for(int j=0;j<arr.length;j++) {
	        		sum=sum+Math.min(arr[j], a-1);
	        	}
	        	System.out.println(sum);
	        	
}
	}
}
