package day03;

import java.util.Locale;

public abstract class Encryption {

    public abstract String encrypts(String input);

    public static String encrypts(String input, int offset){
        String result;
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toUpperCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] += offset;
            if (chars[i]>'Z') chars[i] -= 'Z'-'A'+1;
            sb= sb.append(Character.toString(chars[i]));
        }
        System.out.println(sb);
        return result= sb.toString();
    }

}
