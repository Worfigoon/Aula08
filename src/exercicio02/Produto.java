package exercicio02;

public class Produto {
	
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public String toString(){
		String msg = " Nome: " + this.getNome()
				   + " Preço: " + this.getPreco();
		
		return msg;
	}
	

}
