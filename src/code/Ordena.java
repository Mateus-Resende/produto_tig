package code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordena {

	public Ordena() {
	}

	public String[] ordenaInsercao(String[] _dicionario) {
		int j, i;
		String temp;
		for (i = 1; i < _dicionario.length; i++) {
			temp = _dicionario[i];
			for (j = i - 1; j >= 0 && temp.compareTo(_dicionario[j]) < 0; j--) {
				_dicionario[j + 1] = _dicionario[j];
			}
			_dicionario[1 + j] = temp;
		}
		return _dicionario;
	}

	public String[] ordenaSelecao(String[] _dicionario) {

		return _dicionario;
	}

	public String[] ordenaQuickSort(String[] _dicionario) {

		return _dicionario;
	}

	public String[] embaralhaPalavras(String[] _dicionario) {
		List<String> list = Arrays.asList(_dicionario);
		Collections.shuffle(list);
		return list.toArray(_dicionario);
	}
}
