
package stringinterview;

import java.util.HashMap;
import java.util.Scanner;


public class Anagram2 {
    public static boolean isAnagram(String st1,String st2)
    {
        HashMap<Character,Integer> hs1=new HashMap<>();
        HashMap<Character,Integer> hs2=new HashMap<>();
        Character ch;
        for(int i=0;i<st1.length();i++)
        {
            ch=st1.charAt(i);
            if(hs1.get(ch)==null)
            {
                hs1.put(ch,1);
            }
            else
            {
                hs1.put(ch,(hs1.get(ch)+1));
            }
        }
        
         for(int i=0;i<st2.length();i++)
        {
            ch=st2.charAt(i);
            if(hs2.get(ch)==null)
            {
                hs2.put(ch,1);
            }
            else
            {
                hs2.put(ch,(hs2.get(ch)+1));
            }
        }
         return st1.equals(st2);
                
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string :");
        String st1=sc.nextLine();
        System.out.println("Enter 2nd string :");
        String st2=sc.nextLine();
        st1=st1.replaceAll("\\s","");
        st2=st2.replaceAll("\\s","");
        if(isAnagram(st1,st2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
        
    }
}
