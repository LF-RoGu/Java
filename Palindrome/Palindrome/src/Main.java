import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String var = "hola";
        boolean resPalindrome;

        resPalindrome = isPalindrome("hooh");

        if(resPalindrome)
        {
            System.out.println("Input IS a palindrome");
        }
        else
        {
            System.out.println("Input is NOT a palindrome");
        }
    }

    public static boolean isPalindrome(String varPalindrome)
    {
        int countPalindrome = 0;
        int lenghtPalindrome = varPalindrome.length() - 1;
        String tempVar,tempVar2;
        for(int index = 0; index < varPalindrome.length(); index++)
        {
            tempVar = Character.toString(varPalindrome.charAt(index));
            tempVar2 = Character.toString(varPalindrome.charAt(lenghtPalindrome - index));
            if(Objects.equals(tempVar, new String(tempVar2)))
            {
                countPalindrome++;
            }
            else
            {
                /*
                Do nothing
                 */
            }

        }
        if(countPalindrome == varPalindrome.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}