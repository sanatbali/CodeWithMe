package com.pranit.Recursions;

public class Palindrom_Recursion {
    public static void main(String[] args) {
        int no=1221;
        if(no== palind(no))
            System.out.println("PALIDROM!!!!");
        else
            System.out.println("SORRY NOT A PALINDROM");

    }

    static int palind(int no)
    {
        int digit=(int)(Math.log10(no))+1;
        return helper(no,digit);

    }
    static int helper(int no,int digit)
    {
        if(no%10==no)
        {return no;}
        int rem=no%10;
        return rem*(int)Math.pow(10,digit-1)+helper(no/10,digit-1);
    }
}
