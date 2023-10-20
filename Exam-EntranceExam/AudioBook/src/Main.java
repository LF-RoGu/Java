import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main
{
    public enum l_enumFileCreation
    {
        CREATED,
        EXISTING,
        ERROR
    }
    public static void main(String[] args) throws IOException {
        /*
        Create a folder to send the .txt files
         */
        l_enumFileCreation l_enumFolderCreationOption = FolderCreation();
        /* Counter to keep track of existing files */
        int l_intExistingFileCounter = 0;

        /* Amount of books to add */
        int l_intTotalBooks = 2;

        AudioBook[] l_classAudiobook = new AudioBook[l_intTotalBooks];

        Actor l_classActor_ArtOfWar = new Actor("Luis", "Rodriguez");
        Book l_classBook_ArtOfWar = new Book("Sun Tzu", "Art Of War", 288);
        AudioBook l_classAudiobook_ArtOfWar = new AudioBook(l_classActor_ArtOfWar, l_classBook_ArtOfWar, 308);
        l_classAudiobook[0] = l_classAudiobook_ArtOfWar;
        /*
        Logic for creating the files into folder, in this logic a counter is reset before entering (this for each code iteration)
        It keeps going unless we get a successful file creation
         */
        l_intExistingFileCounter = 0;
        do
        {
            l_intExistingFileCounter++;
            l_enumFolderCreationOption = CreateFile(l_classAudiobook[0], l_intExistingFileCounter);
        }while((l_enumFolderCreationOption != l_enumFileCreation.CREATED));

        Actor l_classActor_LasLegionesMalditas = new Actor("Carlos", "Bardem");
        Book l_classBook_LasLegionesMalditas = new Book("Santiago Posteguillo", "Las Legiones Malditas", 855);
        AudioBook l_classAudiobook_LasLegionesMalditas = new AudioBook(l_classActor_LasLegionesMalditas, l_classBook_LasLegionesMalditas, 506);
        l_classAudiobook[1] = l_classAudiobook_LasLegionesMalditas;

        /*
        Logic for creating the files into folder, in this logic a counter is reset before entering (this for each code iteration)
        It keeps going unless we get a successful file creation
         */
        l_intExistingFileCounter = 0;
        do
        {
            l_intExistingFileCounter++;
            l_enumFolderCreationOption = CreateFile(l_classAudiobook[1], l_intExistingFileCounter);
        }while((l_enumFolderCreationOption != l_enumFileCreation.CREATED));
    }

    static l_enumFileCreation FolderCreation()
    {
        /* Variable for return possible values */
        l_enumFileCreation l_varReturnValue = l_enumFileCreation.ERROR;
        /* getProperty -> is used to obtain the current directory that the project is being executed */
        String l_strCurrentDir = System.getProperty("user.dir");
        /* Folder name to separate all the generated '.txt' files */
        String l_strFolderName = "GenTxt";
        /* Full new path */
        String l_strFolderPath = l_strCurrentDir + File.separator + l_strFolderName;
        /* Object for new folder creation */
        File l_fldrNewFolder = new File(l_strFolderPath);

        if (!l_fldrNewFolder.exists()) {
            if (l_fldrNewFolder.mkdirs()) {
                l_varReturnValue = l_enumFileCreation.CREATED;
            } else {
                l_varReturnValue = l_enumFileCreation.ERROR;
            }

        } else {
            /* Folder already existing */
            l_varReturnValue = l_enumFileCreation.EXISTING;
        }
        return l_varReturnValue;
    }

    static l_enumFileCreation CreateFile(AudioBook varAudioBook, int varFileCounter) throws IOException
    {
        /* Variable for return possible values */
        l_enumFileCreation l_varReturnValue = l_enumFileCreation.ERROR;
        /* getProperty -> is used to obtain the current directory that the project is being executed */
        String l_strCurrentDir = System.getProperty("user.dir");
        /* Folder name to separate all the generated '.txt' files */
        String l_strFolderName = "GenTxt";
        /* File type extension */
        String l_strSufix = ".txt";
        /* Full new path */
        String l_strFilePath = l_strCurrentDir + File.separator + l_strFolderName + File.separator + varAudioBook.get_classBook().get_stringTitle() + Integer.toString(varFileCounter);


        File file2createBrand = new File(l_strFilePath + l_strSufix);
        if (file2createBrand.createNewFile())
        {
            System.out.println("File created as... " + file2createBrand.getName());
            try
            {
                /*
                Open file already created to write expected information
                 */
                FileWriter file2writeBrand = new FileWriter(l_strFilePath + l_strSufix);
                /* Create object buffered so multiple information can be stored */
                BufferedWriter info = new BufferedWriter(file2writeBrand);

                /* Add info to buffer and write into file */
                info.write("-------------------------------------");
                info.newLine();
                info.write("-> Book Title... " + varAudioBook.get_classBook().get_stringTitle());
                info.newLine();
                info.write("-> Book Author... " +  varAudioBook.get_classBook().get_stringAuthor());
                info.newLine();
                info.write("-> Book Number of pages...  " +  Integer.toString(varAudioBook.get_classBook().get_intNumPages()));
                info.newLine();
                info.write("-> AudioBook Actor... " + varAudioBook.get_classActor().get_stringName() + " " + varAudioBook.get_classActor().get_stringSurname());
                info.newLine();
                info.write("-> AudioBook Duration... " + varAudioBook.get_intDurationMinutes());
                info.newLine();

                /* Send info to .txt file and close file */
                info.close();
                System.out.println("Successfully write in file " + file2createBrand.getName());
                l_varReturnValue = l_enumFileCreation.CREATED;
            }catch (IOException e)
            {
                System.out.println("An error ocurred");
                l_varReturnValue = l_enumFileCreation.ERROR;
            }
        } else
        {
            System.out.println("File already existed");
            l_varReturnValue = l_enumFileCreation.EXISTING;
        }
        return l_varReturnValue;
    }
}