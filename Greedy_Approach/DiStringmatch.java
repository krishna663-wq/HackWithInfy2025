
public class DiStringmatch {
    public static int[] diStringMatch(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];
        int low = 0, high = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = low++;
            } else {
                perm[i] = high--;
            }
        }
        perm[n] = low;  // or high, both are the same here
        return perm;
    }

    public static void main(String[] args) {
        String s = "IDID";
        int[] result = diStringMatch(s);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
