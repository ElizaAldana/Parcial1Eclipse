package main;

public class Notes {

private int posX, posY, r, g, b, tam;
private String datos;
private boolean confirmar, confvista;
	
	public Notes(int posX, int posY, int r, int g, int b, int tam, String datos, boolean confirmar, boolean confvista) {
		this.posX = posX;
		this.posY = posY;
		this.r = r;
		this.g = g;
		this.b = b;
		this.tam = tam;
		this.datos = datos;
		this.confirmar = confirmar;
		this.confvista = confvista;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public String getDatos() {
		return datos;
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}

	public boolean isConfirmar() {
		return confirmar;
	}

	public void setConfirmar(boolean confirmar) {
		this.confirmar = confirmar;
	}

	public boolean isConfvista() {
		return confvista;
	}

	public void setConfvista(boolean confvista) {
		this.confvista = confvista;
	}
	
	
}

