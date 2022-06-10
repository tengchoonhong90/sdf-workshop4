package vttp2022.fortunecookie;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main (String[] args) {
        try {
            // String message = generateCookie();
            Integer port = 12345;
            ServerSocket ss = new ServerSocket(port);
            Socket s=ss.accept();//establishes connection   
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String  str=(String)dis.readUTF();
            System.out.println("message= "+str);
            ss.close();
    
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
