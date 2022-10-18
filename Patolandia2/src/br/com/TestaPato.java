package br.com;

public class TestaPato {
	public static void main(String[] args) {
		Pato patolino = new Pato();
		patolino.display();
		patolino.quack();
		patolino.nadar();
		
		System.out.println("-------------------");
		Pato patodonald = new PatoReal();
		patodonald.display();
		patodonald.quack();
		patodonald.nadar();
		
		System.out.println("-------------------");
		Pato tioPatinhas = new PatoVermelho();
		tioPatinhas.display();
		tioPatinhas.quack();
		tioPatinhas.nadar();
		
		System.out.println("-------------------");
		Pato patati = new PatoDeBorracha();
		patati.display();
		patati.quack();
		patati.nadar();
		
		System.out.println("-------------------");
		Pato patata = new PatoDeMadeira();
		patata.display();
		patata.quack();
		patata.nadar();
	}
}
