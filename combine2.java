import java.net.*;
import java.io.*;
import java.util.Scanner;

public class combine2 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        ServerSocket ss= new ServerSocket(5000);
        Socket S = s.accept();
        DataInputStream Dis = new DataInputStream(S.getInputStream());
        DataOutputStream Dos = new DataOutputStream(S.getOutputStream());
        String str1="";
        String str2="";
        do{

        }
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        Dos.writeUTF(msg);
        Dis.readUTF();
        s.close();
        Dis.close();
        Dos.close();
    }
}