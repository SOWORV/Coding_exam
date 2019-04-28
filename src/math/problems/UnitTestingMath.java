package math.problems;

import org.testng.Assert;

public class  UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        int a = 6;
        int b =7;
        int c = a+b;
        Assert.assertEquals(c,13);

    }
}
