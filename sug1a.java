package LabSuggestedpgms;
import java.util.*;

public class sug1a {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N to claculate Nfactorial ");
        int n=sc.nextInt();
        int fact=1;
        while(n!=1)
        {
            fact=fact*n;
            n--;
        }
        System.out.println("Nfactorial is "+fact);
        sc.close();
    }
}
