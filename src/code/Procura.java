package code;

import dic.Dicionario;

public class Procura {

	String[] _dicionario;

	public Procura(Dicionario d) {
		_dicionario = d.construirDic();
	}

	public int procuraBinaria(String elemento) {
		int inicio = 0;
		int fim = _dicionario.length - 1;
		while (inicio <= fim) {
			int meio = (inicio + fim) / 2;
			int comparador = elemento.compareTo(_dicionario[meio]);
			if (comparador < 0) {
				fim = meio - 1;
			} else if (comparador > 0) {
				inicio = meio + 1;
			} else {
				return meio;
			}
		}
		return -1;
	}

	public int procuraSequencial(String elemento) {
		for (int i = 0; i < _dicionario.length; i++) {
			if (elemento.equals(_dicionario[i])) {
				return i;
			}
		}
		return -1;
	}
}
