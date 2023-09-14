import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Participants> l_classParticipants = new ArrayList<Participants>();

        int l_varNumberOfParticipants = 0;

    }

    public static String getInputFromConsole(int currentYear)
    {
        String l_userName = "";
        String l_userDateOfBirth = "";
        int l_userAge = 0;

        l_userName = System.console().readLine("Name: ");

        System.out.println("Welcome " + l_userName);

        l_userDateOfBirth = System.console().readLine("Date Of Birth [Year]: ");
        l_userAge = currentYear - Integer.parseInt(l_userDateOfBirth);

        System.out.println("Input date of birth: " + l_userAge);

        return "";
    }
    public static void getInputFromScanner(int varNumberOfParticipants)
    {

        /* Scanner is an existing class to add information through console */
        Scanner l_varScanner = new Scanner(System.in);

        while

        System.out.printf("Name: ");
        l_userName = l_varScanner.nextLine();

        System.out.println("Welcome " + l_userName);

        System.out.printf("Date Of Birth [Year]: ");
        l_userDateOfBirth = l_varScanner.nextLine();
        l_userAge = currentYear - Integer.parseInt(l_userDateOfBirth);

        System.out.println("Input date of birth: " + l_userAge);
    }

}