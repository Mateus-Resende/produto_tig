package code;

import java.util.ArrayList;
import java.util.HashMap;

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

	public boolean procuraSequencial(String elemento) {

		long startTime = System.nanoTime();
		HashMap<Boolean, Long> resposta = new HashMap<Boolean, Long>();
		Boolean resultado = false;
		for (int i = 0; i < _dicionario.size() - 1; i++) {
			if (elemento.equals(_dicionario.get(i))) {
				resultado = true;
				break;
			}
		}

		long endTime = System.nanoTime();
		Long duration = (endTime - startTime);
		resposta.put(resultado, duration);

		return true;
	}
}
