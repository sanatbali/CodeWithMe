package com.pranit.Recursions;

public class Number_steps {
    public static void main(String[] args) {
        System.out.println(steps(14,0));
    }
    private static int steps(int no,int steps)
    {
        return helper(no,steps);
    }
    private static int helper(int no,int steps) {
        if (no == 0)
            return steps;
        else if (no % 2 == 0)
            return helper(no/2,steps+1);
        return helper(no-1,steps+1);

    }
}
