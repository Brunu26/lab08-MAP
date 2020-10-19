package operacoes;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Trapezio;
import entidades.Triangulo;
import interfaces.Visitor;

public class CalcularArea implements Visitor{

	@Override
	public double visitarCirculo(Circulo c) {
		System.out.println("Area do Circulo: " +(2 * 3.14 * c.getRaio()));
		return (2 * 3.14 * c.getRaio());
		
	}

	@Override
	public double visitarRetangulo(Retangulo r) {
		System.out.println("Area do Retangulo: "+r.getAltura() * r.getLargura());
		return (r.getAltura() * r.getLargura());
		
	}

	@Override
	public double visitarTriangulo(Triangulo tg) {
		System.out.println("Area do Trapezio: " +(tg.getBase() * tg.getAltura())/2);
		return (tg.getBase() * tg.getAltura())/2;
		
	}

	@Override
	public double visitarTrapezio(Trapezio tp) {
		System.out.println("Area do Trapezio: "+(tp.getAltura() *( tp.getBaseMaior()+ tp.getBaseMaior()))/2);
		return (tp.getAltura() *( tp.getBaseMaior()+ tp.getBaseMaior()))/2;
		
	}

}
