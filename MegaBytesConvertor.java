public class MegaBytesConvertor
{
public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        System.out.println(kiloBytes + " KB = " + kiloBytes / 1024 + " MB and " + kiloBytes %1024 + " KB ");

        if (kiloBytes < 0)
        {
            System.out.println(" Invalid value" );
        }
    }

    public static void main(String[] args)
    {
        printMegaBytesAndKiloBytes(-5);
    }
}
