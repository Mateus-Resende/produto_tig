package dic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Dicionario {
	FileReader _leitorArquivos;
	BufferedReader _leitorBuffer;
	public Dicionario() {
		try {
			_leitorArquivos = new FileReader("/Users/mmresende/Documents/workspace/Produto_TIG_I/src/corncob_lowercase.txt");
			_leitorBuffer = new BufferedReader(_leitorArquivos);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public ArrayList<String> construirDic(){
		ArrayList<String> dic = new ArrayList<String>();
		try {
			dic.add(_leitorBuffer.readLine());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return dic;
	}
	
	public void fecharArquivo(){
		try {
			_leitorArquivos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			_leitorBuffer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
