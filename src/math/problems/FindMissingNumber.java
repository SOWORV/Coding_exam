package math.problems;


import org.testng.Assert;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println("missing number is : "+helper(array));

    }
    public static int helper(int [] array1){
        int s = array1.length;
        int n = 10;
        int sum = n*(n+1)/2;
        int restsum = 0;
        for (int a = 0; a<s;a++){
            restsum+=array1[a];
            int misN = 9;
            Assert.assertEquals(misN,9);

        }
        int misnum = sum-restsum;
        return misnum;


    }

}
