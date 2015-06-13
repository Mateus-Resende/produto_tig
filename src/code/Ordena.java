package code;

import java.util.ArrayList;

public class Ordena {

	ArrayList<String> _dicionario;

	public Ordena(ArrayList<String> dicionario) {
		_dicionario = dicionario;
	}

	public String[] ordenaInsercao() {
		String[] array = new String[_dicionario.size()];
		array = _dicionario.toArray(array);
		int j, i;
		String temp;
		for (i = 1; i < array.length; i++) {
			temp = array[i];
			for (j = i - 1; j >= 0 && temp.compareTo(array[j]) < 0; j--) {
				array[j+1] = array[j];
			}
			array[1+j] = temp;
		}
		return array;
	}

	public ArrayList<String> ordenaSelecao() {

		return _dicionario;
	}

	public ArrayList<String> ordenaQuickSort() {

		return _dicionario;
	}

	public boolean embaralhaPalavras() {

		return false;
	}
	
	public int indexOf(String s) {
		return _dicionario.indexOf(s);
	}

}
