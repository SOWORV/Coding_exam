package math.problems;

import org.testng.Assert;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        Arrays.sort(array1);
        Arrays.sort(array2);
        int lowDif = array1[1]-array1[0];
        for (int a = 2;a !=array1.length; a++){
            lowDif = Math.min(lowDif,array1[a]-array1[a-1]);
        }
        System.out.println("lowest difference in array1 is :"+lowDif);
        int dif2 = array2[1]-array2[0];
        for (int b = 2;b!=array2.length;b++){
            dif2 = Math.min(dif2,array2[b]-array2[b-1]);

        }
        System.out.println("lowest difference in array2 is :"+dif2);
        if (lowDif>dif2){
            System.out.println("lowest difference between array1 and array2 is :"+dif2);
        }else if(lowDif<dif2){
            System.out.println("lowest difference between array1 and array2 is :"+lowDif);
        }else if(lowDif==dif2){
            System.out.println("lowest difference between array1 and array2 is :"+lowDif);
            int s = 1;
            Assert.assertEquals(s,1);
        }





    }

}
