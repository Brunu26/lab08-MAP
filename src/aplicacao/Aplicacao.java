package aplicacao;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Trapezio;
import entidades.Triangulo;
import interfaces.Visitor;
import operacoes.CalcularArea;
import operacoes.CalcularPerimetro;
import operacoes.Desenhar;
import operacoes.Maximizar;

public class Aplicacao {

	public static void main(String[] args) {
		Visitor visitarArea = new CalcularArea();
		Visitor visitarPer = new CalcularPerimetro();
		Visitor visitarMax = new Maximizar();
		Visitor visitarDes = new Desenhar();
		
		Circulo c = new Circulo(20);
		c.aceitaVisita(visitarArea);
		c.aceitaVisita(visitarPer);
		c.aceitaVisita(visitarDes);
		c.aceitaVisita(visitarMax);
		
		
		System.out.println("-------------------------------------------");
		
		Retangulo r = new Retangulo(5,7);
		r.aceitaVisita(visitarArea);
		r.aceitaVisita(visitarPer);
		r.aceitaVisita(visitarDes);
		r.aceitaVisita(visitarMax);
		

		System.out.println("-------------------------------------------");
		
		Triangulo tg = new Triangulo(4,2,3,3);
		tg.aceitaVisita(visitarArea);
		tg.aceitaVisita(visitarPer);
		tg.aceitaVisita(visitarMax);
		tg.aceitaVisita(visitarDes);
		
		System.out.println("-------------------------------------------");
		
		Trapezio tp = new Trapezio(2,3,1,1,1);
		tp.aceitaVisita(visitarArea);
		tp.aceitaVisita(visitarPer);
		tp.aceitaVisita(visitarMax);
		tp.aceitaVisita(visitarDes);
		
	}

}
