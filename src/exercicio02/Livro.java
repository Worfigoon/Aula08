package exercicio02;

public class Livro extends Produto{
	

	private String autor;
	
	public Livro(String nome, double preco, String autor){
		super(nome, preco);
		
		this.autor = autor;
		
	}
	
	public String getAutor(){
		return autor;
	}
	
	public void setAutor(String autor){
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		String msg = "\nLivro: \n" + 
	                 "Autor: " + this.getAutor() +        
	                 super.toString();
		return msg;
	}
	

}
