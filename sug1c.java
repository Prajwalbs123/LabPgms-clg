package LabSuggestedpgms;
import java.util.Scanner;

public class sug1c{
    public static void main(String args[])
    {
        float deg,F;
        Scanner sc =new Scanner(System.in);
        deg=sc.nextFloat();
        F=deg*9/5+32;
        System.out.println(F);
        
        F=sc.nextFloat();
        deg=(F-32)*5/9;
        System.out.println(deg);

        sc.close();

    }

}