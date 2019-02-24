package main.java.http.server.user;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class UserClient {
    public static void main(String[] args) {
        Socket clientSocket = null;
        ObjectInputStream objInpStrm = null;
        ObjectOutputStream objOupStrm = null;

        try {
            clientSocket = new Socket("localhost", 3300);
            System.out.println("Connected server at port " + clientSocket.getPort());

            // objInpStrm = new ObjectInputStream(clientSocket.getInputStream());
            objOupStrm = new ObjectOutputStream(clientSocket.getOutputStream());

            UserInfo userInfo = new UserInfo();
            Object obj = null;
            UserInfo feedBack = null;
            System.out.println("sdf");
            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.println("Input UserId:");
                String id = input.nextLine();

                System.out.println("Input UserPassword:");
                String psd = input.nextLine();

                userInfo.setUserId(id);
                userInfo.setUserPsd(psd);

                objOupStrm.writeObject(userInfo);
                objOupStrm.flush();
                System.out.println("Client Log: " + userInfo.getUserId() + "/" + userInfo.getUserPsd());

                Thread.sleep(2000);

                objInpStrm = new ObjectInputStream(clientSocket.getInputStream());
                obj = objInpStrm.readObject();
                if (obj != null) {
                    feedBack = (UserInfo) obj;
                    System.out.println("Response: " + feedBack.getUserId() + "/" + feedBack.getUserPsd());
                }

            }

        } catch (IOException | ClassNotFoundException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                objInpStrm.close();
                objOupStrm.close();

                clientSocket.close();
            } catch (NullPointerException | IOException fin) {
                fin.printStackTrace();
            }
        }

    }
}
