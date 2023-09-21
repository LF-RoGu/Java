// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/* Import Scanner lib so work can be done in IntelliJ */
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Calendar;
import java.io.IOException;

public class Main {
    public enum e_fileCreation
    {
        CREATED,
        EXISTING,
        ERROR
    }
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

        int l_varStoreInFileOption = 0;
        int l_varCreatedFilesCntr = 0;

        /* Counter to keep record of how many files where created */
        int l_varFileCreatedCounter = 0;

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
                        l_varClassCarsArrayCounter = 0;
                        l_stateMachine.stm_NextState(StateMachine.e_stateMachine.STORE_IN_FILE);
                    }
                }
                case STORE_IN_FILE -> {
                    System.out.println("""
                            Choose one of the following options
                            1. Store vehicles by brand.
                            2. Store in file vehicles by years of use
                            3. Store in file vehicles by year of manufacture
                            4. Store in file vehicles by price (higer to lower)""");
                    l_varStoreInFileOption = Integer.parseInt(l_varScanner.next());
                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.FILE_CREATION);
                }
                case FILE_CREATION ->
                {
                    if((CreateFile(l_varStoreInFileOption, l_classCarsArrayObj, l_varClassCarsLength, l_varCreatedFilesCntr)) == e_fileCreation.EXISTING)
                    {
                        l_stateMachine.stm_NextState(StateMachine.e_stateMachine.FILE_CREATION);
                        l_varCreatedFilesCntr++;
                    }
                    else
                    {
                        l_stateMachine.stm_NextState(StateMachine.e_stateMachine.EXIT);
                    }
                }
                case EXIT -> {
                    System.out.println("Operations finished");
                    l_varInfiniteCycle = false;
                }
            }
        }while (l_varInfiniteCycle);
    }
    static e_fileCreation CreateFile(int opFileCreation, Cars[] strText, int varObjLenght, int varCreatedFilesCntr)
    {
        int l_varObjLenght = 0;
        String l_strSufix = ".txt";
        int l_varCreatedFilesCntr = varCreatedFilesCntr;
        e_fileCreation l_varReturnValue = e_fileCreation.ERROR;
        try
        {
            switch (opFileCreation) {
                case 1 -> {
                    File file2createBrand = new File("E:\\Java_WorkSpace\\Java\\HomeTask2\\HomeTask2\\HomeTaskFiles\\carBrand" + Integer.toString(l_varCreatedFilesCntr) + l_strSufix);
                    if (file2createBrand.createNewFile()) {
                        System.out.println("File created as... " + file2createBrand.getName());
                        try {
                            /*
                            Open file already created to write expected information
                             */
                            FileWriter file2writeBrand = new FileWriter("E:\\Java_WorkSpace\\Java\\HomeTask2\\HomeTask2\\HomeTaskFiles\\carBrand" + Integer.toString(l_varCreatedFilesCntr) + l_strSufix);
                            /* Create object buffered so multiple information can be stored */
                            BufferedWriter info = new BufferedWriter(file2writeBrand);
                            while(l_varObjLenght < varObjLenght)
                            {
                                info.write(strText[l_varObjLenght].getVarCarModel());
                                info.newLine();
                                l_varObjLenght++;
                            }
                            info.close();
                            System.out.println("Successfully write in file " + file2createBrand.getName());
                            l_varReturnValue = e_fileCreation.CREATED;
                        }catch (IOException e)
                        {
                            System.out.println("An error ocurred");
                            l_varReturnValue = e_fileCreation.ERROR;
                        }
                    } else {
                        System.out.println("File already existed");
                        l_varReturnValue = e_fileCreation.EXISTING;
                    }
                }
                case 2 -> {
                    int l_varUsedYears = 0;
                    File file2createUseYears = new File("E:\\Java_WorkSpace\\Java\\HomeTask2\\HomeTask2\\HomeTaskFiles\\carUseYears.txt");
                    if (file2createUseYears.createNewFile()) {
                        System.out.println("File created as... " + file2createUseYears.getName());
                        try {
                            /*
                            Open file already created to write expected information
                             */
                            FileWriter file2writeUseYears = new FileWriter("carUseYears.txt");
                            /* Create object buffered so multiple information can be stored */
                            BufferedWriter info = new BufferedWriter(file2writeUseYears);
                            while(l_varObjLenght <= varObjLenght)
                            {
                                l_varUsedYears = currentYear() - Integer.parseInt(strText[l_varObjLenght].getVarCarModel());
                                info.write(Integer.toString(l_varUsedYears));
                                info.newLine();
                                l_varObjLenght++;
                            }
                            info.close();
                            System.out.println("Successfully write in file " + file2createUseYears.getName());
                            l_varReturnValue = e_fileCreation.CREATED;
                        }catch (IOException e)
                        {
                            System.out.println("An error ocurred");
                            l_varReturnValue = e_fileCreation.ERROR;
                        }
                    } else {
                        System.out.println("File already existed");
                        l_varReturnValue = e_fileCreation.EXISTING;
                    }
                }
                case 3 -> {
                    File file2createYear = new File("E:\\Java_WorkSpace\\Java\\HomeTask2\\HomeTask2\\HomeTaskFiles\\carYear.txt");
                    if (file2createYear.createNewFile()) {
                        System.out.println("File created as... " + file2createYear.getName());
                        try {
                            /*
                            Open file already created to write expected information
                             */
                            FileWriter file2WriteYears = new FileWriter("carYears.txt");
                            /* Create object buffered so multiple information can be stored */
                            BufferedWriter info = new BufferedWriter(file2WriteYears);
                            while(l_varObjLenght <= varObjLenght)
                            {
                                info.write(strText[l_varObjLenght].getVarCarModel());
                                info.newLine();
                                l_varObjLenght++;
                            }
                            info.close();
                            System.out.println("Successfully write in file " + file2createYear.getName());
                        }catch (IOException e)
                        {
                            System.out.println("An error ocurred");
                            l_varReturnValue = e_fileCreation.ERROR;
                        }
                    }
                    else {
                        System.out.println("File already existed");
                        l_varReturnValue = e_fileCreation.EXISTING;
                    }
                }
                case 4 -> {
                    File file2createPrice = new File("E:\\Java_WorkSpace\\Java\\HomeTask2\\HomeTask2\\HomeTaskFiles\\carPrice.txt");
                    if (file2createPrice.createNewFile()) {
                        System.out.println("File created as... " + file2createPrice.getName());
                        try {
                            /*
                            Open file already created to write expected information
                             */
                            FileWriter file2WritePrice = new FileWriter("carPrice.txt");
                            /* Create object buffered so multiple information can be stored */
                            BufferedWriter info = new BufferedWriter(file2WritePrice);
                            while(l_varObjLenght <= varObjLenght)
                            {
                                info.write(strText[l_varObjLenght].getVarCarModel());
                                info.newLine();
                                l_varObjLenght++;
                            }
                            info.close();
                            System.out.println("Successfully write in file " + file2createPrice.getName());
                        }catch (IOException e)
                        {
                            System.out.println("An error ocurred");
                            l_varReturnValue = e_fileCreation.ERROR;
                        }
                    }
                    else {
                        System.out.println("File already existed");
                        l_varReturnValue = e_fileCreation.EXISTING;
                    }
                }
                default -> System.out.println("No option selected");
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
        }
        return l_varReturnValue;
    }
    static int currentYear()
    {
        Calendar l_varCurrentTime = Calendar.getInstance();

        return l_varCurrentTime.get(Calendar.YEAR);
    }
}