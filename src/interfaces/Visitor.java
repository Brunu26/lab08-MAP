package interfaces;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Trapezio;
import entidades.Triangulo;

public interface Visitor {

	public double visitarCirculo(Circulo c);
	
	public double visitarRetangulo(Retangulo r);
	
	public double visitarTriangulo(Triangulo tg);
	
	public double visitarTrapezio(Trapezio tp);
	
}
