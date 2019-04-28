package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Palindrome palindrome = new Palindrome();
        String pal= "dad";
        palindrome.ispalindrome(pal);
    }
    public void ispalindrome (String palin){
        for (int a=0;a<palin.length()/2;a++){
            if (palin.charAt(a)==palin.charAt(palin.length()-a-1)){
                System.out.println("the word is palindrome");
            }else
                System.out.println("the word is not palindrome");
        }
    }
}
