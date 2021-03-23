
package stringinterview;

import java.util.Arrays;
import java.util.Scanner;



public class Anagrams1 {
    public static boolean isAnagram(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        else
        {
            char[] ch1=s1.toCharArray();
            char[] ch2=s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            return Arrays.equals(ch1,ch2);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first String: ");
        String s1=sc.nextLine();
        System.out.println("Enter 2nd string: ");
        String s2=sc.nextLine();
        s1=s1.replaceAll("\\s","").toLowerCase();
        s2=s2.replaceAll("\\s","").toLowerCase();
        if(isAnagram(s1,s2))
        {
            System.out.println("Anagram:");
        }
        else
        {
            System.out.println("Not Anagram:A");
        }
       
    }
    
    
}
