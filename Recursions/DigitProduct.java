package com.pranit.Recursions;

public class DigitProduct {

    public static void main(String[] args) {
       int answer= prod(1250);
        System.out.println(answer);
    }
    static int prod(int no)
    {
        if(no==0)
            return 1;
        return (no%10)*prod(no/10);
    }
}
