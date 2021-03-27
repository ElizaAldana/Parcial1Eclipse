package main;

import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import processing.core.PApplet;

public class Main extends PApplet{
	PApplet app;
	int xBall =1000;
	int yBall =1000;
	int r,g,b, tam;
	String datos = " ";
	boolean confirmar, confvista;
	ArrayList<Notes> rec;
	
	//Instancia
	private TCPConection conexion;
	
	public static void main(String[] args) {
		PApplet.main("main.Main");
	}

		public void settings() {
		size(750, 500);
	}

		public void setup() {
		rec = new ArrayList<Notes>();
		conexion = new TCPConection();
		conexion.setMain(this);
		conexion.start();
	}

	// Inifito
	public void draw() {
		background(255);
	
		if (confvista==true) {
			fill(255);
			rectMode(CENTER);
			rect(xBall, yBall+40,tam+200,tam+50);
			fill(r,g,b);
			ellipse(xBall, yBall, tam, tam);
			fill(0);
			//textMode(CENTER); no funciona
			text(datos, xBall-100, yBall+50);
		}
		if(confirmar==true) {
			for (int i = 0; i < rec.size(); i++) {
				int posX = rec.get(i).getPosX();
				int posY = rec.get(i).getPosY();
				int r = rec.get(i).getR();
				int g = rec.get(i).getG();
				int b = rec.get(i).getB();
				String datos = rec.get(i).getDatos();

				fill(255);
				rectMode(CENTER);
				rect(posX, posY+40,tam+200,tam+50);
				fill(r,g,b);
				ellipse(posX, posY, tam, tam);
				fill(0);
				text(datos, posX-100, posY+50);
			}
		}
	}
	
	public void poner(Notes nota) {
		xBall = nota.getPosX();
		yBall = nota.getPosY();
		r = nota.getR();
		g = nota.getG();
		b = nota.getB();
		tam = nota.getTam();
		datos = nota.getDatos();
		confirmar = nota.isConfirmar();
		confvista = nota.isConfvista();
		
		if (confirmar == true && confvista == false) {
			rec.add(new Notes(nota.getPosX(), nota.getPosY(), nota.getR(), nota.getG(), nota.getB(), nota.getTam(), nota.getDatos(), nota.isConfirmar(), nota.isConfvista()));
		}
		
	}
}
