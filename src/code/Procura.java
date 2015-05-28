package code;

import java.util.ArrayList;

import dic.Dicionario;

public class Procura {

	ArrayList<String> _dicionario;

	public Procura() {
		Dicionario d = new Dicionario();
		_dicionario = d.construirDic();
	}

	public boolean procuraBinaria(String elemento) {
		int inicio = 0;
		int fim = _dicionario.size() - 1;
		while (inicio <= fim) {
			int meio = (inicio + fim) / 2;
			int comparador = elemento.compareTo(_dicionario.get(meio));
			if (comparador < 0) {
				fim = meio - 1;
			} else if (comparador > 0) {
				inicio = meio + 1;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean procuraSequencial(String elemento) {
		for (int i = 0; i < _dicionario.size(); i++) {
			if (elemento.equals(_dicionario.get(i))) {
				return true;
			}
		}
		return false;
	}
}
