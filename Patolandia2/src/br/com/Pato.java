package br.com;

public class Pato {
	Voador voador;
	Grasnador grasnador;
	
	public Pato() {}
	
	public void nadar() {
		System.out.println("Estou nadando...");
	}
	
	public void display() {
		System.out.println("Oi, eu sou um pato!");           
	}
	
	public void setVoador(Voador voador) {
		this.voador = voador;
		
	}
	
	public void setGrasnador(Grasnador grasnador) {
		this.grasnador = grasnador;
	}
	
	public void realizarQuack() {}
	public void realizarVoo() {}
}
