package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Trapezio;
import entidades.Triangulo;
import interfaces.Visitor;
import operacoes.CalcularPerimetro;

class TestePerimetro {

	Visitor visitaPerimetro = new CalcularPerimetro();
	Circulo c = new Circulo(5);
	Retangulo r = new Retangulo(6,3);
	Trapezio tp = new Trapezio(2,3,1,1,1);
	Triangulo tg = new Triangulo(4,2,3,3);
	
	@Test
	public void perimetroCirculo() {
		c.aceitaVisita(visitaPerimetro);
		assertEquals(10, 2*c.getRaio(), 0);
	}

	@Test
	public void perimetroRetangulo() {
		r.aceitaVisita(visitaPerimetro);
		assertEquals(18, 2*(r.getAltura() + r.getLargura()),0);
	}
	
	@Test
	public void perimetroTrapezio() {
		tp.aceitaVisita(visitaPerimetro);
		assertEquals(7, (tp.getLado1()+ tp.getLado2() + tp.getBaseMaior() + tp.getBaseMenor()),0);
	}
	
	@Test
	public void perimetroTriangulo() {
		tg.aceitaVisita(visitaPerimetro);
		assertEquals(10, (tg.getLado1() + tg.getLado2() + tg.getBase()),0);
	}
}
