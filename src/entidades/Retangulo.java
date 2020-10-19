package entidades;

import interfaces.ElementoConcreto;
import interfaces.Visitor;

public class Retangulo implements ElementoConcreto {

	private double largura;
	private double altura;
	
	public Retangulo(double largura, double altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

	@Override
	public String toString() {
		return "largura: " + largura + ", altura:" + altura;
	}

	@Override
	public void aceitaVisita(Visitor v) {
		v.visitarRetangulo(this);
		
	}
	
	
}
