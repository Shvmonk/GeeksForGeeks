//PALINDROME WITH MINIMUM SUM - MAY 11
class Solution { 
    public static int minimumSum(String s) {
        // code here
        char A[] = s.toCharArray();
        int n = A.length;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == '?' && A[n - i - 1] == '?') {
                continue;
            } else if (A[i] == '?' && A[n - i - 1] != '?') {
                A[i] = A[n - i - 1];
            } else if (A[i] != '?' && A[n - i - 1] == '?') {
                A[n - i - 1] = A[i];
            } else {
                if (A[i] != A[n - i - 1]) return -1;
            }
        }
        ArrayList<Character> l = new ArrayList<Character>();
        for (int i = 0; i < n;) {
            if (A[i] == '?') {
                l.add(A[i]);
                while (i < n && A[i] == '?') i++;
            } else {
                l.add(A[i]);
                i++;
            }
        }
        int ans = 0;
        n = l.size();
        for (int i = 0; i < n / 2; i++) {
            if (l.get(i) == '?') {
                int a = i;
                int b = n - i - 1;
                int min = Integer.MAX_VALUE;
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    int op1 = 0;
                    if (a + 1 < n) {
                        op1 += Math.abs(ch - l.get(a + 1));
                    }
                    if (a - 1 >= 0) {
                        op1 += Math.abs(ch - l.get(a - 1));
                    }
                    if (b + 1 < n) {
                        op1 += Math.abs(ch - l.get(b + 1));
                    }
                    if (b - 1 >= 0) {
                        op1 += Math.abs(ch - l.get(b - 1));
                    }
                    min = Math.min(op1, min);
                }
                ans += min;
            }
        }
        for (int i = 0; i < l.size() - 1; i++) {
            if (l.get(i) == '?' || l.get(i + 1) == '?') {
                continue;
            }
            ans += Math.abs(l.get(i) - l.get(i + 1));
        }
        return ans;
    }
}
