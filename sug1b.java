package LabSuggestedpgms;
import java.util.*;
class sug1b{

    public static void main(String args[])
    {
             Scanner sc = new Scanner(System.in); 
            System.out.println("Enter number of primes required");
           int n=sc.nextInt();
            int pm=2,i=0,flag=0;
            while(i<n)
            {
                for(int j=2;j<=pm/2;j++)
                {
                    if(pm%j==0)
                    {  
                    flag=1;
                      break;
                       }
                       else{
                           flag=0;
                       }
                }
                if(flag==0)
                {
                    System.out.print(pm+" ");
                    i++;
                }
                pm++;
                 
            }


            sc.close();
        }
    

    }