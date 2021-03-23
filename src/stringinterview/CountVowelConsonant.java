

package stringinterview;

import java.util.Scanner;



public class CountVowelConsonant {
    public static void countVowelConso(String ss){
    int vowelCount=0;
    int consoCount=0;
    for(int i=0;i<ss.length();i++)
    {
        if(isVowel(ss.charAt(i)))
        {
            vowelCount+=1;
        }
        else
        {
            consoCount+=1;
           
        }
    }
        System.out.println("Vowel Count: "+ vowelCount);
        System.out.println("Consonant Count: "+ consoCount);
}
    public static boolean isVowel(char ch)
    {
        ch=Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U');
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        countVowelConso(s);
        
    }

   
}
