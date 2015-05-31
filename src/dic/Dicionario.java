package dic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Dicionario extends ArrayList<String> {
	FileReader _leitorArquivos;
	BufferedReader _leitorBuffer;
	public Dicionario() {
		try {
			_leitorArquivos = new FileReader("src/corncob_lowercase.txt");
			_leitorBuffer = new BufferedReader(_leitorArquivos);
			construirDic();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public ArrayList<String> construirDic(){
		ArrayList<String> dic = new ArrayList<String>();
		String s;
		try {
			while ((s = _leitorBuffer.readLine()) != null) {
				dic.add(s);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		fecharArquivo();
		return dic;
	}
	
	public void fecharArquivo(){
		try {
			_leitorArquivos.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			_leitorBuffer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
