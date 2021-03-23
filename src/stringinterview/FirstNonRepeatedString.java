
package stringinterview;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        int len=s.length();
        HashMap<Character,Integer> hs=new HashMap<>();
        Character ch;
        for (int i = 0; i < len; i++) {
            ch=s.charAt(i);
            if(hs.containsKey(ch))
            {
                hs.put(ch,hs.get(ch)+1);
            }
            else
            {
                hs.put(ch,1);
            }
            
        }
        for (int j = 0; j < len; j++) {
            ch=s.charAt(j);
            if(hs.get(ch)==1)
            {
                System.out.println("Non Repeated String: "+ ch);
                break;
            }
        }
    }
    
}
