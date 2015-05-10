package code;

import java.util.ArrayList;

import dic.Dicionario;

public class Driver {

	public static void main(String[] args) {
		Dicionario dic = new Dicionario();
		ArrayList<String> palavras = dic.construirDic();
		System.out.println(palavras.get(0));
		System.out.println(palavras.get(palavras.size()-1));

	}

}
