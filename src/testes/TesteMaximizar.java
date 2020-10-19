package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Trapezio;
import entidades.Triangulo;
import interfaces.Visitor;
import operacoes.Maximizar;

class TesteMaximizar {
	
	Visitor visitaMax = new Maximizar();
	Circulo c = new Circulo(5);
	Retangulo r = new Retangulo(6,3);
	Trapezio tp = new Trapezio(2,3,1,1,1);
	Triangulo tg = new Triangulo(4,2,3,3);
	
	@Test
	public void maximizarCirculo() {
		c.aceitaVisita(visitaMax);
		assertEquals(10, c.getRaio());
	}
	
	@Test
	public void maximizarRetangulo() {
		r.aceitaVisita(visitaMax);
		assertEquals(6, r.getAltura(),0);
	}

	@Test
	public void maximizarTriangulo() {
		tg.aceitaVisita(visitaMax);
		assertEquals(4, tg.getAltura(),0);
	}
	@Test
	public void maximizarTrapezio() {
		tp.aceitaVisita(visitaMax);
		assertEquals(2, tp.getAltura(),0);
	}
}
