package stringinterview;
import java.util.Scanner;
public class SortCharacterInString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        System.out.println(System.nanoTime());
        char[] ch = s.toCharArray();
        char temp;
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] > ch[j]) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        for (Character c : ch) {
            System.out.print(c + " ");
        }
         System.out.println(System.nanoTime());
    }
}