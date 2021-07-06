package lista;

import java.util.ArrayList;
import java.util.Locale;

public class ListaCont {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		ArrayList<Contato> contatos = new ArrayList();

		Contato contato1 = new Contato("Gustavo", "gustavojr@gmail.com", "983239898");
		Contato contato2 = new Contato("Bruna", "bruno@gmail.com", "21313213");
		Contato contato3 = new Contato("Caio", "caio@gmail.com", "9899898");
		Contato contato4 = new Contato("Maria", "maria@gmail.com", "91119899898");
		
		contatos.add(contato1);
		contatos.add(contato2);
		contatos.add(contato3);
		contatos.add(contato4);
		
		contatos.size();
		System.out.println(contatos.size());
		
		for(Contato c : contatos) {
			System.out.println(c.toString());
		}
	}
}
