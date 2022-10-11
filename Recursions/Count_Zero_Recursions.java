package com.pranit.Recursions;

public class Count_Zero_Recursions {

    public static void main(String[] args) {
        System.out.println(count_zero(102555,0));


}
    private static int count_zero(int no,int count )
    {
        return helper(no,count);

    }
    private static int helper(int no,int count)
    {
        if(no==0)
            return count;

        int rem=no%10;
        if(rem==0)
            return helper(no/10,count+1);
        return helper(no/10,count);
    }
}
//
//    *BruteForce Approach*
//    static void count_zero(int no)
//    {
//        int rem=1;
//        int len=(int)(Math.log10(no))+1;
//        for(int i=0;i<len;i++)
//        {
//            if(rem==0)
//            {
//                count++;
//            }
//            rem=no%10;
//            no=no/10;
//        }
//
//    }
