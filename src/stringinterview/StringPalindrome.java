
package stringinterview;

import java.util.Scanner;


public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        String ss="";
        for(int i=s.length()-1;i>=0;i--)
        {
            ss=ss+s.charAt(i);
        }
        if(s.equals(ss))
        {
            System.out.println("Palindrome: ");
        }
        else
        {
            System.out.println("Not Palindrome: ");
        }
    }
    
}
