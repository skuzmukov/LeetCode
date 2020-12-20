package strings;

public class Task_880 {
    public String decodeAtIndex(String S, int K) {

        StringBuilder sb = new StringBuilder();
        int count;

        for (char c : S.toCharArray()) {
            if (Character.isDigit(c)) {
                count = c - '0';
                if (sb.length() * count >= K) {
                    return String.valueOf(sb.charAt((K - 1) % sb.length()));
                } else {
                    String res = sb.toString();
                    while (--count > 0) {
                        sb.append(res);
                    }
                }
            } else {
                sb.append(c);
                if (sb.length() >= K) {
                    return String.valueOf(sb.charAt(K - 1));
                }
            }
        }

        return String.valueOf(sb.charAt(K - 1));
    }
}


/**
 *
 * Status: Memory Limit Exceeded
 *
 * */