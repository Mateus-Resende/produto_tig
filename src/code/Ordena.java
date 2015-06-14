package code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordena {

	String[] _dicionario;

	public Ordena(String[] dic) {
		_dicionario = dic;
	}

	public String[] ordenaInsercao() {
		int j, i;
		String temp;
		for (i = 1; i < _dicionario.length; i++) { // iteração sobre o vetor
													// completo
			temp = _dicionario[i];
			for (j = i - 1; j >= 0 && temp.compareTo(_dicionario[j]) < 0; j--) { // procura
																					// um
																					// elemento
																					// menor
				_dicionario[j + 1] = _dicionario[j]; // move todos os elementos
														// para a direita
														// enquanto o elemento
														// procurado for menor
			}
			_dicionario[1 + j] = temp; // move o elemento para a posição em que
										// ele é o menor.
		}
		return _dicionario;
	}

	public String[] ordenaSelecao() {
		int x, y, primeiro;
		String aux;
		for (x = _dicionario.length - 1; x > 0; x--) {
			primeiro = 0; // inicializa o primeiro elemento
			for (y = 1; y <= x; y++) { // procura a 'menor palavra' no vetor
										// restante
				if (_dicionario[y].compareTo(_dicionario[primeiro]) > 0) {
					primeiro = y;
				}
			}
			aux = _dicionario[primeiro]; // realiza as trocas
			_dicionario[primeiro] = _dicionario[x];
			_dicionario[x] = aux;
		}
		return _dicionario;
	}

	public String[] embaralhaPalavras(String[] _dicionario) {
		List<String> list = Arrays.asList(_dicionario);
		Collections.shuffle(list);
		return list.toArray(_dicionario);
	}
}
