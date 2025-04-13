import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    static Vector<ClientHandler> clients = new Vector<>();

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Server started");

            while (true) {
                Socket s = ss.accept();
                System.out.println("Client connected");
                DataInputStream dis = new DataInputStream(s.getInputStream());
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());

                ClientHandler client = new ClientHandler(s, dis, dos);
                clients.add(client);
                Thread t = new Thread(client);
                t.start();
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

class ClientHandler implements Runnable {
    Socket s;
    DataInputStream dis;
    DataOutputStream dos;
    boolean running;

    public ClientHandler(Socket s, DataInputStream dis, DataOutputStream dos) {
        this.s = s;
        this.dis = dis;
        this.dos = dos;
        this.running = true;
    }

    public void run() {
        while (running) {
            try {
                String msg = dis.readUTF();
                if (msg.equals("exit")) {
                    running = false;
                    this.s.close();
                    break;
                }
                for (ClientHandler c : ChatServer.clients) {
                    if (c != this) {
                        c.dos.writeUTF(msg);
                    }
                }
            } catch (Exception e) {
                running = false;
            }
        }
    }
}
