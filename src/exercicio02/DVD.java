package exercicio02;

public class DVD extends Produto{
	private int duracao;
	
	public DVD(String nome, double preco, int duracao){
		super(nome, preco);
		
		this.duracao = duracao;
	}
	
	public int getDuracao(){
		return duracao;
	}
	
	public void setDuracao(int duracao){
		this.duracao = duracao;
	}
	
	public String toString() {
		
		String msg = "\nDVD: \n" + 
                "Número de Faixas: " + this.getDuracao() +        
                super.toString();
	return msg;
	}


}
