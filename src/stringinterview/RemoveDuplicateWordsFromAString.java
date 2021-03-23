
package stringinterview;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class RemoveDuplicateWordsFromAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        String[] str=s.split(" ");
        Set<String> input= new LinkedHashSet<>();
        
            for(String str1:str)
            {
                input.add(str1);
            }
        Iterator itr =input.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+ " ");
        }
                
            
        
    }
    
}
