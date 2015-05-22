package exercicio03;

public class Animal {
	private String nome, raca;
	
	public Animal(String nome){
		this.nome = nome;
		
	}
	
	public Animal(){
		
	}
	
	public String caminha(){
		String msg = "Caminhando";
		return caminha();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

}
