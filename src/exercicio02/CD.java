package exercicio02;

public class CD extends Produto {
	private int numerodeFaixas;
	
	

	public CD(String nome, double preco, int numerodeFaixas){
		super(nome, preco);
		
		this.numerodeFaixas = numerodeFaixas;
	}

	public int getNumeroDeFaixas() {
		return numerodeFaixas;
	}

	public void setDuracao(int numerodeFaixas) {
		this.numerodeFaixas = numerodeFaixas;
	}
	
	@Override
	public String toString() {
		
		String msg = "\nCD: \n" + 
                "Número de Faixas: " + this.getNumeroDeFaixas() +        
                super.toString();
	return msg;
	}

}
