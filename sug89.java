package LabSuggestedpgms;

// Program Illustrating checked and unchecked exceptions
// Program to create customized exception

public class sug89 {
 public static void main(String[] args){
    try{
    exth();
    }
     catch(Exception e){
        System.out.println("Caught again");
    }

    int a=0;
    int d=11/a;  //uncaught exception
    System.out.println(d);  
 }

 
 static void exth() throws Exception{   
      try
      {
        throw new Cusexe();   //caught Exception
      }
      catch(Cusexe e){
        System.out.println("Caught Custom Exception");
      }
      catch(Exception e){
        System.out.println("Caught Exception");
      }
       throw new Cusexe();
    }
    
}

class Cusexe extends Exception{
    void met(){
        System.out.println("Exception");
    }
}

