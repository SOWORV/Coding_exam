package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Anagram anagram = new Anagram();
        String firstword = "ARMY";
        String secondword = "MARY";
        String thiredword = "CAT";
        String forthword = "ACT";

        System.out.println(anagramM(firstword, secondword));
        System.out.println(anagramM(thiredword, forthword));
        System.out.println(anagramM(secondword, forthword));
    }

    public static Boolean anagramM(String a, String b) {
        char[] arraytochararraya = a.toCharArray();
        char[] arraytochararrayb = b.toCharArray();
        Arrays.sort(arraytochararraya);
        Arrays.sort(arraytochararrayb);

        return (Arrays.equals(arraytochararraya, arraytochararrayb));

    }

}
