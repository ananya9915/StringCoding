

package stringinterview;

import java.util.Scanner;


public class StringContainsDigit2 {
     public static boolean isItADigit(String ss)
    {
          int len=ss.length();
            for (int i = 0; i < len; i++) {
                if(ss.charAt(i)>='0' && ss.charAt(i)<='9')
                {
                    return true;
                }
                else 
                {
                    return false;
            }
            }
        
        return false;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        System.out.println(isItADigit(s));
    }
    
}
