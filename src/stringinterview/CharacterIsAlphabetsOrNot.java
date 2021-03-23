package stringinterview;

import java.util.Scanner;

public class CharacterIsAlphabetsOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String s1 = sc.nextLine();
        String s2 = s1.toLowerCase();
        char[] ch = s2.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                System.out.println("Yes");

            } else {
                System.out.println("No");
            }
        }
    }
}
