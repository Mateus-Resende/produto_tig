package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import code.Procura;
import dic.Dicionario;

public class SequentialTests {
	

	Procura p;
	Dicionario d;
	
	@Before
	public void setup(){
		p = new Procura();
		d = new Dicionario();
	}

	@Test
	public void sequentialTestLastWord() {
		boolean expected = true;
		boolean actual = p.procuraSequencial("zulus");
		assertTrue("The word was not found", actual == expected);
	}
	
	@Test
	public void sequentialTestFirstWord() {
		boolean expected = true;
		boolean actual = p.procuraSequencial("aardvark");
		assertTrue("The word was not found",actual == expected);
	}
	
	@Test
	public void sequentialTestNotFount(){
		boolean expected = false;
		boolean actual = p.procuraSequencial("notfound");
		assertTrue("The word shouldn't have been found.", actual == expected);
	}
	
	@Test
	public void sequentialTestMiddleWord(){
		ArrayList<String> palavras = d.construirDic();
		boolean expected = true;
		boolean actual = p.procuraSequencial(palavras.get(palavras.size()/2));
		assertTrue("The word was not found.", actual == expected);
	}

}
