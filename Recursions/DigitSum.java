package com.pranit.Recursions;

public class DigitSum {
    public static void main(String args[])
    {
        int answer= sum(123456);
        System.out.println(answer);
    }
    static int sum(int no)
    {
        if(no==0) {
            return 0;}
        return (no%10)+sum(no/10);

    }
}
