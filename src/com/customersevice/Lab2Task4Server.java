package com.customersevice;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketImpl;
import java.util.Date;

public class Lab2Task4Server {
	
	private static final int PORT = 5000;

	public static void main(String[] args) throws IOException {
		
		ServerSocket listener = new ServerSocket(PORT);
		
		System.out.println("[SERVER] Waiting for client connection... ");
		Socket client = listener.accept();
		
		System.out.println("[SERVER] Connected to client! ");
		PrintWriter out = new PrintWriter(client.getOutputStream(), true);
		out.println((new Date()).toString());
		
		System.out.println("[SERVER] Sent date. Closing.");
		client.close();
		listener.close();
		
	}

}
