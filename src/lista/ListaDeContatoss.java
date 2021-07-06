package lista;

import java.util.ArrayList;
import java.util.Locale;

public class ListaDeContatoss {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		
		ArrayList<String> contato = new ArrayList<>();
		
		contato.add("Gustavo");
		contato.add("Bruna");
		contato.add("Caio");
		contato.add("Brenda");
		//adicionando nomes com o contato.add	
		
		contato.size(); // aqui, mostra o total de nomes registrado
		
		//contato.remove(1) com esse cod, tu pode remover um dado na posição indicada no parâmetro(ali seria o Gustavo no caso)
				
		
		for(String nome : contato) {
			System.out.println(nome);
		}
		
		System.out.println(contato.size()); //mostra a quantidade de nomes cadastrados
		
		
		
	}

}
