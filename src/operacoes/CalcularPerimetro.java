package operacoes;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Trapezio;
import entidades.Triangulo;
import interfaces.Visitor;

public class CalcularPerimetro implements Visitor{

	@Override
	public double visitarCirculo(Circulo c) {
		System.out.println("Perimetro do Circulo: "+(2*c.getRaio()));
		return (2*c.getRaio());
	}

	@Override
	public double visitarRetangulo(Retangulo r) {
		System.out.println("Perimetro do Retangulo: "+2*(r.getAltura() + r.getLargura()));
		return 2*(r.getAltura() + r.getLargura());
	}

	@Override
	public double visitarTriangulo(Triangulo tg) {
		System.out.println("Perimetro do Triangulo: "+(tg.getLado1() + tg.getLado2() + tg.getBase()));
		return (tg.getLado1() + tg.getLado2() + tg.getBase());
	}

	@Override
	public double visitarTrapezio(Trapezio tp) {
		System.out.println("Perimetro do Trapezio: "+(tp.getLado1()+ tp.getLado2() + tp.getBaseMaior() + tp.getBaseMenor()));
		return (tp.getLado1()+ tp.getLado2() + tp.getBaseMaior() + tp.getBaseMenor());
	}

}
