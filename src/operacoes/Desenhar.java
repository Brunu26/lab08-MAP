package operacoes;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Trapezio;
import entidades.Triangulo;
import interfaces.Visitor;

public class Desenhar implements Visitor{

	@Override
	public double visitarCirculo(Circulo c) {
		System.out.println("Circulo Desenhado!!!");
		return 0;
	}

	@Override
	public double visitarRetangulo(Retangulo r) {
		System.out.println("Retangulo Desenhado!!!");
		return 0;
	}

	@Override
	public double visitarTriangulo(Triangulo tg) {
		System.out.println("Triangulo Desenhado!!!");
		return 0;
	}

	@Override
	public double visitarTrapezio(Trapezio tp) {
		System.out.println("Trapezio Desenhado!!!");
		return 0;
	}

}
