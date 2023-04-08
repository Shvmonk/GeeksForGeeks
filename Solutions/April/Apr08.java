//MAKE THE ARRAY BEAUTIFUL - APRIL 08
class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (l.size() == 0) {
                l.add(arr[i]);
            } else {
                if (check(l.get(l.size() - 1), arr[i])) {
                    l.remove(l.size() - 1);
                } else {
                    l.add(arr[i]);
                }
            }
        }
        return l;
    }
    static boolean check(int a, int b) {
        return ((a < 0 && b >= 0) || (a >= 0 && b < 0));
    }
}
