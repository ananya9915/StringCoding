

package stringinterview;

import java.util.Scanner;


public class StringContainsDigit1 {
    public static boolean isItADigit(CharSequence ss)
    {
        if(ss.length()<1)
            return false;
        else
        {
            int len=ss.length();
            for (int i = 0; i < len; i++) {
                if(!Character.isDigit(ss.charAt(i)))
                    return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        System.out.println(isItADigit(s));
    }
    
}
