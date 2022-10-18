package br.com;

public class PatoReal extends Pato implements Voador, Grasnador{

	public PatoReal() {}

	public void display() {
		System.out.println("Oi, eu sou um Pato-Real!");
	}

	@Override
	public void quack() {
		System.out.println("Quack! Quack! Quack!");
		
	}

	@Override
	public void voar() {
		System.out.println("Estou voando...");
	}
}