package exercicio02;

import java.util.LinkedList;

public class Loja {

	
	public static void main(String[] args) {
		
		LinkedList<Produto> cesta = new LinkedList<Produto>();
		
		Livro l1 = new Livro("50 Tons de Cinza", 25.00, "E.L. James");
		CD cd1 = new CD("AC/DC", 30.00, 20);
		DVD dvd1 = new DVD("Man of Steel", 40.00, 148);
		DVD dvd2 = new DVD("The Avengers", 35.00, 143);
		Livro l2 = new Livro("Eram os Deuses Astronautas", 20.00, "Erich von Däniken");
		
		cesta.add(l1);
		cesta.add(cd1);
		cesta.add(dvd1);
		cesta.add(dvd2);
		cesta.add(l2);
		
		for (int i=0; i<cesta.size(); i++){
			System.out.println(cesta.get(i));
		}
		
		
		
		  


	
		

	}
}
