package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.Procura;
import dic.Dicionario;

public class BinarySearchTests {
	
	Procura p;
	Dicionario d;
	
	@Before
	public void setup(){
		d = new Dicionario();
		p = new Procura(d);
	}

	@Test
	public void testZulus() {	
		int expected = 58109;
		int actual = p.procuraBinaria("zulus");
		assertTrue("The word was not found", actual == expected);
	}
	
	@Test
	public void testAardvark() {	
		int expected = 0;
		int actual = p.procuraBinaria("aardvark");
		assertTrue("The word was not found", actual == expected);
	}
	
	@Test
	public void testMiddle() {	
		String[] palavras = d.construirDic();
		int meio = palavras.length / 2;
		String palavraDoMeio = palavras[meio];
		int expected = meio;
		int actual = p.procuraBinaria(palavraDoMeio);
		assertTrue("The word was not found", actual == expected);
	}
	
	@Test
	public void testNotFound() {
		int expected = -1;
		int actual = p.procuraBinaria("naoexiste");
		assertTrue("The word shouldn't have been found.", actual == expected);
	}
	
	@Test
	public void regularWord() {
		int expected = 29426;
		int actual = p.procuraBinaria("light");
		assertTrue("The word was not found", actual == expected);
	}
	

}
