package main.java.http.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {
    public static void main(String[] args) {
        Socket socket = null;
        InputStream in = null;
        OutputStream out = null;
        try {
            ServerSocket serverSocket = new ServerSocket(3001, 3);
            System.out.println("Server has been set up at port " + serverSocket.getLocalPort());
            while (true) {
                socket = serverSocket.accept();
                System.out.println("Get the connection");
                out = socket.getOutputStream();
                out.write(("Hello " + socket.getPort()).getBytes());
                Thread.sleep(2000);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SimpleWevClient extends Thread {
    private Socket socket;

    SimpleWevClient(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStreamReader in = new InputStreamReader(socket.getInputStream());
            char[] bs = new char[2048];
            PrintStream out = new PrintStream(socket.getOutputStream());
            StringBuilder msg = new StringBuilder();

            socket.setSoTimeout(1000);

            int len = -1;
            try {
                while ((len = in.read(bs)) != -1) {
                    msg.append(bs, 0, len);
                    msg.append("¥n");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type:text/html;charset:UTF-8");
            out.println();
            out.println("<h1>Hello Server</h1>");
            out.flush();
            out.close();
            in.close();
            System.out.println("Unconnected");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
