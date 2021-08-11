package collections;

import java.util.ArrayList;

public class Opcoes {

	public static void main(String[] args) {
		String opc1 = "PS1";
		String opc2 = "PS2";
		String opc3 = "PS3";
		String opc4 = "PS4";
		String opc5 = "PS5";
		
		ArrayList<String> opcoes = new ArrayList<>();
		opcoes.add(opc1);
		opcoes.add(opc2);
		opcoes.add(opc3);
		opcoes.add(opc4);
		opcoes.add(opc5);

		
		opcoes.remove(0);

		
		for(String i: opcoes) {
			System.out.println("Essas são as opções da Playstation: " + i);
		}
		

	}

}
