package com.pranit.Recursions;

public class Recursion_Complex_Confusion
{
    public static void main(String[] args) {
        fun(3);
    }
    static int fun(int no)
    {
        if(no==0)
            return 1;
        fun(no-1);
        System.out.println(no);
        return fun(no-1);
    }
}
