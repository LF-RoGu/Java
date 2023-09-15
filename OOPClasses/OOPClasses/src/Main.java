public class Main
{
    public static void main(String[] args)
    {
        Students[] l_classStudent = new Students[3];

        l_classStudent[0] = new Students();
        l_classStudent[0].setUserName("Luis");

        System.out.println(l_classStudent[0].getUserName());
    }
}