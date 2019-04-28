package math.problems;

public class MakePyramid {
    public static void main(String[] args) {
        /*   Implement a large Pyramid of stars in the screen with java.

                *
               * *
              * * *
             * * * *
            * * * * *
           * * * * * *

         */
        int n =10;
        for (int a =0;a<n; a++){
            for (int b =n-1;b>=a;b--){
                System.out.print(" ");
            }
            for (int c=0;c<=a;c++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }


    }
}
