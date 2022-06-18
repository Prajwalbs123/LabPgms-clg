package LabSuggestedpgms;
import java.util.*;
class sug2b{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j,n,m;
        System.out.println("Enter rows Size");
        n=sc.nextInt();
        System.out.println("Enter column Size");
        m=sc.nextInt();
        int[][] ar=new int[m][n];



        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        
        
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               System.out.print( ar[i][j]+" ");
            }
            System.out.println();
        }


        sc.close();

    }
}