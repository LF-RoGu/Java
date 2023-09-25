// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String l_strText = "To be or not to be, that is the question;"
                +"Whether `tis nobler in the mind to suffer"
                +" the slings and arrows of outrageous fortune,"
                +" or to take arms against a sea of troubles,"
                +" and by opposing end them?";
        String l_strLowerCaseText = l_strText.toLowerCase();
        /* From problem #3 we know that the number of spaces is 37, then the
        * total amount of words if exactly numberOfSpaces + 1 */
        String[] l_strAlphaOrderText = new String[38];
        String l_strTemporalStoreWord = "";
        char l_charLetterFromText;

        int l_intCounterForPosition = 0;

        /* Value for this variable will be FALSE if we are currently in a space */
        boolean l_boolIsWordOrSpace = false;

        for(int i = 0; i < l_strText.length(); i++)
        {
            l_charLetterFromText = l_strLowerCaseText.charAt(i);
            if(((int)l_charLetterFromText >= 97) || ((int)l_charLetterFromText <= 122))
            {
                l_boolIsWordOrSpace = true;
            }
            else
            {
                l_boolIsWordOrSpace = false;
            }
            if(l_boolIsWordOrSpace)
            {
                l_intCounterForPosition = (int)l_strTemporalStoreWord.charAt(0) - 97;
                if(l_intCounterForPosition < 0)
                {
                    l_intCounterForPosition = (int)l_strTemporalStoreWord.charAt(1) - 97;
                }
                else {
                        /*
                        Do Nothing
                         */
                }

                l_strAlphaOrderText[l_intCounterForPosition] = l_strTemporalStoreWord;
                l_strTemporalStoreWord = "";
            }
            else
            {
                l_strTemporalStoreWord += l_charLetterFromText;
            }
        }
    }
}