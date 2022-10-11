package com.pranit.Recursions;

public class Recursion_fact {
    public static void main(String arg[])
    {
        int answer=Fact(5);
        System.out.println(answer);
    }
    public static int Fact(int no)
    {
    if(no ==1)
    {return 1;}
    return Fact(no-1)*no;
    }

}

