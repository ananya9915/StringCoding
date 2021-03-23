
package stringinterview;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class DuplicateCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1=sc.nextLine();
        String s=s1.toLowerCase();
        char[] ch=s.toCharArray();
        HashMap<Character,Integer> hs=new HashMap<>();
        for(Character c:ch)
        {
            if(hs.containsKey(c))
            {
                hs.put(c,hs.get(c)+1);
            }
            else
            {
                hs.put(c,1);
            }
        }
        Set<Character> keys=hs.keySet();
        
        for(Character c:keys)
        {
            if(hs.get(c)>1)
            {
                System.out.println("Duplicate "+c+" repeats "+hs.get(c)+" times" );
                
            }
        }
           
        
    }
    
}
