package code;

import java.util.ArrayList;

import dic.Dicionario;

public class Procura {

	ArrayList<String> _dicionario;

	public Procura() {
		Dicionario d = new Dicionario();
		_dicionario = d.construirDic();
	}

	public String[] procuraBinaria(String elemento) {
		long startTime = System.nanoTime();

		int inicio = 0;
		int fim = _dicionario.size() - 1;
		int meio = (inicio + fim) / 2;
		int comparador;
		String palavraDoMeio = _dicionario.get(meio);

		while (inicio <= fim) {
			comparador = elemento.compareTo(palavraDoMeio);
			meio = (inicio + fim) / 2;
			if (comparador < 0) {
				fim = meio - 1;

			} else if (comparador > 0) {
				inicio = meio + 1;

			} else {
				palavraDoMeio = _dicionario.get(meio);
			}
		}

		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		String[] resultado = new String[2];
		resultado[1] = String.valueOf(duration);
		return resultado;
	}

	public String[] procuraSequencial(String elemento) {

		long startTime = System.nanoTime();
		String[] resultado = new String[2];
		resultado[0] = "";
		for (int i = 0; i < _dicionario.size() - 1; i++) {
			if (elemento.equals(_dicionario.get(i))) {
				resultado[0] = _dicionario.get(i);
				break;
			}
		}

		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		resultado[1] = String.valueOf(duration);

		return resultado;
	}
}
