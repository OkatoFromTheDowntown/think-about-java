package main.java.http.server.user;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UserServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3300);
            System.out.println("Started server at port " + serverSocket.getLocalPort());
            while (true) {
                authorize(serverSocket.accept());

                Thread.sleep(2000);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void authorize(final Socket socket) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ObjectInputStream objInpStrm = null;
                ObjectOutputStream objOupStrm = null;

                try {
                    objInpStrm = new ObjectInputStream(socket.getInputStream());
                    objOupStrm = new ObjectOutputStream(socket.getOutputStream());

                    Object obj = objInpStrm.readObject();
                    UserInfo userInfo = (UserInfo) obj;

                    System.out.println("Server Log: " + userInfo.getUserId() + "/" + userInfo.getUserPsd());

                    objOupStrm.writeObject(userInfo);
                    objOupStrm.flush();

                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        objInpStrm.close();
                        objOupStrm.close();

                        socket.close();
                    } catch (NullPointerException | IOException fin) {
                        fin.printStackTrace();
                    }
                }

            }
        }).start();
    }
}
