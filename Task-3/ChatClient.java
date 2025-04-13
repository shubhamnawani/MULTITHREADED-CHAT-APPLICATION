import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 1234);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            Thread send = new Thread(() -> {
                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    while (true) {
                        String msg = br.readLine();
                        dos.writeUTF(msg);
                        if (msg.equals("exit")) break;
                    }
                } catch (Exception e) {
                }
            });

            Thread receive = new Thread(() -> {
                try {
                    while (true) {
                        String msg = dis.readUTF();
                        System.out.println("Message: " + msg);
                    }
                } catch (Exception e) {
                }
            });

            send.start();
            receive.start();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
