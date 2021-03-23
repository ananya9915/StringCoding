
package stringinterview;

import java.util.Scanner;


public class CharacterCountInEachWord {
    public static void count(String s)
    {
    char[] ch=s.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
        String s1="";
        while(i<ch.length && ch[i]!=' ')
        {
            s1=s1+ch[i];
            i++;
            
        }
        if(s1.length()>0)
        {
            System.out.println(s1+"-->"+s1.length());
        }
        
            
    }
}
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        count(str);
        
        
    }
    
}
