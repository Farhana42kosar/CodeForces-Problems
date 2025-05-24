package Lectures;

import java.util.Stack;

public class ReverseStack {
	public static void main(String args[]) {
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		 rev(st);
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}

	}

	public static void rev(Stack<Integer> st) {
		if(st.isEmpty())return;
		int ele=st.pop();
		rev(st);
		insert(st,ele);
		
	}

	private static void insert(Stack<Integer> st, int i) {
		if(st.isEmpty()) {
			st.push(null);
			return;
		}
		int ele=st.pop();
		insert(st,i);
		st.push(ele);
		
	}
	
	

}
