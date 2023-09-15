import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    public enum e_stateMachine
    {
        IDLE,
        START,
        NAME,
        SURNAME,
        AGE,
        SPORT,
        AWARDS,
        EXIT
    }
    public static void main(String[] args)
    {
        boolean l_varInfiniteCycle = true;
        StateMachine l_stateMachine = new StateMachine();

        String[][] l_varParticipantsInfo = {
                {"Luis", "Paco", "Pedro"},
                {"Perez", "Rios", "Ley"},
                {"20","25","23"},
                {"Tenis", "Padel", "Futbol"},
                {"3", "2", "5"}
        };
        int l_varNumberOfParticipants = 0;
        int l_arrNumberOfParticipants = 0;
        e_stateMachine l_currentState = e_stateMachine.IDLE;

        Scanner l_varScanner = new Scanner(System.in);
        System.out.printf("Add total number of students to add: ");
        /* Total number of students to add */
        l_varNumberOfParticipants = 3;

        /* Create N list */
        Participants[] l_classParticipants = new Participants[l_varNumberOfParticipants];

        if(l_varNumberOfParticipants != 0)
        {
            l_stateMachine.stm_NextState(StateMachine.e_stateMachine.START);
        }
        else
        {
            System.out.println("No user to add");
        }

        while(l_varInfiniteCycle)
        {
            if(l_varNumberOfParticipants != 0)
            {
                switch (l_stateMachine.getCurrentState())
                {
                    case IDLE:
                        break;
                    case START:
                        System.out.println("Entered Start State");
                        l_stateMachine.stm_NextState(StateMachine.e_stateMachine.NAME);
                        break;
                    case NAME:
                        l_classParticipants[l_arrNumberOfParticipants] = new Participants();
                        l_classParticipants[l_arrNumberOfParticipants].set_varUserName(l_varParticipantsInfo[0][l_arrNumberOfParticipants]);
                        l_stateMachine.stm_NextState(StateMachine.e_stateMachine.SURNAME);
                        break;
                    case SURNAME:
                        l_classParticipants[l_arrNumberOfParticipants].set_varUserSurname(l_varParticipantsInfo[1][l_arrNumberOfParticipants]);
                        l_stateMachine.stm_NextState(StateMachine.e_stateMachine.AGE);
                        break;
                    case AGE:
                        l_classParticipants[l_arrNumberOfParticipants].set_varUserAge(l_varParticipantsInfo[2][l_arrNumberOfParticipants]);
                        l_stateMachine.stm_NextState(StateMachine.e_stateMachine.SPORT);
                        break;
                    case SPORT:
                        l_classParticipants[l_arrNumberOfParticipants].set_varUserTypeOfSport(l_varParticipantsInfo[3][l_arrNumberOfParticipants]);
                        l_stateMachine.stm_NextState(StateMachine.e_stateMachine.AWARDS);
                        break;
                    case AWARDS:
                        l_classParticipants[l_arrNumberOfParticipants].set_varUserListOfAwards(l_varParticipantsInfo[4][l_arrNumberOfParticipants]);
                        l_stateMachine.stm_NextState(StateMachine.e_stateMachine.EXIT);
                        break;
                    case EXIT:
                        System.out.println("------------------------------------------------------------------------------");
                        System.out.println("Participant #" + l_arrNumberOfParticipants);
                        System.out.println("Name: " + l_classParticipants[l_arrNumberOfParticipants].get_varUserName());
                        System.out.println("Surname: " + l_classParticipants[l_arrNumberOfParticipants].get_varUserSurname());
                        System.out.println("Age: " + l_classParticipants[l_arrNumberOfParticipants].get_varUserAge());
                        System.out.println("Sport: " + l_classParticipants[l_arrNumberOfParticipants].get_varUserTypeOfSport());
                        System.out.println("No. Of Awards: " + l_classParticipants[l_arrNumberOfParticipants].get_varUserListOfAwards());
                        System.out.println("------------------------------------------------------------------------------");
                        l_arrNumberOfParticipants++;

                        if(l_varNumberOfParticipants == l_arrNumberOfParticipants)
                        {
                            l_varInfiniteCycle = false;
                        }
                        else
                        {
                            l_stateMachine.stm_NextState(StateMachine.e_stateMachine.NAME);
                        }
                        break;
                }
            }
        }

    }

    public static void sysMenu(e_stateMachine varOptionMenu)
    {

        switch (varOptionMenu)
        {
            case IDLE:
                break;
            case START:
                break;
            case NAME:
                break;
            case SURNAME:
                break;
            case AGE:
                break;
            case SPORT:
                break;
            case AWARDS:
                break;
            case EXIT:
                break;
        }
    }


}