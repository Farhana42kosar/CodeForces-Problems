package Lectures;

import java.util.Stack;

public class nextGreaterelement {
	public static void main(String args[]) {
		int arr[]= {6,4,10,3,2,7,9,1,3};
        Stack<Integer> st=new Stack<>();
        int answer[]=new int[arr.length];

	
	   
	        for(int i=0;i<arr.length;i++) {
	       
	         while(!st.isEmpty()&& arr[st.peek()]<arr[i]){
	               int idx= st.pop();
	                answer[idx]=arr[i];
	            }
	                st.push(i);
	            }
	        for(int i=0;i<arr.length;i++) {
	 	       
		         while(!st.isEmpty()&& arr[st.peek()]<arr[i]){
		               int idx= st.pop();
		                answer[idx]=arr[i];
		            }
		                //st.push(i);
		            }
	       
	        while(!st.isEmpty()) {
	        	int idx=st.pop();
	        	answer[idx]=-1;

	        }
	        for(int i=0;i<answer.length;i++) {
	        	
	        	System.out.print(answer[i]+" ");
	        }
	    }

	

}
