package com.pranit.Recursions;

public class DigitProduct {

    public static void main(String[] args) {
       int ans= prod(25);
        System.out.println(ans);
    }
    static int prod(int no)
    {
        if(no==0)
            return 1;
        return (no%10)*prod(no/10);
    }
}
