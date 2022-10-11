package com.pranit.Recursions;

public class DigitSum {
    public static void main(String args[])
    {
        int ans= sum(1234);
        System.out.println(ans);
    }
    static int sum(int no)
    {
        if(no==0) {
            return 0;}
        return (no%10)+sum(no/10);

    }
}
