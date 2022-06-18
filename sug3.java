package LabSuggestedpgms;
import java.util.*;

class student {
    Scanner sc = new Scanner(System.in);
    String name,branch;
    int usn;
    long phno;

    student()  
    {
        name=sc.next();
        branch=sc.next();
        usn=sc.nextInt();
        phno=sc.nextLong();
    }

    student(String name,String branch,int usn,long phno)
    {
        this.name=name;
        this.branch=branch;
        this.usn=usn;
        this.phno=phno;
    }

    void dis()
    {
        System.out.println(this.name+" "+this.branch+" "+this.usn+" "+this.phno);
    }

}

public class sug3{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Students");
        int n=sc.nextInt();

        int i=0;

        while(i<n)
        {
            student s = new student();
            s.dis();
            i++;
        }
        
        sc.close();
    }
}
