package vttp2022.fortunecookie;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {

    public static void main (String[] args) {

        try {
            Socket s = new Socket("localhost", 12345);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello");
            dout.flush();
            dout.close();
            s.close();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    
}
