package entidades;

import interfaces.ElementoConcreto;
import interfaces.Visitor;

public class Circulo implements ElementoConcreto{

	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	
	@Override
	public String toString() {
		return "Raio: " + raio ;
	}

	@Override
	public void aceitaVisita(Visitor v) {
		v.visitarCirculo(this);
		
	}
	
	
}
