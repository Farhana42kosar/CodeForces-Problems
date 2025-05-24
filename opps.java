package Lectures;
public class opps {
        String name;
        int roll;
        int age;
 public  opps(String name,int roll,int age){
    this.name=name;
    this.roll=roll;
    this.age=age;


}
public static void fun(){
    System.out.println("hiiii");
}
public static void fun1(){
    System.out.println("hiiii i am in class");
}
static{
    System.out.println("i am first to run");
}
public static void main(String arggs[]){
 opps s = new opps("farha",2,11);
 System.out.println(s.name);

    }
    
}
