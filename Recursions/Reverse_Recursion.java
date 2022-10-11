package com.pranit.Recursions;

public class Reverse_Recursion {
    public static void main(String[] args) {
        int no=1221;
        if(no==rev(no))
        System.out.println("PALIDROM!!!!");
        else
            System.out.println("SORRY NOT A PALINDROM");
    }
static int rev(int no)
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

//FOR REVERSE NUMBER USE BRUTFORCE METHOD AND THEN RECURSION!


//static int sum=0;
//
//int rev(no);
//static void rev(int no)
//{
//    if(no==0)
//        return;
//    int rem=no%10;
//    sum=sum*10+rem;
//    rev(no/10);
//}
//soup(sum)
//NOTE: WE ARE NOT RETURNING ANYTHING JUST UPDATING VALUE OF SUM REMEMBER STATIC(HUMAN EXAMPLE)

