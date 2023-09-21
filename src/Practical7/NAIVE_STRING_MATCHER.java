package Practical7;

public class NAIVE_STRING_MATCHER {
    public static void main(String[] args) {
        String t = "1011101110";
        String p = "111";
        naive_string_Matcher(t, p);
    }

    public static void naive_string_Matcher(String t, String p) {
        int n = t.length();
        int m = p.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (t.charAt(i + j) != p.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                System.out.println("Pattern found at index " + i);
            }

        }
    }
}

