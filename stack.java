package Lectures;
public class stack {

    protected int arr[];
    private int top ;

    public stack(int cap){
        arr=new int[cap];

    }
    public stack(){
        arr=new int[5];
        top=0;
    }


    public boolean isEmpty(){
        return top==0;
    }


    public boolean isFull(){
        return top==arr.length;
    }
    public int size(){
        return top;
    }


    public void push(int ele)throws Exception{
        if(isFull()){
            throw new Exception("Full");
        }
        arr[top]=ele;
        top++;
    }


    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("Empty");
        }
        int ele =arr[top-1];
        top--;
        return ele;
    }


    public int peek()throws Exception{
        if(isEmpty())
            throw new Exception(" it isEmpty");
            return arr[top-1];
        }


        public void display(){
            for (int i=0;i<top;i++){
                System.out.println(arr[i]+" ");
            }
        }
    
    public static void main(String args[]) throws Exception{
       stack s= new stack();
       s.push(6);
       s.push(2);
       s.push(3);
       s.push(7);
       s.push(9);
       s.pop();
       s.display();

    }
    
}

