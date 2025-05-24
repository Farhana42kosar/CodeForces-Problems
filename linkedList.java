package Lectures;

public class linkedList {
public static class Node{
	int data;
	Node next;
	Node prev;
	public Node(int data) {
		this.data=data;
	}
}
Node head;
Node end;
int size=0;
//add start
public void addStart(int ele) {
	Node n=new Node(ele);
	if(size==0) {
		head=n;
		end=n;
		size++;
	}
	else {
		n.next=head;
		head=n;
		size++;
	}
}
//add end
public void addend(int ele) {
	Node n=new Node(ele);
if(size==0) addStart(ele);
//	head=n;
//	end=n;
//	size++;

	end.next=n;
	end=n;
	n.next=null;
	size++;
   
 }
public void middle(int ele) {
	Node n=new Node(ele);
	if(size==0) addStart(ele);
	else {
		
	}
}
//start remove
public void removestart()throws Exception {
	if(size==0) throw new  Exception("empty");
	head=head.next;
    size--;
}
//end remove
public void removeEnd()throws Exception {
	if(size==0) throw new  Exception("empty");
	
	end.prev=null;
	size--;
}
}
