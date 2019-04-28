package string.problems;

public class Permutation {
    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("", "DAB");
    }
    private static void permutation(String pref, String str) {
        int s= str.length();
        if (s == 0){
            System.out.println(pref);
        }
        else {
            for (int a = 0; a < s; a++) {
                permutation(pref + str.charAt(a), str.substring(0, a) + str.substring(a + 1,s));
            }
        }
    }
}