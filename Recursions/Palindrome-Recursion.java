import java.util.*;
import java.io.*;

public class Main {
   public static boolean isPalindrome(String str){

      if(str.length() == 0 ||str.length()==1){
         return true;
      }

      if(str.charAt(0) == str.charAt(str.length()-1)){
         return isPalindrome(str.substring(1, str.length()-1));
      }
      return false;
   }
   public static void main(String args[]){
      String myString = "malayalam";
      if (isPalindrome(myString)){
         System.out.println("Given String is a palindrome");
      }else{
         System.out.println("Given String is not a palindrome");
      }
   }
}
