package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.google.gson.Gson;

public class TCPConection extends Thread{
	//La referencia del chismoso
	private Main ref;

			public void run () {
				try {
				ServerSocket server = new ServerSocket(5000);
				System.out.println("Esperando cliente...");
				Socket socket = server.accept();
				System.out.println("Cliente conectado");

				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();

				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader breader = new BufferedReader(isr);

				while (true) {
					
					System.out.println("Esperando mensaje...");
					String mensajeRecibido = breader.readLine(); 
					System.out.println(mensajeRecibido);
					Gson gson = new Gson();
					
					Notes b = gson.fromJson(mensajeRecibido, Notes.class);
					ref.poner(b);
	
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//(Metodo de suscripcion)
			public void setMain(Main main) {
				this.ref = main;
			}
}
