package Lectures;
public class Quicksort {
   public static void main(String args[]) {

    int arr[]={3,2,1,10,9,4};
    sort(arr,0,arr.length-1);

    for(int i=0;i<arr.length;i++){
     System.out.println(arr[i]+" ");
    }
}

    public static void sort(int arr[],int si,int ei){
    if(si>ei)return;
    int pi=pivot(arr,si,ei);
    sort(arr,si,pi-1);
    sort(arr,pi+1,ei);
    }


    public static int pivot(int arr[],int si,int ei){
        int element=arr[ei];
        int pi=si;

    for(int i=si;i<=ei;i++){
        if(element>arr[i]){
            int temp=arr[i];
            arr[i]=arr[pi];
           arr[pi]=temp;
            pi++;
        }
    }
    int temp=arr[ei];
    arr[ei]=arr[pi];
    arr[pi]=temp;
    return pi;


   }
}
