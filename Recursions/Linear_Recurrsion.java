package com.pranit.Recursions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Linear_Recurrsion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,34,3};
        int target =31;
        System.out.println(L_Search(arr,target,0));
        System.out.println(SendIndex(arr,target,0,new ArrayList<>()));

    }
    static boolean L_Search(int[] a,int target,int index)
    {if(index==a.length-1)
    {return false;}
        if(a[index]==target) {
        return true;
        }

        index++;
        return L_Search(a,target,index);
    }



    static List<Integer> SendIndex(int[] a, int target, int index,List<Integer> list)
    {
        if(index==a.length)
        {
            return list;
        }
        if(a[index]==target)
        {
            list.add(index);
        }
        return SendIndex(a,target,index+1,list);

    }
}
//TIME COMP
//BEST Complexity - O(1)
//WORST-O(N)
