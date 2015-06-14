package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.Procura;
import dic.Dicionario;

public class SequentialTests {
	

	Procura p;
	Dicionario d;
	
	@Before
	public void setup(){
		d = new Dicionario();
		p = new Procura(d);
	}

	@Test
	public void sequentialTestLastWord() {
		int expected = 58109;
		int actual = p.procuraSequencial("zulus");
		assertTrue("The word was not found", actual == expected);
	}
	
	@Test
	public void sequentialTestFirstWord() {
		int expected = 0;
		int actual = p.procuraSequencial("aardvark");
		assertTrue("The word was not found",actual == expected);
	}
	
	@Test
	public void sequentialTestNotFount(){
		int expected = -1;
		int actual = p.procuraSequencial("notfound");
		assertTrue("The word shouldn't have been found.", actual == expected);
	}
	
	@Test
	public void sequentialTestMiddleWord(){
		Dicionario dic = new Dicionario();
		String[] palavras = dic.construirDic();
		int expected = palavras.length / 2;
		int actual = p.procuraSequencial(palavras[(palavras.length/2)]);
		assertTrue("The word was not found.", actual == expected);
	}

}
