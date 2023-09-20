// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/* Import Scanner lib so work can be done in IntelliJ */
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args)
    {
        /* State machine object creation */
        StateMachine l_stateMachine = new StateMachine();
        /* Boolean flag to keep the state machine running */
        boolean l_varInfiniteCycle = true;
        /* Scanner to work in local environment */
        Scanner l_varScanner = new Scanner(System.in);
        int l_varClassCarsLength = 0;
        int l_varClassCarsArrayCounter = 0;
        StateMachine.e_stateMachine l_currentState = StateMachine.e_stateMachine.IDLE;

        int l_varStoreInFileOption = 0;

        System.out.println("Number of cars information to register: ...");
        l_varClassCarsLength = Integer.parseInt(l_varScanner.next());
        if(l_varClassCarsLength != 0)
        {
            System.out.println("-------------------------------------");
        }
        else
        {
            System.out.println("No info to be added...");
            l_varInfiniteCycle = false;
        }
        /* Create class array of n positions */
        Cars[] l_classCarsArrayObj = new Cars[l_varClassCarsLength];

        do
        {
            switch (l_stateMachine.getCurrentState()) {
                case IDLE -> {
                    System.out.println("-------------------------------------");
                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CAR_ID);
                }
                case CAR_ID -> {
                    l_classCarsArrayObj[l_varClassCarsArrayCounter] = new Cars();
                    System.out.print("CAR ID -> ");
                    l_classCarsArrayObj[l_varClassCarsArrayCounter].setVarCarsId(Integer.parseInt(l_varScanner.next()));
                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CAR_MODEL);
                }
                case CAR_MODEL -> {
                    System.out.print("CAR MODEL -> ");
                    l_classCarsArrayObj[l_varClassCarsArrayCounter].setVarCarModel(l_varScanner.next());
                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CAR_YEAR);
                }
                case CAR_YEAR -> {
                    System.out.print("CAR YEAR -> ");
                    l_classCarsArrayObj[l_varClassCarsArrayCounter].setVarCarYear(Integer.parseInt(l_varScanner.next()));
                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CAR_COLOR);
                }
                case CAR_COLOR -> {
                    System.out.print("CAR COLOR -> ");
                    l_classCarsArrayObj[l_varClassCarsArrayCounter].setVarCarColor(l_varScanner.next());
                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CAR_PRICE);
                }
                case CAR_PRICE -> {
                    System.out.print("CAR PRICE -> ");
                    l_classCarsArrayObj[l_varClassCarsArrayCounter].setVarCarPrice(Integer.parseInt(l_varScanner.next()));
                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CAR_REGISNUM);
                }
                case CAR_REGISNUM -> {
                    System.out.print("CAR REGISTRATION NUMBER -> ");
                    l_classCarsArrayObj[l_varClassCarsArrayCounter].setVarCarRegistrationNumber(Integer.parseInt(l_varScanner.next()));
                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CHECK_INPUT);
                }
                case CHECK_INPUT -> {
                    l_varClassCarsArrayCounter++;
                    if (l_varClassCarsArrayCounter != l_varClassCarsLength) {
                        l_stateMachine.stm_NextState(StateMachine.e_stateMachine.IDLE);
                    } else {
                        l_stateMachine.stm_NextState(StateMachine.e_stateMachine.STORE_IN_FILE);
                    }
                }
                case STORE_IN_FILE -> {
                    System.out.println("""
                            Choose one of the following options
                            1. Store vehicles by brand.
                            2. Store in file vehicles by years of usen
                            3. Store in file vehicles by year of manufacture
                            4. Store in file vehicles by price (higer to lower)""");
                    l_varStoreInFileOption = Integer.parseInt(l_varScanner.next());
                    switch (l_varStoreInFileOption)
                    {
                        case 1 ->
                        {
                            CreateFile(l_varStoreInFileOption, "");
                        }
                        case 2 ->
                        {

                        }
                        case 3 ->
                        {

                        }
                        case 4 ->
                        {

                        }
                        default ->
                        {

                        }
                    }
                }
                case EXIT -> {
                    System.out.println("Operations finished");
                    l_varInfiniteCycle = false;
                }
            }
        }while (l_varInfiniteCycle);
    }
    static void CreateFile(int opFileCreation, String strText)
    {
        try
        {
            switch (opFileCreation) {
                case 1 -> {
                    File file2createBrand = new File("E:\\Java_WorkSpace\\Java\\HomeTask2\\HomeTask2\\HomeTaskFiles\\carBrand.txt");
                    if (file2createBrand.createNewFile()) {
                        System.out.println("File created as... " + file2createBrand.getName());
                        try {
                            FileWriter file2writeBrand = new FileWriter("carBrand.txt");
                            file2writeBrand.write(strText);
                            file2writeBrand.close();
                            System.out.println("Successfully write in file " + file2createBrand.getName());
                        }catch (IOException e)
                        {
                            System.out.println("An error ocurred");
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("File already existed");
                    }
                }
                case 2 -> {
                    File file2createUseYears = new File("E:\\Java_WorkSpace\\Java\\HomeTask2\\HomeTask2\\HomeTaskFiles\\carUseYears.txt");
                    if (file2createUseYears.createNewFile()) {
                        System.out.println("File created as... " + file2createUseYears.getName());
                        try {
                            FileWriter file2writeUseYears = new FileWriter("carUseYears.txt");
                            file2writeUseYears.write(strText);
                            file2writeUseYears.close();
                            System.out.println("Successfully write in file " + file2createUseYears.getName());
                        }catch (IOException e)
                        {
                            System.out.println("An error ocurred");
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("File already existed");
                    }
                }
                case 3 -> {
                    File file2createYear = new File("E:\\Java_WorkSpace\\Java\\HomeTask2\\HomeTask2\\HomeTaskFiles\\carYear.txt");
                    if (file2createYear.createNewFile()) {
                        System.out.println("File created as... " + file2createYear.getName());
                        try {
                            FileWriter file2WriteYears = new FileWriter("carYears.txt");
                            file2WriteYears.write(strText);
                            file2WriteYears.close();
                            System.out.println("Successfully write in file " + file2createYear.getName());
                        }catch (IOException e)
                        {
                            System.out.println("An error ocurred");
                            e.printStackTrace();
                        }
                    }
                    else {
                        System.out.println("File already existed");
                    }
                }
                case 4 -> {
                    File file2createPrice = new File("E:\\Java_WorkSpace\\Java\\HomeTask2\\HomeTask2\\HomeTaskFiles\\carPrice.txt");
                    if (file2createPrice.createNewFile()) {
                        System.out.println("File created as... " + file2createPrice.getName());
                        try {
                            FileWriter file2WritePrice = new FileWriter("carPrice.txt");
                            file2WritePrice.write(strText);
                            file2WritePrice.close();
                            System.out.println("Successfully write in file " + file2createPrice.getName());
                        }catch (IOException e)
                        {
                            System.out.println("An error ocurred");
                            e.printStackTrace();
                        }
                    }
                    else {
                        System.out.println("File already existed");
                    }
                }
                default -> System.out.println("No option selected");
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}