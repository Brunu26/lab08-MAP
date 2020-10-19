package operacoes;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Trapezio;
import entidades.Triangulo;
import interfaces.Visitor;

public class Maximizar implements Visitor{

	@Override
	public double visitarCirculo(Circulo c) {
		c.setRaio(c.getRaio()*2);
		System.out.println(c +" Circulo Maximizado!!!");
		return c.getRaio();
	}

	@Override
	public double visitarRetangulo(Retangulo r) {
		r.setAltura(r.getAltura()*2);
		r.setLargura(r.getLargura()*2);
		System.out.println(r +" Retangulo Maximizado!!!");
		return r.getAltura();
	}

	@Override
	public double visitarTriangulo(Triangulo tg) {
		tg.setBase(tg.getBase()*2);
		tg.setLado1(tg.getLado1()*2);
		tg.setLado2(tg.getLado2()*2);
		tg.setAltura(tg.getAltura()*2);
		System.out.println("Triangulo Maximizado!!!");
		return tg.getAltura();
	}

	@Override
	public double visitarTrapezio(Trapezio tp) {
		tp.setAltura(tp.getAltura()*2);
		tp.setBaseMaior(tp.getBaseMaior()*2);
		tp.setBaseMenor(tp.getBaseMenor()*2);
		tp.setLado1(tp.getLado1()*2);
		tp.setLado2(tp.getLado2()*2);
		System.out.println("Trapezio maximizado!!!");
		return tp.getAltura();
	}

}
