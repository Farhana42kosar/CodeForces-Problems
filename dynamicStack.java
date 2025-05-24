package Lectures;

public class dynamicStack extends stack {
	@Override
	public void push(int ele) throws Exception {
		if(isFull()) {
		int newarr[]=new int[2*arr.length];
		for(int i=0;i<arr.length;i++) {
			newarr[i]=arr[i];
		}
		arr=newarr;
	}
		super.push(ele);

}
	public static void main(String args[]) throws Exception {
		
		dynamicStack ds=new dynamicStack();
		ds.push(12);
		ds.push(13);
		ds.push(14);
		ds.push(15);
		ds.push(16);
		ds.push(17);
		ds.display();
		System.out.println("size of stack is "+ds.size());
		
		


	}
}