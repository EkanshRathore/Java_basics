//client side

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class combine {
    public static void main(String[] args) throws Exception, UnknownHostException, IOException {
        Socket s = new Socket("localhost", 5000);
        DataInputStream Dis = new DataInputStream(s.getInputStream());
        DataOutputStream Dos = new DataOutputStream(s.getOutputStream());
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        Dos.writeUTF(msg);
        Dis.readUTF();
        s.close();
        Dis.close();
        Dos.close();
    }
}