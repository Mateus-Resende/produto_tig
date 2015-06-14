package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.Ordena;
import dic.Dicionario;

public class OrderingTests {

	Ordena o;
	Dicionario d;

	@Before
	public void setup() {
		d = new Dicionario();
		o = new Ordena(d);
		o.embaralhaPalavras();
	}

	@Test
	public void testOrderInsertionZulus() {
		o.ordenaInsercao();
		int expected = 0;
		int actual = o.getWord("zulus");
		assertTrue("Expected to find the word zulus at " + expected
				+ ", but it was found at " + actual, actual == expected);
	}

	@Test
	public void testOrderInsertionAardvark() {
		o.ordenaInsercao();
		int expected = d.size() - 1;
		int actual = o.getWord("aardvark");
		assertTrue("Expected to find the word aadvark at " + expected
				+ ", but it was found at " + actual, actual == expected);	}
	
	@Test
	public void testOrderSelectionZulus() {
		o.ordenaSelecao();
		int expected = -1;
		int actual = o.getWord("zulus");
		assertTrue("Expected to find the word zulus at " + expected
				+ ", but it was found at " + actual, actual == expected);
	}
	
	@Test
	public void testOrderSelectionAardvark() {
		o.ordenaSelecao();
		int expected = d.size() - 1;
		int actual = o.getWord("aardvark");
		assertTrue("Expected to find the word aardvark at " + expected
				+ ", but it was found at " + actual, actual == expected);
	}
	
	@Test
	public void testOrderQuickSortZulus() {
		o.ordenaQuickSort();
		int expected = 0;
		int actual = o.getWord("zulus");
		assertTrue("Expected to find the word zulus at " + expected
				+ ", but it was found at " + actual, actual == expected);
	}
	
	@Test
	public void testOrderQuickSortAardvark() {
		o.ordenaQuickSort();
		int expected = d.size() - 1;
		int actual = o.getWord("aardvark");
		assertTrue("Expected to find the word aardvark at " + expected
				+ ", but it was found at " + actual, actual == expected);
	}

}
