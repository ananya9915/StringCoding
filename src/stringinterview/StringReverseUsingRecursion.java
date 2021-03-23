

package stringinterview;

import java.util.Scanner;

public class StringReverseUsingRecursion {
    public static String reverseString(String ss)
    {
        if(ss==null || ss.length()<=1)
        {
            return ss;
            
        }
        else
        {
            return reverseString(ss.substring(1))+ss.charAt(0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        System.out.println(reverseString(s));
        
    }
}
