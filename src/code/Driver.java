package code;

public class Driver {

	public static void main(String[] args) {
		Procura p = new Procura();
		String[] resultado = p.procuraBinaria("aardvark");
		if (resultado[0] == null) {
			System.out.println("Foram gastos " + resultado[1] + " nanosegundos, mas a palavra não foi encontrada.");
		} else {
			System.out.println("Encontramos a palavra " + resultado[0] + " em " + resultado[1] + " nanosegundos.");
		}
		
		resultado = p.procuraSequencial("aardvark");
		if (resultado[0] == null) {
			System.out.println("Foram gastos " + resultado[1] + " nanosegundos, mas a palavra não foi encontrada.");
		} else {
			System.out.println("Encontramos a palavra " + resultado[0] + " em " + resultado[1] + " nanosegundos.");
		}
	}

}
