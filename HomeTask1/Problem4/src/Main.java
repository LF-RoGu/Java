// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String l_strText = "To be or not to be, that is the question;"
                +" Whether `tis nobler in the mind to suffer"
                +" the slings and arrows of outrageous fortune,"
                +" or to take arms against a sea of troubles,"
                +" and by opposing end them?";
        /* Change all characters to lower case */
        String l_strLowerCaseText = l_strText.toLowerCase();
        /* Remove non alphabetic characters */
        l_strLowerCaseText = l_strLowerCaseText.replaceAll(";", " ");
        l_strLowerCaseText = l_strLowerCaseText.replaceAll(",", " ");

        String[] l_strBubbleSortText = l_strLowerCaseText.split(" ");

        String l_strTemporalStoreWord = "";
        char l_charLetterFromText;

        boolean l_boolIsWordOrSpace = false;

        fillArrayLoop:
        for(int i = 0; i < (l_strBubbleSortText.length - 1); i++)
        {
            for(int j = 0; j < (l_strBubbleSortText.length - i - 1); j++)
            {
                if( (l_strBubbleSortText[j].compareTo(l_strBubbleSortText[j+1]) > 0) )
                {
                    l_strTemporalStoreWord = l_strBubbleSortText[j];
                    l_strBubbleSortText[j] = l_strBubbleSortText[j+1];
                    l_strBubbleSortText[j+1] = l_strTemporalStoreWord;
                }
                else
                {
                    /*
                    Do Nothing
                     */
                }
            }
        }
        for(int i = 0; i < l_strBubbleSortText.length; i++)
        {
            System.out.println(l_strBubbleSortText[i]);
        }
    }
}