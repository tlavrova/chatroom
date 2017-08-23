package com.github.tlavrova.chatroom;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    private static ArrayList<Socket> clients;
    private ServerSocket server;
    DataOutputStream os;
    DataInputStream in;
    Socket s;

    public server1() throws IOException {
        server = new ServerSocket(8080);
        clients = new ArrayList<Socket>();
        System.out.println("Waiting for connections...");
        runOutput();
    }

    public void addClient() throws IOException {
        
    }

    private void runOutput() {
    }
}
