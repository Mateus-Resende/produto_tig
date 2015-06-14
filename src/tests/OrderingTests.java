package tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import code.Ordena;
import dic.Dicionario;

public class OrderingTests {

	Ordena o;
	Dicionario d;
	String[] words;

	@Before
	public void setup() {
		d = new Dicionario();
		words = d.construirDic();
		o = new Ordena(words);
	}

	@Test
	public void testShuffleWords() {
		String[] shuffled = o.embaralhaPalavras(words);
		String expected = "aardvark";
		String actual = shuffled[0];
		assertFalse("The word " + expected + " was found at " + actual,
				actual == expected);
	}

	@Test
	public void testOrderInsertionZulus() {
		o.embaralhaPalavras(words);
		o.ordenaInsercao();
		int expected = 58109;
		int actual = Arrays.asList(words).indexOf("zulus");
		assertTrue("Expected to find the word zulus at " + expected
				+ ", but it was found at " + actual, actual == expected);
	}

	@Test
	public void testOrderInsertionAardvark() {
		o.embaralhaPalavras(words);
		o.ordenaInsercao();
		int expected = 0;
		int actual = Arrays.asList(words).indexOf("aardvark");
		assertTrue("Expected to find the word aadvark at " + expected
				+ ", but it was found at " + actual, actual == expected);
	}

	@Test
	public void testOrderSelectionZulus() {
		o.embaralhaPalavras(words);
		o.ordenaSelecao();
		int expected = words.length-1;
		int actual = Arrays.asList(words).indexOf("zulus");
		assertTrue("Expected to find the word zulus at " + expected
				+ ", but it was found at " + actual, actual == expected);
	}

	@Test
	public void testOrderSelectionAardvark() {
		o.embaralhaPalavras(words);
		o.ordenaSelecao();
		int expected = 0;
		int actual = Arrays.asList(words).indexOf("aardvark");
		assertTrue("Expected to find the word aardvark at " + expected
				+ ", but it was found at " + actual, actual == expected);
	}



}
