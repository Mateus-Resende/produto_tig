package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import code.Procura;
import dic.Dicionario;

public class BinarySearchTests {
	
	Procura p;
	Dicionario d;
	
	
	@Before
	public void setup(){
		p = new Procura();
		d = new Dicionario();
		
	}

	@Test
	public void testZulus() {	
		boolean expected = true;
		boolean actual = p.procuraBinaria("zulus");
		assertTrue("The word was not found", actual == expected);
	}
	
	@Test
	public void testAardvark() {	
		boolean expected = true;
		boolean actual = p.procuraBinaria("aardvark");
		assertTrue("The word was not found", actual == expected);
	}
	
	@Test
	public void testMiddle() {	
		ArrayList<String> palavras = d.construirDic();
		int meio = palavras.size() / 2;
		String palavraDoMeio = palavras.get(meio);
		boolean expected = true;
		boolean actual = p.procuraBinaria(palavraDoMeio);
		assertTrue("The word was not found", actual == expected);
	}
	
	@Test
	public void testNotFound() {
		boolean expected = false;
		boolean actual = p.procuraBinaria("naoexiste");
		assertTrue("The word shouldn't have been found.", actual == expected);
	}
	
	@Test
	public void regularWord() {
		boolean expected = true;
		boolean actual = p.procuraBinaria("light");
		assertTrue("The word was not found", actual == expected);
	}
	

}
