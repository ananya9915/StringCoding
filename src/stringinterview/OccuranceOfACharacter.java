package stringinterview;

import java.util.Scanner;


public class OccuranceOfACharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        System.out.println("Enter the character to find occurance: ");
        String ss=sc.nextLine();
        int len=s.length();
        int newLen=s.replace(ss,"").length();
        int count=(len-newLen);
        System.out.println("Total Number: "+ count);
                
    }
    
}
