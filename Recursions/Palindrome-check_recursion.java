import java.io.*;
import java.util.*;

class Main
{
static int rev(int num, int temp)
{

    if (num == 0)
        return temp;
 
    temp = (temp * 10) + (num % 10);
 
    return rev(num / 10, temp);
}
 
// Driver Code
public static void main (String[] args)
{
    int num = 121;
    int temp = rev(num, 0);
     
    if (temp == num)
        System.out.println("yes");
    else
        System.out.println("no" );
}
}
