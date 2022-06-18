package LabSuggestedpgms;
import java.util.*;
public class sug2a {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt(),i;
            int[] ar = new int[n];
            for(i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            int sum=0;

            for(i=0;i<n;i++)
            {
                sum=sum+ar[i];
            }
            
            System.out.println(sum);

            sc.close();
        }

        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
