package day03;

public class Ceasar extends Encryption{

    private int offset;

    public Ceasar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toUpperCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] += offset;
            if (chars[i]>'Z') chars[i] -= 'Z'-'A'+1;
            sb= sb.append(Character.toString(chars[i]));
        }
        System.out.println(sb);
        return sb.toString();
    }



    public static void main(String[] args) {
        Encryption encryption = new Ceasar(13);
        encrypts("def",3);

        // check line: 24 betű .. 2x12 miatt..
        String s = encryption.encrypts(encryption.encrypts("APPLE"));
        System.out.println(s);


    }

}
