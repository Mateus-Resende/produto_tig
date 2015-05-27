package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import code.Procura;
import dic.Dicionario;

public class SequentialSearchTests {
	
	Procura p;
	Dicionario d;
	
	
	@Before
	public void setup(){
		p = new Procura();
		d = new Dicionario();
		
	}

	@Test
	public void testSequentialZulus() {	
		Boolean expected = true;
		Boolean actual = p.procuraSequencial("zulus").containsValue(true);
		assertTrue("The word was not found", actual == expected);
	}
	
	@Test
	public void testSequentialAardvark() {	
		boolean expected = true;
		boolean actual = p.procuraSequencial("aardvark").containsValue(true);
		assertTrue("The word was not found", actual == expected);
	}
	
	@Test
	public void testSequentialMiddle() {	
		ArrayList<String> palavras = d.construirDic();
		int meio = palavras.size() / 2;
		String palavraDoMeio = palavras.get(meio);
		boolean expected = true;
		boolean actual = p.procuraSequencial(palavraDoMeio).containsValue(true);
		assertTrue("The word was not found", actual == expected);
	}
	
	@Test
	public void testSequentialNotFound() {
		boolean expected = false;
		boolean actual = p.procuraSequencial("naoexiste").containsValue(false);
		assertTrue("The word shouldn't have been found.", actual == expected);
	}
	
	@Test
	public void testSequentialRegularWord() {
		HashMap<Boolean, Long> x = p.procuraSequencial("light");
		Boolean compare = new Boolean(true);
		System.out.println(x.get(0));
		boolean expected = true;
		boolean actual = x.containsValue(true);
		assertTrue("The word was not found", actual == expected);
	}
	

}
