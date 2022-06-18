// Write a program to create interface named test. In this interface the member function is 
// square. Implement this interface in arithmetic class. Create one new class called ToTestInt in 
// this class use the object of arithmetic class.
package LabSuggestedpgms;
import java.util.*; //importing package

interface test{
    public int square(int a);
}

class arithmetic implements test{
    int a;
    arithmetic(){
        a=0;
    }
    public int square(int a){
        return a*a;
    }
}

class ToTestInt{
    Scanner sc = new Scanner(System.in);
    arithmetic obj = new arithmetic();
    int a=sc.nextInt();
    int r=obj.square(a);
}

public class sug67 {
    public static void main(String args[]){
        System.out.println("Enter number");
        ToTestInt obj2 = new ToTestInt();
        System.out.println(obj2.r);
    }    
}
