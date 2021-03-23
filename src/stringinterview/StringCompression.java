package stringinterview;

import java.util.*;
import java.util.Map.Entry;

public class StringCompression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String: ");
        String str = sc.nextLine();
        Map<Character, Integer> mp = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (mp.get(str.charAt(i)) != null) {
                mp.put(str.charAt(i), mp.get(str.charAt(i)) + 1);
            } else {
                mp.put(str.charAt(i), 1);
            }

        }
        StringBuilder sb = new StringBuilder();
        for(Entry<Character,Integer> entry : mp.entrySet()) {
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        System.out.println(sb.toString());
    }

}
