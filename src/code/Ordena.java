package code;

import dic.Dicionario;

public class Ordena {

	String[] _dicionario;
	Dicionario d;

	public Ordena(Dicionario dic) {
		d = dic;
		_dicionario = d.construirDic();
	}

	public String[] ordenaInsercao() {
		int j, i;
		String temp;
		for (i = 1; i < _dicionario.length; i++) {
			temp = _dicionario[i];
			for (j = i - 1; j >= 0 && temp.compareTo(_dicionario[j]) < 0; j--) {
				_dicionario[j+1] = _dicionario[j];
			}
			_dicionario[1+j] = temp;
		}
		return _dicionario;
	}

	public String[] ordenaSelecao() {

		return _dicionario;
	}

	public String[] ordenaQuickSort() {

		return _dicionario;
	}

	public boolean embaralhaPalavras() {

		return false;
	}
	
	public int getWord(String s) {
		Procura p = new Procura(d);
		return p.procuraBinaria(s);
	}

}
