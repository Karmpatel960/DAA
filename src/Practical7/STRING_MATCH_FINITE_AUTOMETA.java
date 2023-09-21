package Practical7;

public class STRING_MATCH_FINITE_AUTOMETA {
    public static void main(String[] args) {
        String t = "ABABDABACDABABCABAB";
        String p = "ABABCABAB";

        build_finiteautometa(t,p);
    }

    private static void build_finiteautometa(String t, String p) {
        int m = p.length();
        int n = t.length();
        int[][] TF = new int[m + 1][256];

        int state, x;
        for (state = 0; state <= m; state++) {
            for (x = 0; x < 256; x++) {
                TF[state][x] = getNextState(p, m, state, x);
            }
        }
        state = 0;
        for (int i = 0; i < n; i++) {
            state = TF[state][t.charAt(i)];
            if (state == m) {
                System.out.println("Pattern found at index " + (i - m + 1));
            }
        }
    }
    static int getNextState(String pattern, int m, int state, int x) {
        if (state < m && x == pattern.charAt(state)) {
            return state + 1;
        }

        int nextState, i;
        for (nextState = state; nextState > 0; nextState--) {
            if (pattern.charAt(nextState - 1) == x) {
                for (i = 0; i < nextState - 1; i++) {
                    if (pattern.charAt(i) != pattern.charAt(state - nextState + 1 + i)) {
                        break;
                    }
                }
                if (i == nextState - 1) {
                    return nextState;
                }
            }
        }
        return 0;
    }
}
