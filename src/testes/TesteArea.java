package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Trapezio;
import entidades.Triangulo;
import interfaces.Visitor;
import operacoes.CalcularArea;

class TesteArea {
	
	Visitor visitaArea = new CalcularArea();
	Circulo c = new Circulo(5);
	Retangulo r = new Retangulo(6,3);
	Trapezio tp = new Trapezio(2,3,1,1,1);
	Triangulo tg = new Triangulo(4,2,3,3);
	
	@Test
	public void areaCirculo() {
		c.aceitaVisita(visitaArea);
		assertEquals(31.4, 2 * 3.14 * c.getRaio(), 1);
	}
	@Test
	public void areaRetangulo() {
		r.aceitaVisita(visitaArea);
		assertEquals(18, r.getAltura()*r.getLargura(),0);
		
	}
	@Test
	public void areaTrapezio() {
		tp.aceitaVisita(visitaArea);
		assertEquals(2, (tp.getAltura() *( tp.getBaseMaior()+ tp.getBaseMaior()))/2, 0);
	}
	@Test
	public void areaTriangulo() {
		tg.aceitaVisita(visitaArea);
		assertEquals(4, (tg.getBase() * tg.getAltura())/2, 0);
	}
	
}
