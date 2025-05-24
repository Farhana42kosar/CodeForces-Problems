package Lectures;

public class Queue {
	private int arr[];
	private int front;
	private int size;
	
	public Queue(int cap) {
		 arr=new int[cap];
		 front =0;
		 size=0;
	}
	public Queue() {
		 arr=new int[5];
		 front=0;
		 size=0;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==arr.length;
	}
	public int size() {
		return size ;
	}
	public void Enqueue(int ele)throws Exception{
		if(isFull())throw new Exception("queue is full");
		int idx=(front+size)%arr.length;
		arr[idx]=ele;
		size++;
	}
	public int Dequeue()throws Exception{
		if(isEmpty())throw new Exception("queue is empty");
		int ele=arr[front];
		front=(front+1)%arr.length;
        size--;
        return ele;
		
	}
	public int getFront() throws Exception{
		if(isEmpty())throw new Exception("queue is empty");
		return arr[front];
	}
	public void display() {
		for (int i=0;i<size;i++) {
			int idx=(front+i)%arr.length;
			System.out.println(arr[idx]);
			
		}
	}
public static void main(String args[]) throws Exception {
	Queue q=new Queue();
	q.Enqueue(6);
	q.Enqueue(4);
	
	//System.out.println(q.size());
	
	
	//q.display();
	q.Enqueue(9);
	q.Enqueue(3);
	q.Dequeue();
	q.display();

	
	
}
}
