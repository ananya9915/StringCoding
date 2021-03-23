package stringinterview;

import java.util.Scanner;

public class SubstringInAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Original String: ");
        String s = sc.nextLine();
        System.out.println("Enter the substring to search: ");
        String s1 = sc.nextLine();
        String s2 = s1.toLowerCase();
        String s3 = s.toLowerCase();
        if (s3.contains(s2)) {
            System.out.println("Substring is present in String: " + s2);
        } else {
            System.out.println("Not Present in the String: ");
        }
    }

}
