//wap to accept msg on serverside and send it to client

import java.net.*;
import java.io.*;

class smesg {
    public static void main(String[] args) throws UnknownHostException, IOException {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server started");
        Socket s = ss.accept();
        System.out.println("Client started");

        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter message to send");
        String msg = dis.readLine();

    }
}