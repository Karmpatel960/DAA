package Practical7;

public class RABIN_KARP_MATCHER {
    public static void main(String[] args) {
        String t = "ABABDABACDABABCABAB";
        String p = "ABABCABAB";
        int d = 256;
        int q = 101;
        rabin_karp_matcher(t, p, d, q);
    }

    public static void rabin_karp_matcher(String t, String p, int d, int q){
        int n = t.length();
        int m = p.length();
        int h = 1;

        for (int i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }

        int pv = 0;
        int tv = 0;

        for (int i = 0; i < m; i++) {
            pv = (pv * d + p.charAt(i)) % q;
            tv = (tv * d + t.charAt(i)) % q;
        }

        for (int s = 0; s <= n - m; s++) {
            if (pv == tv) {
                boolean match = true;
                for (int i = 0; i < m; i++) {
                    if (p.charAt(i) != t.charAt(s + i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    System.out.println("Pattern occurs with shift " + s);
                }
            }

            if (s < n - m) {
                tv = (d * (tv - t.charAt(s) * h) + t.charAt(s + m)) % q;
                if (tv < 0) {
                    tv += q;
                }
            }
        }
    }
}

