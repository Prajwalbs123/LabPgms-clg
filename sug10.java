package LabSuggestedpgms;
import java.util.Random;
// Write a Java program that implements a multi- thread application that has three threads. First 
// thread generates a random integer for every 1 second; second thread computes the square of 
// the number and prints; third thread will print the value of cube of the number.
 class ChildThread implements Runnable{
    Thread t;
    int n;

    ChildThread(String name,int n){
        t= new Thread(this,name);
        this.n=n;
    }

     public void run(){
        if(t.getName()=="Second")
        {
         try{
            Thread.sleep(1000);
            System.out.println(n*n);
         }catch(Exception e){
            System.out.println("Interrupted ");
         }
         
        ChildThread tt = new ChildThread("Third", 9);
         tt.t.start();

        }else if(t.getName()=="Third"){
            
         try{
            Thread.sleep(1000);
            System.out.println(n*n*n);
         }catch(Exception e){
            System.out.println("Interrupted ");
         }
        }
    }

    public void join() {
    } 
}

public class sug10 {
  public static void main(String[] args){

        ChildThread st = new ChildThread("Second", 12);
        st.t.start();
        Random rd = new Random();

        try{
            Thread.sleep(5000);
            System.out.println(rd.nextInt());
        }catch(Exception e){
            System.out.println("main thread Exception");
        }
    }
    
}
