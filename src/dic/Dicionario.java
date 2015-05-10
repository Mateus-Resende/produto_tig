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
			_leitorArquivos = new FileReader("src/corncob_lowercase.txt");
			_leitorBuffer = new BufferedReader(_leitorArquivos);
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
