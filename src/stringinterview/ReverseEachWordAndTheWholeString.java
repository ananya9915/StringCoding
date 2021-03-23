package stringinterview;

import java.util.Scanner;

public class ReverseEachWordAndTheWholeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        String str = "";
        for (String s1 : ss) {
            String s2 = "";
            for (int i = s1.length() - 1; i >= 0; i--) {
                s2 = s2 + s1.charAt(i);
            }
            str = str + s2 + " ";
        }
        String[] temp = str.split(" ");
        String res = "";
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) {
                res = temp[i] + res;

            } else {
                res = " " + temp[i] + res;
            }
        }
        System.out.println(res);
    }
}
