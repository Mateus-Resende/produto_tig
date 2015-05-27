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
		
		
		return (Boolean) null;
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
